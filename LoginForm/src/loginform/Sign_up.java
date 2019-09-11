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

public class Sign_up extends JFrame implements ActionListener
{
    
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    ImageIcon img;
    int count;

   public Sign_up(){
       setLayout(null);
         
       l3=new JLabel();
   l3.setBounds(0, 0, 600, 500);
        ImageIcon img4=new ImageIcon("src/Images/Lib.jpeg");
        l3.setIcon(img4);
        setContentPane(l3);
         l4=new JLabel("Create a New Account");
        l4.setBounds(180, 60, 250, 30);
        l4.setForeground(Color.white);
        add(l4);
       setTitle("Sign Up Account");
       b1=new JButton("Sign Up");
       b1.setBounds(210, 200, 100, 40);
       b1.addActionListener(this);
       add(b1);
       l1=new JLabel("Enter Username");
       l1.setBounds(80, 100, 100, 30);
       l1.setForeground(Color.white);
       add(l1);
        l2=new JLabel("Enter Password");
       l2.setBounds(80, 150, 100, 30);
       l2.setForeground(Color.white);
       add(l2);
       t1=new JTextField();
       t1.setBounds(190, 100, 180, 30);
       t1.addActionListener(this);
       add(t1);
       t2=new JPasswordField();
       t2.setBounds(190, 150, 180, 30);
       t2.addActionListener(this);
       add(t2);
        setSize(600,500);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
        setResizable(false);
   }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
       
        Connection con;
     PreparedStatement pr;
      
         String name=new String(t1.getText());  
         
         String password=new String(t2.getPassword());  
         try
         {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
             System.out.println("connection");
             pr=con.prepareStatement("insert into test values(?,?)");
             pr.setString(1,name);
             pr.setString(2,password);
             pr.executeUpdate();
            
        
     }
       catch(Exception e1)
       {
            System.out.println(e1);
       }  
      if(e.getSource()==b1){
          JFrame j=new JFrame();
          j.setSize(100,200);
            JOptionPane.showMessageDialog(j,"Registered Succesfully");
        }
        }
        
       
}
     public static void main(String[] args) {
      new Sign_up(); 
    }

}
