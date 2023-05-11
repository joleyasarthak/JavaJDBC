package testdbsarthak3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Sarthak Joleya
 */

public class Type4Delete
{
    public static void main(String[] args) {
        Connection con = null;      //maintain connection
        Statement st = null;        //to run query
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iist5","root","root");
            System.out.println("Connected!");
            
            st=con.createStatement();       //taking permission to run query
            String query = "DELETE FROM emp WHERE empid='106'";
            int rowsAffected = st.executeUpdate(query);
            System.out.println("Rows Affected: " + rowsAffected);
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
