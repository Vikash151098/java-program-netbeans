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
import java.sql.*;
import java.util.Scanner;
public class Dbconnection {
Connection con;
Statement stmt;
ResultSet rs;
void dbconnect()
{
    
 Scanner sc=new Scanner(System.in);
    try
           {
               
          
         System.out.println("enter your name::");
         String name=sc.nextLine();  
         System.out.println("enter your password::");
         String password=sc.nextLine();  
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
             System.out.println("connection");
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from userlogin");
             while(rs.next())
        {
            String name1=rs.getString(1);
            String pass1=rs.getString(2);
            if(name.equals(name1) && password.equals(pass1))
            {

                System.out.println("succesfull user::");

            }
            else  System.out.println("invalid  user::");
            
      }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
 
    public static void main(String[] args) {
        new Dbconnection().dbconnect();
    }
    
}
