

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductView extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean loggedIn = false;
        List<Product> products = (List<Product>) this.getServletContext().getAttribute("PRODUCTS");
        if (request.getSession().getAttribute("user") != null) {
            loggedIn = true;
        }
        StringBuilder result = new StringBuilder();

        for (Product p : products) {
            result.append("<tr>");
            result.append("<td>").append(p.getType()).append("</td>");
            result.append("<td>").append(p.getName()).append("</td>");
            result.append("<td>").append(p.getUnit_price()).append("</td>");
            if(loggedIn)
                result.append("<td><input type=\"number\" name=\"product_").append(p.getID()).append("\" value=\"0\" min=\"0\"/></td>");
            result.append("</tr>");
        }
        try {
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n"
                    + "        <title>Login</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <div id=\"content\">\n"
                    + "        <div class=\"header\">\n"
                    + "            <img src=\"./img/companyLogo.jpg\" width=\"100px\"  />\n"
                    + "            <span class=\"header-text\">COMPANY NAME</span>\n"
                    + "        </div>\n"
                    + "        <nav>\n"
                    + "            <ul>\n"
                    + "                    <a href=\"index.jsp\">Home</a>\n"
                    + "                    <a href=\"RegistrationView\">Register</a>\n"
                    + "                    <a href=\"LoginView\">Login</a>\n"
                    + "                    <a href=\"ProductView\">View Products</a>\n"
                    + "                    <a href=\"LogoutController\">Logout</a>\n"
                    + "                </ul>\n"
                    + "        </nav>\n"
                    + "            <h1>Products</h1>   \n"
                    + "            <form method=\"post\">"
                    + "               <table>"
                    + "               <tr><td>Category</td><td>Name</td><td>Price</td><td>Amount</td></tr> "
                    + "" + result.toString() + "\n"
                    + "               </table>"
                    + "                <div class=\"form-element\">\n");
            if(loggedIn)
                    out.println("                    <input type=\"submit\" value=\"Buy\">\n"+
                            "                    <input type=\"reset\" value=\"Reset\">\n");
                   out.println("                </div>\n"
                    + "            </form>"
                    + "        </div>\n"
                    + "    </body>\n"
                    + "</html>\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}