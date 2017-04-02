

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu95
 */
public class ProductsDB {
    
       public  ArrayList<Product> getAllProducts() throws ClassNotFoundException, SQLException{
        
        Connection con=DBConnection.getConnection();
        Statement instr = con.createStatement();
        String sql = "SELECT * FROM APP.Products ";
        System.out.println(sql);
        ResultSet rs = instr.executeQuery(sql);
        ArrayList<Product> productList = new ArrayList<>();
        while (rs.next()) {
            Product products = new Product(rs.getInt("id"),rs.getString("productname"), rs.getString("type"), rs.getString("description"), rs.getDouble("priceperunit"));
            productList.add(products);
            
        }

       
       rs.close();
       instr.close();
       con.close();
       return productList;
    }
       
        public  ArrayList<Product> getProductsByType(String type) throws ClassNotFoundException, SQLException{
        
        Connection con=DBConnection.getConnection();
        Statement instr = con.createStatement();
        String sql = "SELECT * FROM APP.PRODUCTS p WHERE p.TYPE ='"+type+"'";
        System.out.println(sql);
        ResultSet rs = instr.executeQuery(sql);
        ArrayList<Product> productList = new ArrayList<>();
        while (rs.next()) {
            Product products = new Product(rs.getInt("id"),rs.getString("productname"), rs.getString("type"), rs.getString("description"), rs.getDouble("priceperunit"));
            productList.add(products);
            
        }

       
       rs.close();
       instr.close();
       con.close();
       return productList;
    }
        
        
              public boolean addProduct(Product p){
       
          try { 
                Connection con=DBConnection.getConnection();
                Statement st = con.createStatement(); 
                String sql="INSERT INTO APP.PRODUCTS " + 
                    "VALUES ("+p.getID()+","+"'"+p.getName()+"'"+","+"'"+p.getType()+"'"+","+"'"+p.getDescription()+"'"+"," +p.getUnit_price() +")";
                System.out.println(sql);
                st.executeUpdate(sql);
                con.close(); 
                return true;
            } catch (Exception e) { 
                System.err.println("Got an exception! "); 
                System.err.println(e.getMessage()); 
                return false;
            } 


       }
              
          public boolean removeProduct(int id) throws SQLException{
              

          try { 
                Connection con=DBConnection.getConnection();
                Statement st = con.createStatement(); 
                String sql = "DELETE FROM APP.PRODUCTS WHERE ID = "+id+" ";
                System.out.println(sql);
                st.executeUpdate(sql);
                con.close(); 
                return true;
            } catch (Exception e) { 
                System.err.println("Got an exception! "); 
                System.err.println(e.getMessage()); 
                return false;
            } 


       }
}
