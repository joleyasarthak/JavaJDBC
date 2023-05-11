package testdbsarthak3;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Sarthak Joleya
 */

public class Type4InsertUserData
{
    public static void main(String[] args) {
        Connection con = null;      //maintain connection
        Statement st = null;        //to run query
        
        Scanner sc = new Scanner(System.in);
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iist5","root","root");
            System.out.println("Connected!");
            
            System.out.println("Enter ID: ");
            int id = sc.nextInt();

            System.out.println("Enter your Name: ");
            String name = sc.next();

            System.out.println("Enter Employee Salary: ");
            int salary = sc.nextInt();

            System.out.println("Enter City: ");
            String city = sc.next();
            
            st=con.createStatement();       //taking permission to run query
//          String query = "INSERT INTO emp VALUES('105','Akash','23000','Indore')";
            String query = "INSERT INTO emp VALUES('"+id+"','"+name+"','"+salary+"','"+city+"')";
            
            System.out.println(query);
            
            int rowsAffected = st.executeUpdate(query);
            System.out.println("Rows Affected: " + rowsAffected);
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        sc.close();
    }
}
