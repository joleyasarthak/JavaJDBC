package testdbsarthak3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sarthak Joleya
 */

public class Type4Show {
    public static void main(String[] args) {
        Connection con = null;      //maintain connection
        Statement st = null;        //to run query
        ResultSet rs = null;        //recieve result from query
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iist5","root","root");
            System.out.println("Connected!");
            
            st=con.createStatement();       //taking permission to run query
            String query = "SELECT * FROM emp";
            
            rs = st.executeQuery(query);    //running query
            
            //printing result
            while(rs.next()){
                
                for(int i = 1; i <= 4; i++){
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println();
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
