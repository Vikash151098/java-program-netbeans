/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author VK
 */
public class createtable {
    
    Connection con;
    PreparedStatement pr;
    Statement stmt;
    createtable()
    {
        String x="vk";
         try
        {
            
        
        Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
             stmt=con.createStatement();
             stmt.executeUpdate("create table "+x+"(id int UNSIGNED AUTO_INCREMENT PRIMARY KEY,name varchar(30),amount int)");
    }
        catch(Exception e1)
        {
            System.out.println(e1);
        }

    }
    public static void main(String[] args) {
        new createtable();
           }
    
}
