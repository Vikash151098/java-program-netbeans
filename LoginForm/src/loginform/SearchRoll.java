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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SearchRoll extends JFrame implements ActionListener
{
    
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton button1;
    ImageIcon img;
    int count;
    String Iss;

   public SearchRoll(){
       setLayout(null);
         
       l3=new JLabel();
   l3.setBounds(0, 0, 600, 500);
        ImageIcon img4=new ImageIcon("src/Images/Lib.jpeg");
        l3.setIcon(img4);
        setContentPane(l3);
        /* l4=new JLabel("Search Your Roll No. For Return Book");
        l4.setBounds(180, 60, 250, 30);
        l4.setForeground(Color.white);
        add(l4);*/
       setTitle("Search Roll No.");
       button1=new JButton("Search");
       button1.setBounds(280, 200, 90, 40);
       button1.addActionListener(this);
       add(button1);
       l1=new JLabel("Enter Roll No.");
       l1.setBounds(80, 100, 100, 30);
       l1.setForeground(Color.white);
       add(l1);
        l2=new JLabel("Enter Book Code");
       l2.setBounds(80, 150, 100, 30);
       l2.setForeground(Color.white);
       add(l2);
       t1=new JTextField();
       t1.setBounds(190, 100, 180, 30);
       t1.addActionListener(this);
       add(t1);
       t2=new JTextField();
       t2.setBounds(190, 150, 180, 30);
       t2.addActionListener(this);
       add(t2);
        setSize(600,500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
        setResizable(false);
   }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
       
        Connection con;
     PreparedStatement pr;
      ResultSet rs;
      Statement stmt;
      
         String RollNo=new String(t1.getText());  
         
         String SubjectCode=new String(t2.getText());  
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
             System.out.println("connection");
            /* pr=con.prepareStatement();*/
             stmt=con.createStatement();
             rs=stmt.executeQuery("Select * from library  WHERE Student_Roll_No='"+RollNo+"' and Subject='"+SubjectCode+"'");   
             /*pr.setString(1,RollNo);
             pr.setString(2,SubjectCode);
             pr.executeUpdate();*/
             int count1=0;
         if(rs.next()){
              count1=count1++;
                  System.out.println("");
             //new Book_Return();
         }
         if(count1>0)
         {
             //rs=null;
             rs=stmt.executeQuery("Select * from library  WHERE Student_Roll_No='"+RollNo+
                     "and Subject="+SubjectCode+"'");
              new Book_Return(rs);
         }
       
        
     }
       catch(Exception e1)
       {
            System.out.println(e1);
       }  
    
        }
        
       
}
     public static void main(String[] args) {
     new SearchRoll();
    }

}
