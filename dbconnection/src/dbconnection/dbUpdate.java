/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author VK
 */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class dbUpdate {
    Connection con;
     PreparedStatement pr;
      Scanner sc=new Scanner(System.in);
     void dbIUpdate()
     {
         System.out.println("enter your old userid::");
         String olduserid=sc.nextLine();  
         System.out.println("enter your new userid::");
         String newuserid=sc.nextLine();  
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
             System.out.println("connection");
             pr=con.prepareStatement("update userlogin set userid=?,password=? where userid=?");
             pr.setString(1, newuserid);
             pr.setString(2,"newpasss" );
             pr.setString(3,olduserid );
            pr.executeUpdate();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
     }
     public static void main(String[] args) {
         
         new dbUpdate().dbIUpdate();
     }
     
}
