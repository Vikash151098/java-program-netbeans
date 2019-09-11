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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class dbinsert {
    Connection con;
     PreparedStatement pr;
     Statement stmt;
      Scanner sc=new Scanner(System.in);
      ResultSet rst;
     void dbInsert()
     {
         System.out.println("enter your name::");
         String name=sc.nextLine();  
         System.out.println("enter your password::");
         String password=sc.nextLine();  
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
             System.out.println("connection");
             pr=con.prepareStatement("insert into userlogin values(?,?)");
             pr.setString(1, name);
             pr.setString(2, password);
             pr.executeUpdate();
             stmt=con.createStatement();
     }
       catch(Exception e)
       {
            System.out.println(e);
       }  
     }
     public void getdata()
     {
         try
         {
             rst=stmt.executeQuery("select * from userlogin");
            while(rst.next())
            {
                String name=rst.getString("userid");
                String clas=rst.getString("password");
                
                System.out.println(name);
                System.out.println(clas);  
         }
         }
         catch(Exception e1)
         {
             System.out.println(e1);
         }
     }
      public static void main(String[] args) {
      dbinsert db=new dbinsert();
              db.dbInsert();
              db.getdata();
    }
}
