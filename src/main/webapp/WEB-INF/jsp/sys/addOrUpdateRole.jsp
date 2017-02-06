<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <%@ include file="/WEB-INF/jsp/include/meta.jsp" %>
<title>添加角色</title>
</head>
<body>
<form action="${shengshen }/sys/addOrUpdateRole">
	<input type="hidden" value="${role.roleId }" name="roleId" id="roleId"/>
	角色名称<input type="text" value="${role.roleName }" name="roleName" id="roleName"/><br>
	选择该角色所拥有权限：
	<ul id="tree1" class="mini-tree" url="${shengshen }/sys/getMenuTreeList" 
	       style="width:300px;padding:5px;" showTreeIcon="false" textField="text" 
	       idField="id" value="base" expandOnNodeClick="true" ShowCheckBox="true" >        
	</ul>
	<input type="button" onclick="commit()" value="提交">
</form>
<script type="text/javascript">
function commit() {    
    var tree = mini.get("tree1");
    var menuIds = tree.getValue(false);
    var roleId =  $("#roleId").val();
    var roleName =  $("#roleName").val();
//     alert("Checked Nodes : " + nodes.length);
//            grid.loading("操作中，请稍后......");
           $.ajax({
               url: "../sys/addOrUpdateRole",
               data:{menuIds:menuIds,roleId:roleId,roleName:roleName},
               dataType: 'json',
               success: function (text) {
//                    grid.reload();
               },
               error: function () {
               }
           });
}
</script>
</body>
</html>