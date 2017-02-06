package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fyn.common.util.SystemResource;

public final class _500_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- <title>系统错误页-医蜂云服</title> -->\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- \t<div id=\"main\"> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t<div class=\"main-r\"> -->\r\n");
      out.write("<!-- \t\t\t<div class=\"m-cover\"></div> -->\r\n");
      out.write("<!-- \t\t\t<div class=\"main-container\"> -->\r\n");
      out.write("<!-- \t\t\t\t<div class=\"m-cover\"></div> -->\r\n");
      out.write("<!-- \t\t\t\t<div class=\"error-container\"> -->\r\n");
      out.write("<!-- \t\t\t\t\t<div class=\"error-content\"> -->\r\n");
      out.write("\t\t\t\t\t\t<p class=\"p1\">服务器繁忙，请再试一次</p>\r\n");
      out.write("<!-- \t\t\t\t\t\t<p class=\"p2\">如有疑问，请咨询400-052-5256，我们将第一时间处理</p> -->\r\n");
      out.write("<!-- \t\t\t\t\t</div> -->\r\n");
      out.write("<!-- \t\t\t\t</div> -->\r\n");
      out.write("<!-- \t\t\t</div> -->\r\n");
      out.write("<!-- \t\t</div> -->\r\n");
      out.write("<!-- \t\t<div style=\"clear: both;\"></div> -->\r\n");
      out.write("<!-- \t</div> -->\r\n");
      out.write("\r\n");
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
}
