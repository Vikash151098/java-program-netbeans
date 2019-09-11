package letsgetquizzical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class connection
{
    Connection con;
    Statement stmt;
    ResultSet rst;
  
    public static String[][]result;
   public static int count=0;
    public connection()
    {
        try
        {
            
        
            con=Database.getconnection();
            stmt=con.createStatement();
            
        }
        catch(Exception e1)
        {
            System.out.println(e1); 
        }
    } 
    public  void getdata()
    { 
        try
        {
             rst=stmt.executeQuery("select * from question");
             while(rst.next())
             {
                 count++;
             }
           
            
            rst=stmt.executeQuery("select * from question");
           result=new String[count][7];
            int rows=0;
            while(rst.next())
            {
               result[rows][0]=rst.getString(1);
               result[rows][1]=rst.getString(2);
               result[rows][2]=rst.getString(3);
               result[rows][3]=rst.getString(4);
               result[rows][4]=rst.getString(5);
               result[rows][5]=rst.getString(6);
               result[rows][6]=rst.getString(7);
                rows++;
            }  
        }
        catch(Exception e2)
        {
            System.out.print(e2);
        }
        
    }
    

    }
    
