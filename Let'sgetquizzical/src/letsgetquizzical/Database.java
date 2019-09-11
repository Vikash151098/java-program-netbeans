/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgetquizzical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vikash Kumar
 */
public class Database {
    
    public static Connection getconnection()
    {
        final String user="root";
       final String pass="Vikash@151098";
       final String DBName="quizzical";
        try
        {
            
        Class.forName("com.mysql.jdbc.Driver");   
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DBName,user,pass);
            System.out.println("connection");
            
           return con; 
        }
        catch(Exception e1)
        {
            System.out.println(e1); 
            return null;
        }
        
    }
    
}
