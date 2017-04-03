/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WADproject;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author Radu95
 */
public class MenuListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        
        FoodDao fDao = new FoodDao();
        ArrayList<Food> productsLists;
        try {   
            productsLists = fDao.getAllProducts();
            ServletContext context = event.getServletContext();
            context.setAttribute("productLists", productsLists);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuListener.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
