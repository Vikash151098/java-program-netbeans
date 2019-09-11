/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author Jatin
 */
import java.awt.Choice;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Forget extends JFrame implements ActionListener {

    
    JButton b1;
    JTextField t1,t2;
    JLabel l1,l2,l3,l4;
     ImageIcon img4;
     Choice c1;
    public Forget(){
         l1=new JLabel();
   l1.setBounds(0, 0, 600, 500);
        img4=new ImageIcon("src/Images/Lib.jpeg");
        l1.setIcon(img4);
        setContentPane(l1);
        setTitle("Forget Password");
        l2=new JLabel("Enter Your UserId");
        l2.setBounds(65, 140,250, 30);
        l2.setForeground(Color.white);
        add(l2);
        t1=new JTextField();
        t1.setBounds(200, 140,200, 30);
        add(t1);
        b1=new JButton("Search");
        b1.setBounds(300, 200, 90, 30);
        b1.addActionListener(this);
        add(b1);
        setSize(600,500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
     setResizable(false);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e) {
        
   if(e.getSource()==b1){
       
        Connection con;
     PreparedStatement pr;
      ResultSet rs;
      Statement stmt;
      
         String userid=new String(t1.getText());  
           
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
             System.out.println("connection");
            /* pr=con.prepareStatement();*/
             stmt=con.createStatement();
             rs=stmt.executeQuery("Select * from test  WHERE userid=");   
             /*pr.setString(1,RollNo);
             pr.setString(2,SubjectCode);
             pr.executeUpdate();*/
             int count1=0;
         if(rs.next()){
              count1=count1+1;
                  System.out.println("");
             //new Book_Return();
         }
         if(count1>0)
         {
             //rs=null;
             rs=stmt.executeQuery("Select * from test  WHERE userid='");
              new recover();
         }
       
        
     }
       catch(Exception e1)
       {
            System.out.println(e1);
       }  
    
        }
        
       
}
   
        
        
  
    
    public static void main(String[] args) {
        new Forget();
    }
    
}
