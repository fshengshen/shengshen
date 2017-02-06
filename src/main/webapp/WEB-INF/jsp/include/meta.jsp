<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="com.fyn.common.util.SystemResource"%>
<%@ taglib prefix="fun" uri="/aek-functions"%>
<%@ taglib prefix="tag" uri="/aek-tags"%>
<c:set var="shengshen" value='<%=SystemResource.getConfig("domain.shengshen")%>' />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<link href="${shengshen}/img/favicon.ico" rel="shortcut icon">
<link rel="stylesheet" href="${shengshen}/css/common.css">
<link rel="${shengshen}/js/kindeditor/default.css" type="text/css" href="js/kindeditor/default.css">
<script src="${shengshen}/js/jquery-1.6.2.min.js"  type="text/javascript" ></script>
<script src="${shengshen}/js/boot.js" type="text/javascript"></script>
<script src="${shengshen}/js/lib/common.js" type="text/javascript"></script>
<!--<script src="${cfs}/js/lib/comment.js" type="text/javascript"></script>-->
<script src="${shengshen}/js/miniui/miniui.js" type="text/javascript"></script>
<script src="${shengshen}/js/kindeditor/kindeditor-all-min.js"  type="text/javascript"></script>
<script src="${shengshen}/js/kindeditor/zh-CN.js" type="text/javascript"></script>
<script type="text/javascript">
	domain = {};
	domain.shengshen = '${shengshen}';
</script>