<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>这是用户主页</title>
    <%@ include file="/WEB-INF/jsp/include/meta.jsp" %>
    <style>
    html, body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }
    .logo
    {
        font-family:"微软雅黑",	"Helvetica Neue",​Helvetica,​Arial,​sans-serif;
        font-size:18px;font-weight:bold;color:#444;        
        cursor:default;
        position:absolute;top:9px;left:15px;        
        line-height:25px;
    }
    .logo img{
        vertical-align: text-bottom;
    }
    .logo span{
        padding: 0 10px ;
        border-left: 1px solid #ccc;
        margin-left: 10px;
    }
    .topNav
    {
        position:absolute;right:8px;top:10px;        
        font-size:12px;
        line-height:25px;
    }
    .topNav a
    {
        text-decoration:none;
        color:#222;
        font-weight:normal;
        font-size:12px;
        line-height:25px;
        margin-left:3px;
        margin-right:3px;
    }
    .topNav a:hover
    {
        text-decoration:underline;
        color:Blue;
    }   
     .mini-layout-region-south img
    {
        vertical-align:top;
    }
    </style>
</head>
<body>
	<div class="mini-layout" style="width:100%;height:100%;">
    <div title="north" region="north" class="app-header" bodyStyle="overflow:hidden;" height="50" showHeader="false" showSplit="false">
        <div class="logo">
<%--             <img src="${cfs}/img/yfyf-logo.png" height="30px;" alt="" /> --%>
            <span>我的主页</span>
        </div>

        <div class="topNav">    
           	 欢迎您，${user.userName }
            <a href="${shengshen }/logout">退出</a>
        </div>
    </div>
    <div region="west" showHeader="true" bodyStyle="padding-left:1px;" showSplitIcon="true" width="160" minWidth="100" maxWidth="350">
        <ul id="demoTree" class="mini-tree" showTreeIcon="true" style="width:100%;height:100%;"
             enableHotTrack="true">
             <c:forEach var="menuVO" items="${menuVOList }">             
	             <li>
				    <span expanded="true">${menuVO.pMenuName }</span>
				    <ul> 
	    			    <c:forEach var="menu" items="${menuVO.menuList }">
	    			    <li><a href="${shengshen}${menu.menuUrl}" target="main">${menu.menuName }</a></li>
	    			    </c:forEach>
				    </ul>
			    </li>  
             </c:forEach>
        </ul>        
    </div>
    <div title="center" region="center" style="border:0;">
		<iframe src="${shengshen}${menuVOList[0].menuList[0].menuUrl}?menuId=${menuVOList[0].menuList[0].menuId}" id="mainframe" frameborder="0" name="main" style="width:100%;height:100%;" border="0"></iframe>        
    </div>     
</div>
</body>
</html>