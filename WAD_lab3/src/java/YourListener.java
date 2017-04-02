

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Radu95
 */
public class YourListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
//       din prodcontroller
//               luam din bd
//                       punem in lista de prod
//                               lista de prod o punem in servletcontext

        ProductsDB pDB = new ProductsDB();
        ArrayList<Product> productsLists;
        try {
            productsLists = pDB.getAllProducts();   
            ServletContext context = event.getServletContext();
            context.setAttribute("productLists", productsLists);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(YourListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(YourListener.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
