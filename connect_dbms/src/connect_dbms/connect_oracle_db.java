/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_dbms;

import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author VK
 */
public class connect_oracle_db {
    Connection con;
    Statement stmt;
   void  connect()
    {
        try
        {
            
        Class.forName("oracle.jdbc.driver.OraclrDriver");   
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Vikash@123");
            System.out.println("connection");
            
           
        }
        catch(Exception e1)
        {
            System.out.println(e1); 
        }
    }
    public static void main(String[] args) {
        connect_oracle_db ob=new connect_oracle_db();
        ob.connect();
    }
    
}
