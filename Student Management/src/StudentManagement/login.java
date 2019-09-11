/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class login extends JFrame implements ActionListener,KeyListener
{
    JLabel l1;
    JTextField jtf;
    JPasswordField jpf;
    JButton b1,b2;
    Connection con;
    Statement stmt;
    ResultSet rs;
    int count=0;
    public login()
    {
        Font ft=new Font("Times New Roman", Font.BOLD,20);
       setTitle("login");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("USERNAME");
        l1.setBounds(100,100,150,30);
        l1.setFont(ft);
        add(l1);
        jtf=new JTextField();
        jtf.setBounds(250,100,150,30);
        jtf.addKeyListener(this);
        add(jtf);
        JLabel l2=new JLabel("PASSWORD");
        l2.setBounds(100,150,150,30);
        l2.setFont(ft);
        add(l2);
        jpf=new JPasswordField();
        jpf.setBounds(250,150,150,30);
        jpf.addKeyListener(this);
        add(jpf);
        b1=new JButton("LOGIN");
        b1.setBounds(150,200,100,50);
        b1.addActionListener(this);
        b1.addKeyListener(this);
        add(b1);
         b2=new JButton("REGISTER");
        b2.setBounds(270,200,100,50);
        b2.addActionListener(this);
        add(b2);
      
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        new login();
    }
    public void dblogin()
{
     String uname=null;
     String pass=null;
     if((jtf.getText().equals(""))||(jpf.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter username and password");
            }
     else
     {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
             
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from login");
             while(rs.next())
        {
            
             uname=rs.getString(1);
             pass=rs.getString(2);
            
            if(uname.equals(jtf.getText())&&pass.equals(jpf.getText()))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"you have successfully logged in");
                new home();
                dispose();
                count++;
                break;
            }
            
      }
          if(count==0) 
          {
              JDialog.setDefaultLookAndFeelDecorated(true);
              JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
          }   
    }
    
    catch(Exception e)
    {
        System.out.println(e);
    }
     }
     
}
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
        {
           dblogin();
        }
        else if(e.getSource()==b2)
        {
            new Register();
            dispose();
        }
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
       
           if(e.getKeyCode()==10)
           {
           dblogin();
           }
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
