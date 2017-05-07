package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"content\">\n");
      out.write("        <div class=\"header\">\n");
      out.write("<!--            <img src=\"./img/companyLogo.jpg\" style=\"width:100px\"  />-->\n");
      out.write("            <span class=\"header-text\">Xin Yang</span>\n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("            <h1>Registration form</h1>   \n");
      out.write("            <form method=\"post\" action=\"RegistrationController\"> \n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"name\">Name</label>\n");
      out.write("                    <input type=\"text\" name=\"name\" id=\"name\" size=\"40\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"username\">Username</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"password\">Password</label>\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"rPassword\">Repeat password</label>\n");
      out.write("                    <input type=\"password\" name =\"rpassword\" id=\"rPassword\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button  type=button onclick=\"getLocation()\">Adress</button>\n");
      out.write("                <p name = \"demo\" id=\"demo\"></p>\n");
      out.write("                <p name =\"demo2\" id=\"demo2\"></p>\n");
      out.write("                <script>\n");
      out.write("                var lat = document.getElementById(\"demo\");\n");
      out.write("                var lng = document.getElementById(\"demo2\");\n");
      out.write("                function getLocation() {\n");
      out.write("                    if (navigator.geolocation) {\n");
      out.write("                        navigator.geolocation.getCurrentPosition(showPosition);\n");
      out.write("                    } else { \n");
      out.write("                        x.innerHTML = \"Geolocation is not supported by this browser.\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function showPosition(position) {\n");
      out.write("                    document.getElementById(\"hiddenField\").value=position.coords.latitude + \" \" + position.coords.longitude;\n");
      out.write("                 \n");
      out.write("                }\n");
      out.write("                </script>\n");
      out.write("                 <input name =\"hidden\" type=\"hidden\" id=\"hiddenField\"/>\n");
      out.write("              \n");
      out.write("<!--                <div class=\"form-element\">\n");
      out.write("                    <label for=\"email\">Email</label>\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"gender\">Gender</label>\n");
      out.write("                    Male<input type=\"radio\" name=\"gender\" value=\"male\"> \n");
      out.write("                    Female<input type=\"radio\" name=\"gender\" value=\"female\"> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"tel\">Telephone</label>\n");
      out.write("                    <input type=\"tel\" name=\"tel\" id=\"tel\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"country\">Country</label>\n");
      out.write("                    <select name=\"country\" id=\"country\">\n");
      out.write("                        <option>Romania</option>\n");
      out.write("                        <option>Italy</option>\n");
      out.write("                        <option>France</option>\n");
      out.write("                        <option>Germany</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-element\">\n");
      out.write("                    <label for=\"spam\">Subscribe to maillist</label>\n");
      out.write("                    <input type=\"checkbox\" name=\"spam\" id=\"spam\"> \n");
      out.write("                </div> -->\n");
      out.write("                  <div class=\"form-element\">\n");
      out.write("                      <input type=\"submit\" value=\"Submit\">\n");
      out.write("                   \n");
      out.write("                </div> \n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
