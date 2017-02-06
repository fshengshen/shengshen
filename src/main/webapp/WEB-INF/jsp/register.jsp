<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <%@ include file="/WEB-INF/jsp/include/meta.jsp" %>
    <style type="text/css">
    body
    {
        width:100%;height:100%;margin:0;overflow:hidden;
    }
    </style>
</head>
<body>
<div id="registerWindow" class="mini-window" title="注册新用户" style="width:300px;height:300px;" 
   showModal="true" showCloseButton="false">

    <div id="registerForm" style="padding:15px;padding-top:10px;">
		<table class="form-table" border="0" cellpadding="1" cellspacing="2">
		     <tr>
		         <td class="form-label" style="width:100px;">昵称：</td>  
		         <td style="width:150px">
		            <input name="nickName" class="mini-textbox" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;" required="true">用户名：</td>  
		         <td style="width:150px">
		            <input name="userName" class="mini-textbox" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;" required="true">密码：</td>  
		         <td style="width:150px">
		            <input name="passwd" class="mini-password" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;" required="true">密码确认：</td>  
		         <td style="width:150px">
		            <input name="passwd2" class="mini-password" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;">真实姓名：</td>  
		         <td style="width:150px">
		            <input name="realName" class="mini-textbox" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;" >联系方式：</td>  
		         <td style="width:150px">
		            <input name="mobileNo" class="mini-textbox" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;" required="true">邮箱：</td>  
		         <td style="width:150px">
		            <input name="securityEmail" class="mini-textbox" /> </td>
		     </tr>
		     <tr>
		         <td class="form-label" style="width:100px;">性别：</td>
		         <td >
		             <input name="sex" class="mini-radiobuttonlist" data="[{id: 1, text: '男'}, {id: 2, text: '女'}]"/> </td>
		     </tr>
		     <tr>                
                <td align="center" colspan="2" style="padding-top:5px;">
                    <a onclick="onRegisterClick" class="mini-button" style="width:60px;">注册</a>
                    <a onclick="onResetClick" class="mini-button" style="width:60px;">重置</a>
                    <a href="javascript:history.go(-1);" class="mini-button" style="width:60px;">返回</a>
                </td>
            </tr>
		</table> 
    </div>

</div>
<script type="text/javascript">
	mini.parse();
	
	var loginWindow = mini.get("registerWindow");
	loginWindow.show();
	
	function onRegisterClick(e) {
        var form = new mini.Form("#registerWindow");

        form.validate();
        if (form.isValid() == false) return;
        var data = form.getData();      //获取表单多个控件的数据
//         var json = mini.encode(data);   //序列化成JSON
        $.ajax({
            url: "${shengshen}/register",
            type: "post",
            data: data,
            success: function (json) {
            	var text = mini.decode(json);
				if (text.status == 1) {
	                window.location = "${shengshen}/newLogin";
				} else {
					location.reload(true);
				};
            }
        });
    }
    function onResetClick(e) {
        var form = new mini.Form("#registerWindow");
        form.clear();
    }
//     function onBackClick(e){
    	
//     }
</script>
</body>
</html>