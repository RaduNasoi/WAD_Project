package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <title>Xing yang</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key= AIzaSyCC0xc0jYaEdE0GYrLq1--15Pu39tTZ40U\"\n");
      out.write("  type=\"text/javascript\"></script>\n");
      out.write("        <h3>My Google Maps Demo</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <h2>Xing Yang - Restaurant cu specific</h2>\n");
      out.write("        <br>\n");
      out.write("        <img src=\"http://metropotam.ro/mediaserver/2/w/5.jpg\"/>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"Registration.jsp\"><b> Register</b> </a>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"login.jsp\"> <b>Login<b> </a>\n");
      out.write("        <br>\n");
      out.write("        <a href='viewProducts.jsp'><b> View menu</b> </a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
