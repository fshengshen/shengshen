package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fyn.common.util.SystemResource;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("shengshen");
      _jspx_th_c_set_0.setValue(SystemResource.getConfig("domain.shengshen"));
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/favicon.ico\" rel=\"shortcut icon\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/common.css\">\r\n");
      out.write("<link rel=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor/default.css\" type=\"text/css\" href=\"js/kindeditor/default.css\">\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.6.2.min.js\"  type=\"text/javascript\" ></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/boot.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/common.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cfs}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/lib/comment.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/miniui/miniui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor/kindeditor-all-min.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/kindeditor/zh-CN.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tdomain = {};\r\n");
      out.write("\tdomain.shengshen = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body\r\n");
      out.write("    {\r\n");
      out.write("        width:100%;height:100%;margin:0;overflow:hidden;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"registerWindow\" class=\"mini-window\" title=\"注册新用户\" style=\"width:300px;height:300px;\" \r\n");
      out.write("   showModal=\"true\" showCloseButton=\"false\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"registerForm\" style=\"padding:15px;padding-top:10px;\">\r\n");
      out.write("\t\t<table class=\"form-table\" border=\"0\" cellpadding=\"1\" cellspacing=\"2\">\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\">昵称：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"nickName\" class=\"mini-textbox\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\" required=\"true\">用户名：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"userName\" class=\"mini-textbox\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\" required=\"true\">密码：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"passwd\" class=\"mini-password\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\" required=\"true\">密码确认：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"passwd2\" class=\"mini-password\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\">真实姓名：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"realName\" class=\"mini-textbox\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\" >联系方式：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"mobileNo\" class=\"mini-textbox\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\" required=\"true\">邮箱：</td>  \r\n");
      out.write("\t\t         <td style=\"width:150px\">\r\n");
      out.write("\t\t            <input name=\"securityEmail\" class=\"mini-textbox\" /> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t         <td class=\"form-label\" style=\"width:100px;\">性别：</td>\r\n");
      out.write("\t\t         <td >\r\n");
      out.write("\t\t             <input name=\"sex\" class=\"mini-radiobuttonlist\" data=\"[{id: 1, text: '男'}, {id: 2, text: '女'}]\"/> </td>\r\n");
      out.write("\t\t     </tr>\r\n");
      out.write("\t\t     <tr>                \r\n");
      out.write("                <td align=\"center\" colspan=\"2\" style=\"padding-top:5px;\">\r\n");
      out.write("                    <a onclick=\"onRegisterClick\" class=\"mini-button\" style=\"width:60px;\">注册</a>\r\n");
      out.write("                    <a onclick=\"onResetClick\" class=\"mini-button\" style=\"width:60px;\">重置</a>\r\n");
      out.write("                    <a href=\"javascript:history.go(-1);\" class=\"mini-button\" style=\"width:60px;\">返回</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t</table> \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tmini.parse();\r\n");
      out.write("\t\r\n");
      out.write("\tvar loginWindow = mini.get(\"registerWindow\");\r\n");
      out.write("\tloginWindow.show();\r\n");
      out.write("\t\r\n");
      out.write("\tfunction onRegisterClick(e) {\r\n");
      out.write("        var form = new mini.Form(\"#registerWindow\");\r\n");
      out.write("\r\n");
      out.write("        form.validate();\r\n");
      out.write("        if (form.isValid() == false) return;\r\n");
      out.write("        var data = form.getData();      //获取表单多个控件的数据\r\n");
      out.write("//         var json = mini.encode(data);   //序列化成JSON\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/register\",\r\n");
      out.write("            type: \"post\",\r\n");
      out.write("            data: data,\r\n");
      out.write("            success: function (json) {\r\n");
      out.write("            \tvar text = mini.decode(json);\r\n");
      out.write("\t\t\t\tif (text.status == 1) {\r\n");
      out.write("\t                window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/newLogin\";\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tlocation.reload(true);\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function onResetClick(e) {\r\n");
      out.write("        var form = new mini.Form(\"#registerWindow\");\r\n");
      out.write("        form.clear();\r\n");
      out.write("    }\r\n");
      out.write("//     function onBackClick(e){\r\n");
      out.write("    \t\r\n");
      out.write("//     }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
