import java.sql.*;
import java.util.Scanner;
public class test2 {
     public static void main(String [] ar)
      {
      Connection con;
      PreparedStatement pr;
     
      Scanner sc=new Scanner(System.in);
         System.out.println("enter your old pasword::");
         String oldpass=sc.nextLine();  
         System.out.println("enter your new password::");
         String password=sc.nextLine();  
           try
           {
  Class.forName("com.mysql.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
  System.out.println("connectionn");
  //pr=con.prepareStatement("update login set password=? , username=? where password=?");
  pr=con.prepareStatement("update login set password=? , username=?");
  pr.setString(1, password);
  pr.setString(2, "kdfkfhfdj");
  
  pr.executeUpdate();
   }   
  
             
            catch(Exception e)
            {
                 System.out.println("connectionn"+e);
            }    
               
      }
}
