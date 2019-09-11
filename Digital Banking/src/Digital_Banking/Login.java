/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital_Banking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class Login extends JPanel implements ActionListener
{
    public static String acc_id;
    JLabel l0,l1,l2;
    JTextField jtf;
    JPasswordField jpf;
    JButton b1,b2,b3;
    Connection con;
    Statement stmt;
    ResultSet rs;
    int count=0;
    Welcome p20;
   static String uname;
     String pass;
    
    public Login()
    {
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.BOLD,12);
        setBackground(mynewblue);
        l0=new JLabel("LOGIN PAGE");
        l0.setForeground(Color.WHITE);
        l0.setBounds(550,50,300,50);
        l0.setFont(ft);
        add(l0);
        l1=new JLabel("Account ID ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(400,150,150,30);
        l1.setFont(ft);
        add(l1);
        l2=new JLabel("Password ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(400,250,150,30);
        l2.setFont(ft);
        add(l2);
        jtf=new JTextField();
        jtf.setBounds(550,150,200,30);
        add(jtf);
        jpf=new JPasswordField();
        jpf.setBounds(550,250,200,30);
        add(jpf);
        b1=new JButton("RETYPE");
        b1.setBounds(380,330,100,40);
        b1.setFont(ft1);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("LOGIN");
        b2.setBounds(540,330,100,40);
        b2.setFont(ft1);
        b2.addActionListener(this);
        add(b2);
        b3=new JButton("EXIT");
        b3.setBounds(700,330,100,40);
        b3.setFont(ft1);
        b3.addActionListener(this);
        add(b3);
        p20=new Welcome();
    }
public void dblogin()
{
     
     if((jtf.getText().equals(""))||(jpf.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter username and password");
            }
     else
     {
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from login_detail");
             while(rs.next())
        {
            
             uname=rs.getString(1);
             pass=rs.getString(2);
            
            if(uname.equals(jtf.getText())&&pass.equals(jpf.getText()))
            {
                acc_id=jtf.getText().toString();
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"you have successfully logged in");
                //removing panel
            home.p.removeAll();
            home.p.repaint();
           home. p.revalidate();
            
            //adding panel
           home. p.add(p20);
            home.p.repaint();
           home. p.revalidate();  
           
                count++;
                jtf.setText("");
                jpf.setText("");
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
            jtf.setText("");
            jpf.setText("");
        }
        else  if(e.getSource()==b2)
        {
            dblogin();
        }
        else  if(e.getSource()==b3)
        {
            System.exit(0);
        }
        
    }
    
}
