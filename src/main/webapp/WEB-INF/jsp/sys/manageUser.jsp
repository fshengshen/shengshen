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
<title>用户管理</title>
</head>
<body>
<!-- 展示用户，添加用户，用户添加角色功能 -->
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
        url="${shengshen }/sys/getManageUserList"  idField="id" multiSelect="true">
        <div property="columns">
            <div type="indexcolumn"></div>       
            <div type="checkcolumn"></div>
            <div field="userName" width="120" headerAlign="center" allowSort="true">用户名称</div>
            <div field="mobileNo" width="120" headerAlign="center" allowSort="true">联系方式</div> 
            <div field="securityEmail" width="120" headerAlign="center" allowSort="true">密保邮箱</div> 
            <div field="nickName" width="120" headerAlign="center" allowSort="true">昵称</div> 
            <div field="sex" width="120" headerAlign="center" allowSort="true">性别</div> 
            <div field="realName" width="120" headerAlign="center" allowSort="true">真实姓名</div>
            <div field="birthday" width="120" headerAlign="center" allowSort="true">出生日期</div>         
        </div>
    </div>
        <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();
        </script>
</body>
</html>