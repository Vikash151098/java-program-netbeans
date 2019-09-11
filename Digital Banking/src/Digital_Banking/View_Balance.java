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
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class View_Balance extends JPanel implements ActionListener
{
    Welcome p20;
    JLabel l0,l1,l2,l3,l4,l5,l6;
    JButton b1;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String name;
    String balance;
public View_Balance()
{
    check_balance();
   setLayout(null);
   Color mynewblue=new Color(0,191,255);
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.BOLD,16);
        setBackground(mynewblue);
        l0=new JLabel("VIEW BALANCE");
        l0.setForeground(Color.WHITE);
        l0.setBounds(550,50,300,50);
        l0.setFont(ft);
        add(l0);
        l1=new JLabel("Account Id");
        l1.setForeground(Color.WHITE);
        l1.setBounds(300,150,100,30);
        l1.setFont(ft1);
        add(l1);
        l2=new JLabel("Full Name");
        l2.setForeground(Color.WHITE);
        l2.setBounds(300,200,100,30);
        l2.setFont(ft1);
        add(l2);
        l3=new JLabel("Balance");
        l3.setForeground(Color.WHITE);
        l3.setBounds(300,250,100,30);
        l3.setFont(ft1);
        add(l3); 
        
        l4=new JLabel(Login.acc_id);
        l4.setForeground(Color.WHITE);
        l4.setBounds(450,150,100,30);
        l4.setFont(ft1);
        add(l4); 
        
        l5=new JLabel(name);
        l5.setForeground(Color.WHITE);
        l5.setBounds(450,200,100,30);
        l5.setFont(ft1);
        add(l5); 
        
        l6=new JLabel(balance);
        l6.setForeground(Color.WHITE);
        l6.setBounds(450,250,100,30);
        l6.setFont(ft1);
        add(l6); 
        b1=new JButton("BACK");
      b1.setBounds(650,380,70,30);
      b1.addActionListener(this);
      add(b1);
      p20=new Welcome();
}
void check_balance()
{
     try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
             stmt=con.createStatement();
             rs=stmt.executeQuery("select name from personal_detail where acc_id="+Login.acc_id);
             while(rs.next())
        {
             name=rs.getString("name"); 
        }
              rs=stmt.executeQuery("select balance from login_detail where acc_id="+Login.acc_id);
              while(rs.next())
              {
                  balance=Integer.toString(rs.getInt("balance"));  
              }
    }
     catch(Exception e)
     {
         System.out.println(e);
     }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
           //removing panel
            home.p.removeAll();
            home.p.repaint();
           home. p.revalidate();
            
            //adding panel
           home. p.add(p20);
            home.p.repaint();
           home. p.revalidate();
        }
    }
}
