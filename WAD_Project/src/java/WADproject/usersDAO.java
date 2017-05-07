package WADproject;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class usersDAO {

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
    public boolean RegisterUser(user u) throws SQLException {
        
        Connection con=DBConnection.getConnection();
        Statement st = con.createStatement();
        try { 
<<<<<<< HEAD
            String sql = "INSERT INTO APP.USERS  " + 
                "VALUES ("+"'"+u.getUsername()+"'"+","+ "'"+u.getPassword()+"'"+","+"'"+u.getPos()+"'" +")";
=======
            String sql = "INSERT INTO APP.USERS " + 
                "VALUES ("+"'"+u.getUsername()+"'"+","+ "'"+u.getPassword()+"'" +")";
>>>>>>> 60ec931fe0292a9faa61ef4c99663e8ddeaf9743
            System.out.println(sql); 
           st.executeUpdate(sql);
            System.out.println("");
                 con.close();
                 return true;
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
            return false;
        } 
                
    }
    
}
