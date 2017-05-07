package WADproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu95
 */
public class DBConnection {
 
    
    public static Connection getConnection(){
        Connection con=null;
    String url = "jdbc:derby://localhost:1527/WADProject";
        try {
             con = DriverManager.getConnection(url, "a", "a");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }
    }
