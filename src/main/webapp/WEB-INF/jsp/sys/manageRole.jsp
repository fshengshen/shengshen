<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <%@ include file="/WEB-INF/jsp/include/meta.jsp" %>
           <style type="text/css">
    html, body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }    
    </style>
<title>角色管理</title>
</head>
<body>
<!-- 展示角色，添加角色，角色添加菜单功能 -->
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="key" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>   
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    <div id="datagrid1" class="mini-datagrid" style="width:100%;height:100%;" allowResize="true"
        url="${shengshen }/sys/getManageRoleList"  idField="id" multiSelect="true" >
        <div property="columns">
            <div type="indexcolumn"></div>       
            <div type="checkcolumn"></div>
            <div field="roleId" width="120" headerAlign="center" allowSort="true">角色Id</div>  
            <div field="roleName" width="120" headerAlign="center" allowSort="true">角色名称</div>        
        </div>
    </div>

    

    <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();

        
        function add() {
            
mini.open({
    url: bootPATH + "../sys/toAddOrUpdateRole",
    title: "新增角色", width: 600, height: 400,
    onload: function () {
        var iframe = this.getIFrameEl();
        var data = { action: "new"};
//         iframe.contentWindow.SetData(data);
    },
    ondestroy: function (action) {

        grid.reload();
    }
});
        }
        function edit() {
         
            var row = grid.getSelected();
            if (row) {
            var roleId = row.roleId;
            var roleName = row.roleName;
                mini.open({
                    url: bootPATH + "../sys/toAddOrUpdateRole?roleId=" + roleId + "&roleName=" + roleName,
                    title: "编辑角色", width: 600, height: 400,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", id: row.id };
//                         iframe.contentWindow.SetData(data);
                        
                    },
                    ondestroy: function (action) {
                        grid.reload();
                        
                    }
                });
                
            } else {
                alert("请选中一条记录");
            }
            
        }
        function remove() {
            
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                if (confirm("确定删除选中记录？")) {
                    var ids = [];
                    for (var i = 0, l = rows.length; i < l; i++) {
                        var r = rows[i];
                        ids.push(r.roleId);
                    }
                    var id = ids.join(',');
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: "../sys/deleteRole?roleId=" + id,
                        success: function (text) {
                            grid.reload();
                        },
                        error: function () {
                        }
                    });
                }
            } else {
                alert("请选中一条记录");
            }
        }
        function search() {
            var key = mini.get("key").getValue();
            grid.load({ roleName : key });
        }
        function onKeyEnter(e) {
            search();
        }
        /////////////////////////////////////////////////
//         function onBirthdayRenderer(e) {
//             var value = e.value;
//             if (value) return mini.formatDate(value, 'yyyy-MM-dd');
//             return "";
//         }
//         function onMarriedRenderer(e) {
//             if (e.value == 1) return "是";
//             else return "否";
//         }
//         var Genders = [{ id: 1, text: '男' }, { id: 2, text: '女'}];        
//         function onGenderRenderer(e) {
//             for (var i = 0, l = Genders.length; i < l; i++) {
//                 var g = Genders[i];
//                 if (g.id == e.value) return g.text;
//             }
//             return "";
//         }





    </script>
</body>
</html>