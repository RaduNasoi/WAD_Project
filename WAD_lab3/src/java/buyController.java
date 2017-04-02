

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "buyController_1", urlPatterns = {"/buyController_1"})
public class buyController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException, ClassNotFoundException, SQLException  {
        response.setContentType("text/html;charset=UTF-8");
        double totalPrice = 1;
        double sum = 0;
        ProductsDB pDB = new ProductsDB();
        ArrayList<Product> productsLists = pDB.getAllProducts();
        int quantity;
        int totalQuantity= 0;
        String user = (String) request.getSession().getAttribute("login");
        String timeStamp = new SimpleDateFormat("dd.MM.yy ---> HH:mm:ss").format(Calendar.getInstance().getTime());
        Product newProduct = new Product(10,"Toyota","Cars","blabla",2000.0);
        if(pDB.addProduct(newProduct)==true){
        productsLists = pDB.getAllProducts();
            for (Product item : productsLists) {
                    System.out.println(item.toString());
}
        }
         if(pDB.removeProduct(15)==true){
        productsLists = pDB.getAllProducts();
            for (Product item : productsLists) {
                    System.out.println(item.toString());
}
        }
         

    
        for(Product p: productsLists)
        {
           String quantityAsString = request.getParameter("quantity_"+p.getID());
            System.out.println("quantityAsString= "+quantityAsString);
            if(!quantityAsString.equals(null) && !quantityAsString.equals(""))
            {
            quantity = Integer.parseInt(quantityAsString);
                if(quantity > 0)
                {  
                    totalQuantity = quantity + totalQuantity;    
                    totalPrice = p.getUnit_price()* quantity;
                    sum= sum+ totalPrice;
                }
            }
        }
            
            Purchase purchase = new Purchase(user, timeStamp.toString(), totalQuantity);
            
            request.setAttribute("totalprice", sum);
            request.setAttribute("totalQuantity", purchase.getQuantity());
            request.getSession().setAttribute("username",purchase.getUserName() );
            RequestDispatcher rd = request.getRequestDispatcher("viewTransactions.jsp");
            rd.forward(request, response);
            
            
            try { 
                String url = "jdbc:derby://localhost:1527/products"; 
                Connection conn = DriverManager.getConnection(url,"a","a"); 
                Statement st = conn.createStatement(); 
                st.executeUpdate("INSERT INTO APP.PURCHASES " + 
                    "VALUES ("+"'"+purchase.getUserName()+"'"+","+"'"+purchase.getDate()+"'"+","+ purchase.getQuantity() +")"); 
                conn.close(); 
            } catch (Exception e) { 
                System.err.println("Got an exception! "); 
                System.err.println(e.getMessage()); 
            } 

        System.out.println("user= "+ purchase.getUserName());
        System.out.println("noOfItems= "+ purchase.getQuantity());
        System.out.println("date= "+ purchase.getDate());
        
    
    
}

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(buyController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(buyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(buyController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(buyController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}