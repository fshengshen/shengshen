package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fyn.common.util.SystemResource;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/jsp/include/meta.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/fyn-functions.tld");
    _jspx_dependants.add("/WEB-INF/tlds/fyn-tags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<div id=\"loginWindow\" class=\"mini-window\" title=\"用户登录\" style=\"width:350px;height:165px;\" \r\n");
      out.write("   showModal=\"true\" showCloseButton=\"false\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"loginForm\" style=\"padding:15px;padding-top:10px;\">\r\n");
      out.write("        <table >\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"width:60px;\"><label for=\"userName$text\">帐号：</label></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input id=\"userName\" name=\"userName\" onvalidation=\"onUserNameValidation\" class=\"mini-textbox\" required=\"true\" style=\"width:150px;\"/>\r\n");
      out.write("                </td>    \r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td style=\"width:60px;\"><label for=\"password$text\">密码：</label></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input id=\"password\" name=\"password\" onvalidation=\"onPwdValidation\" class=\"mini-password\" requiredErrorText=\"密码不能为空\" required=\"true\" style=\"width:150px;\" onenter=\"onLoginClick\"/>\r\n");
      out.write("                    &nbsp;&nbsp;<a href=\"#\" >忘记密码?</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr> \r\n");
      out.write("            <tr>                            \r\n");
      out.write("                <td colspan=\"2\" style=\"width:60px;\">");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("</td>                \r\n");
      out.write("            </tr>           \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                <td style=\"padding-top:5px;\">\r\n");
      out.write("                    <a onclick=\"onLoginClick\" class=\"mini-button\" style=\"width:60px;\">登录</a>\r\n");
      out.write("                    <a onclick=\"onRegisterClick\" class=\"mini-button\" style=\"width:60px;\">注册</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- \t<input type=\"text\" name=\"userName\"> -->\r\n");
      out.write("<!-- \t<input type=\"password\" name=\"password\"> -->\r\n");
      out.write("<!-- \t<input type=\"submit\" value=\"登录\"> -->\r\n");
      out.write("<!-- </form> -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        mini.parse();\r\n");
      out.write("\r\n");
      out.write("        var loginWindow = mini.get(\"loginWindow\");\r\n");
      out.write("        loginWindow.show();\r\n");
      out.write("\r\n");
      out.write("        function onLoginClick(e) {\r\n");
      out.write("            var form = new mini.Form(\"#loginWindow\");\r\n");
      out.write("            var data = form.getData();\r\n");
      out.write("//             debugger;\r\n");
      out.write("            form.validate();\r\n");
      out.write("            if (form.isValid() == false) return;\r\n");
      out.write("\r\n");
      out.write("//             loginWindow.hide();\r\n");
      out.write("//             mini.loading(\"正在验证用户信息...\", \"正在登录\");\r\n");
      out.write("//             setTimeout(function () {\r\n");
      out.write("//                 window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login?userName=\"+data.userName+\"&password=\"+data.password;\r\n");
      out.write("//             }, 500);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("            \t  type: 'POST',\r\n");
      out.write("            \t  url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login\",\r\n");
      out.write("            \t  data: data,\r\n");
      out.write("            \t  success: function(json){\r\n");
      out.write("            \t\t  window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/newLogin\";\r\n");
      out.write("                  }\r\n");
      out.write("//             \t  dataType: json\r\n");
      out.write("            \t});\r\n");
      out.write("        }\r\n");
      out.write("        function onRegisterClick(e) {\r\n");
      out.write("            window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/toRegister\";\r\n");
      out.write("        }\r\n");
      out.write("        /////////////////////////////////////\r\n");
      out.write("//         function isEmail(s) {\r\n");
      out.write("//             if (s.search(/^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$/) != -1)\r\n");
      out.write("//                 return true;\r\n");
      out.write("//             else\r\n");
      out.write("//                 return false;\r\n");
      out.write("//         }\r\n");
      out.write("        function onUserNameValidation(e) {\r\n");
      out.write("//             if (e.isValid) {\r\n");
      out.write("//                 if (isEmail(e.value) == false) {\r\n");
      out.write("//                     e.errorText = \"必须输入邮件地址\";\r\n");
      out.write("//                     e.isValid = false;\r\n");
      out.write("//                 }\r\n");
      out.write("//             }\r\n");
      out.write("        }\r\n");
      out.write("        function onPwdValidation(e) {\r\n");
      out.write("            if (e.isValid) {\r\n");
      out.write("                if (e.value.length < 5) {\r\n");
      out.write("                    e.errorText = \"密码不能少于5个字符\";\r\n");
      out.write("                    e.isValid = false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a style=\"color:red\">用户名或密码错误</a>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
