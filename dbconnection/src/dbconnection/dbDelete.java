/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author VK
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class dbDelete {
     Connection con;
     PreparedStatement pr;
      Scanner sc=new Scanner(System.in);
    void dbDelete()
    {
        System.out.println("enter your old pasword::");
         String oldpass=sc.nextLine();  
         
           try
           {
  Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
  System.out.println("connectionn");
  
  pr=con.prepareStatement("delete from userlogin where password=?");
  pr.setString(1, oldpass);
  
  
  pr.executeUpdate();
    } 
      catch(Exception e)
       {
           System.out.println(e);
       }    
    }
    public static void main(String[] args) {
        new dbDelete().dbDelete();
    }
}
