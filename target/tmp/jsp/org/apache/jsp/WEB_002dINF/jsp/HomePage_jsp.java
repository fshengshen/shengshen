package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fyn.common.util.SystemResource;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\t<title>这是用户主页</title>\r\n");
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
      out.write("    <style>\r\n");
      out.write("    html, body{\r\n");
      out.write("        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;\r\n");
      out.write("    }\r\n");
      out.write("    .logo\r\n");
      out.write("    {\r\n");
      out.write("        font-family:\"微软雅黑\",\t\"Helvetica Neue\",​Helvetica,​Arial,​sans-serif;\r\n");
      out.write("        font-size:18px;font-weight:bold;color:#444;        \r\n");
      out.write("        cursor:default;\r\n");
      out.write("        position:absolute;top:9px;left:15px;        \r\n");
      out.write("        line-height:25px;\r\n");
      out.write("    }\r\n");
      out.write("    .logo img{\r\n");
      out.write("        vertical-align: text-bottom;\r\n");
      out.write("    }\r\n");
      out.write("    .logo span{\r\n");
      out.write("        padding: 0 10px ;\r\n");
      out.write("        border-left: 1px solid #ccc;\r\n");
      out.write("        margin-left: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    .topNav\r\n");
      out.write("    {\r\n");
      out.write("        position:absolute;right:8px;top:10px;        \r\n");
      out.write("        font-size:12px;\r\n");
      out.write("        line-height:25px;\r\n");
      out.write("    }\r\n");
      out.write("    .topNav a\r\n");
      out.write("    {\r\n");
      out.write("        text-decoration:none;\r\n");
      out.write("        color:#222;\r\n");
      out.write("        font-weight:normal;\r\n");
      out.write("        font-size:12px;\r\n");
      out.write("        line-height:25px;\r\n");
      out.write("        margin-left:3px;\r\n");
      out.write("        margin-right:3px;\r\n");
      out.write("    }\r\n");
      out.write("    .topNav a:hover\r\n");
      out.write("    {\r\n");
      out.write("        text-decoration:underline;\r\n");
      out.write("        color:Blue;\r\n");
      out.write("    }   \r\n");
      out.write("     .mini-layout-region-south img\r\n");
      out.write("    {\r\n");
      out.write("        vertical-align:top;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"mini-layout\" style=\"width:100%;height:100%;\">\r\n");
      out.write("    <div title=\"north\" region=\"north\" class=\"app-header\" bodyStyle=\"overflow:hidden;\" height=\"50\" showHeader=\"false\" showSplit=\"false\">\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("\r\n");
      out.write("            <span>我的主页</span>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"topNav\">    \r\n");
      out.write("           \t 欢迎您，");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\">退出</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div region=\"west\" showHeader=\"true\" bodyStyle=\"padding-left:1px;\" showSplitIcon=\"true\" width=\"160\" minWidth=\"100\" maxWidth=\"350\">\r\n");
      out.write("        <ul id=\"demoTree\" class=\"mini-tree\" showTreeIcon=\"true\" style=\"width:100%;height:100%;\"\r\n");
      out.write("             enableHotTrack=\"true\">\r\n");
      out.write("             ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div title=\"center\" region=\"center\" style=\"border:0;\">\r\n");
      out.write("\t\t<iframe src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuVOList[0].menuList[0].menuUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("?menuId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuVOList[0].menuList[0].menuId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"mainframe\" frameborder=\"0\" name=\"main\" style=\"width:100%;height:100%;\" border=\"0\"></iframe>        \r\n");
      out.write("    </div>     \r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("menuVO");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuVOList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("             \r\n");
          out.write("\t             <li>\r\n");
          out.write("\t\t\t\t    <span expanded=\"true\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuVO.pMenuName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("\t\t\t\t    <ul> \r\n");
          out.write("\t    \t\t\t    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t    </ul>\r\n");
          out.write("\t\t\t    </li>  \r\n");
          out.write("             ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("menu");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menuVO.menuList }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t    \t\t\t    <li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shengshen}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.menuUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" target=\"main\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menu.menuName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("\t    \t\t\t    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
