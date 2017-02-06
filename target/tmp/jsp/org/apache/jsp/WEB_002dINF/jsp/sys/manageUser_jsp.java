package org.apache.jsp.WEB_002dINF.jsp.sys;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fyn.common.util.SystemResource;

public final class manageUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
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
      out.write("           <style type=\"text/css\">\r\n");
      out.write("    html, body{\r\n");
      out.write("        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;\r\n");
      out.write("    }    \r\n");
      out.write("    </style>\r\n");
      out.write("<title>用户管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 展示用户，添加用户，用户添加角色功能 -->\r\n");
      out.write("        <div class=\"mini-toolbar\" style=\"border-bottom:0;padding:0px;\">\r\n");
      out.write("            <table style=\"width:100%;\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td style=\"width:100%;\">\r\n");
      out.write("                        <a class=\"mini-button\" iconCls=\"icon-add\" onclick=\"add()\">增加</a>\r\n");
      out.write("                        <a class=\"mini-button\" iconCls=\"icon-add\" onclick=\"edit()\">编辑</a>\r\n");
      out.write("                        <a class=\"mini-button\" iconCls=\"icon-remove\" onclick=\"remove()\">删除</a>       \r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td style=\"white-space:nowrap;\">\r\n");
      out.write("                        <input id=\"key\" class=\"mini-textbox\" emptyText=\"请输入姓名\" style=\"width:150px;\" onenter=\"onKeyEnter\"/>   \r\n");
      out.write("                        <a class=\"mini-button\" onclick=\"search()\">查询</a>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>           \r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"datagrid1\" class=\"mini-datagrid\" style=\"width:100%;height:100%;\" allowResize=\"true\"\r\n");
      out.write("        url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sys/getManageUserList\"  idField=\"id\" multiSelect=\"true\">\r\n");
      out.write("        <div property=\"columns\">\r\n");
      out.write("            <div type=\"indexcolumn\"></div>       \r\n");
      out.write("            <div type=\"checkcolumn\"></div>\r\n");
      out.write("            <div field=\"userName\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">用户名称</div>\r\n");
      out.write("            <div field=\"mobileNo\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">联系方式</div> \r\n");
      out.write("            <div field=\"securityEmail\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">密保邮箱</div> \r\n");
      out.write("            <div field=\"nickName\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">昵称</div> \r\n");
      out.write("            <div field=\"sex\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">性别</div> \r\n");
      out.write("            <div field=\"realName\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">真实姓名</div>\r\n");
      out.write("            <div field=\"birthday\" width=\"120\" headerAlign=\"center\" allowSort=\"true\">出生日期</div>         \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        mini.parse();\r\n");
      out.write("\r\n");
      out.write("        var grid = mini.get(\"datagrid1\");\r\n");
      out.write("        grid.load();\r\n");
      out.write("        </script>\r\n");
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
