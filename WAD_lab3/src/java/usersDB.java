

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class usersDB {

    public boolean userExists(user u) throws SQLException {
        
        Connection con=DBConnection.getConnection();
        Statement instr = con.createStatement();
        String sql = "SELECT * FROM APP.USERS p WHERE p.USERNAME ='"+u.getUsername()+"' AND p.PASSWORD='"+u.getPassword()+"'";
        System.out.println(sql);
        ResultSet rs = instr.executeQuery(sql);
        boolean res=false;
        if (rs.next()) {
        res=true;  
        }
       
       rs.close();
       instr.close();
       con.close();
        

    return res;
    }
     
}
