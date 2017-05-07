package WADproject;




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
public class PurchaseDB {
      
        
       public  ArrayList<Purchase> getAllPurchases(String username) throws ClassNotFoundException, SQLException{
        
        Connection con=DBConnection.getConnection();
        Statement instr = con.createStatement();
        String sql = "SELECT * FROM APP.PURCHASES p WHERE p.USERNAME ='"+username+"'";
        System.out.println(sql);
        ResultSet rs = instr.executeQuery(sql);
        ArrayList<Purchase> purchaseList = new ArrayList<>();
        while (rs.next()) {
            Purchase purchase = new Purchase(rs.getString("USERNAME"), rs.getString("DATE"), rs.getInt("NOOFITEMS"));
            purchaseList.add(purchase);
            
        }

       
       rs.close();
       instr.close();
       con.close();
       return purchaseList;
    }
       
 
}
