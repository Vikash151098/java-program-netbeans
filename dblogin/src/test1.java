import java.sql.*;
import java.util.Scanner;
public class test1 {
     public static void main(String [] ar)
      {
      Connection con;
      PreparedStatement pr;
     
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
  pr=con.prepareStatement("insert into login values(?,?)");
  pr.setString(1, name);
  pr.setString(2, password);
  pr.executeUpdate();
   }   
  
             
            catch(Exception e)
            {
                 System.out.println("connectionn"+e);
            }    
               
      }
}
