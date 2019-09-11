import java.util.Scanner;
import java.sql.*;
public class login 
{
      
      public static void main(String [] ar)
      {
      Connection con;
      Statement stmt;
      ResultSet rs;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your name::");
         String name=sc.nextLine();  
         System.out.println("enter your password::");
         String password=sc.nextLine();  
           try
           {
  Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
  System.out.println("connectionn");
  stmt=con.createStatement();
  rs=stmt.executeQuery("select * from login");
  int count=0;
   while(rs.next())
   {
      String name1=rs.getString(1);
      String pass1=rs.getString(2);
      if(name.equals(name1) && password.equals(pass1))
      {
         System.out.println("login valid::");
         count++;
          break;
      }
      
   }
   if(count==0)
   {
       System.out.println("not valid login::");
   }   
   }   
  
             
            catch(Exception e)
            {
                 System.out.println("connectionn"+e);
            }    
               
      }
}
