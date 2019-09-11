package connect_dbms;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

class connect
{
    
    Connection con;
    Statement stmt;
    ResultSet rst;
    connect()
    {
        try
        {
            
        Class.forName("com.mysql.jdbc.Driver");   
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vikash","root","");
            System.out.println("connection");
            stmt=con.createStatement();
            
        }
        catch(Exception e1)
        {
            System.out.println(e1); 
        }
    }
   public  void getdata()
    {
        ArrayList <Person>arr=new ArrayList<Person>();
        try
        {
            rst=stmt.executeQuery("select * from detail");
            
            while(rst.next())
            {
                Person p=new Person();
                p.setQtxt(rst.getString("name"));
                p.setOpt2(rst.getString("class"));
                p.setQid(rst.getInt("age"));
                p.setOpt1(rst.getString("status"));
                System.out.println(arr.size());
            System.out.println(arr.get(1).getQtxt());
            System.out.println(arr.get(2).getQtxt());
            System.out.println(arr.get(3).getQtxt());
            System.out.println(arr.get(4));
            }
            
        }
        catch(Exception e2)
        {
            System.out.println(e2);
        }
    }
    public static void main(String[] args) {
     connect ob=new connect();
     ob.getdata();
    }
    
}