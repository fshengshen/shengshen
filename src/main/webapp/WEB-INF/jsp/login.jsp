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
<div id="loginWindow" class="mini-window" title="用户登录" style="width:350px;height:165px;" 
   showModal="true" showCloseButton="false">

    <div id="loginForm" style="padding:15px;padding-top:10px;">
        <table >
            <tr>
                <td style="width:60px;"><label for="userName$text">帐号：</label></td>
                <td>
                    <input id="userName" name="userName" onvalidation="onUserNameValidation" class="mini-textbox" required="true" style="width:150px;"/>
                </td>    
            </tr>
            <tr>
                <td style="width:60px;"><label for="password$text">密码：</label></td>
                <td>
                    <input id="password" name="password" onvalidation="onPwdValidation" class="mini-password" requiredErrorText="密码不能为空" required="true" style="width:150px;" onenter="onLoginClick"/>
                    &nbsp;&nbsp;<a href="#" >忘记密码?</a>
                </td>
            </tr> 
            <tr>                            
                <td colspan="2" style="width:60px;"><c:if test="${t != null}"><a style="color:red">用户名或密码错误</a></c:if></td>                
            </tr>           
            <tr>
                <td></td>
                <td style="padding-top:5px;">
                    <a onclick="onLoginClick" class="mini-button" style="width:60px;">登录</a>
                    <a onclick="onRegisterClick" class="mini-button" style="width:60px;">注册</a>
                </td>
            </tr>
        </table>
    </div>

</div>
<%-- <form id="loginOrg" class="form" method="post" action="${shengshen}/login"> --%>
<!-- 	<input type="text" name="userName"> -->
<!-- 	<input type="password" name="password"> -->
<!-- 	<input type="submit" value="登录"> -->
<!-- </form> -->
<script type="text/javascript">
        mini.parse();

        var loginWindow = mini.get("loginWindow");
        loginWindow.show();

        function onLoginClick(e) {
            var form = new mini.Form("#loginWindow");
            var data = form.getData();
//             debugger;
            form.validate();
            if (form.isValid() == false) return;

//             loginWindow.hide();
//             mini.loading("正在验证用户信息...", "正在登录");
//             setTimeout(function () {
//                 window.location = "${shengshen}/login?userName="+data.userName+"&password="+data.password;
//             }, 500);
            $.ajax({
            	  type: 'POST',
            	  url: "${shengshen}/login",
            	  data: data,
            	  success: function(json){
            		  window.location = "${shengshen}/newLogin";
                  }
//             	  dataType: json
            	});
        }
        function onRegisterClick(e) {
            window.location = "${shengshen}/toRegister";
        }
        /////////////////////////////////////
//         function isEmail(s) {
//             if (s.search(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/) != -1)
//                 return true;
//             else
//                 return false;
//         }
        function onUserNameValidation(e) {
//             if (e.isValid) {
//                 if (isEmail(e.value) == false) {
//                     e.errorText = "必须输入邮件地址";
//                     e.isValid = false;
//                 }
//             }
        }
        function onPwdValidation(e) {
            if (e.isValid) {
                if (e.value.length < 5) {
                    e.errorText = "密码不能少于5个字符";
                    e.isValid = false;
                }
            }
        }
    </script>
</body>
</html>
