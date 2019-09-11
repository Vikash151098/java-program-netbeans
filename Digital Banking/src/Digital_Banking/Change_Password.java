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
import java.sql.PreparedStatement;
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
public class Change_Password extends JPanel implements ActionListener    
{
    Welcome p20;
    JLabel l0,l1,l2,l3;  
    JPasswordField jpf0,jpf1,jpf2;
    JButton b1,b2,b3;
    Connection con;
    Statement stmt;
    PreparedStatement pr;
    ResultSet rs;
    int a=0;
    public Change_Password()
    {
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.BOLD,12);
        setBackground(mynewblue);
        l0=new JLabel("CHANGE PASSWORD");
        l0.setForeground(Color.WHITE);
        l0.setBounds(550,50,300,50);
        l0.setFont(ft);
        add(l0);
        l1=new JLabel("Old Password");
        l1.setForeground(Color.WHITE);
        l1.setBounds(300,150,250,30);
        l1.setFont(ft);
        add(l1);
        l2=new JLabel(" New Password ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(300,200,250,30);
        l2.setFont(ft);
        add(l2);
        l3=new JLabel("Confirm New  Password ");
        l3.setForeground(Color.WHITE);
        l3.setBounds(300,250,300,30);
        l3.setFont(ft);
        add(l3);
         jpf0=new JPasswordField();
        jpf0.setBounds(600,150,200,30);
        add(jpf0);
        jpf1=new JPasswordField();
        jpf1.setBounds(600,200,200,30);
        add(jpf1);
         jpf2=new JPasswordField();
        jpf2.setBounds(600,250,200,30);
        add(jpf2);
        b1=new JButton("OK");
        b1.setBounds(380,330,100,40);
        b1.setFont(ft1);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("RETYPE");
        b2.setBounds(540,330,100,40);
        b2.setFont(ft1);
        b2.addActionListener(this);
        add(b2);
        b3=new JButton("Back");
        b3.setBounds(700,330,100,40);
        b3.setFont(ft1);
        b3.addActionListener(this);
        add(b3);
       p20=new  Welcome(); 
        JDialog.setDefaultLookAndFeelDecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        { 
            if((jpf0.getText().equals(""))||(jpf1.getText().equals(""))||(jpf2.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter username and password");
            }
     else
     {
            if(jpf1.getText().equals(jpf2.getText()))
            {
           try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
             System.out.println("connection");
             pr=con.prepareStatement("update login_detail set password=? where password=? and acc_id=?");
             pr.setString(1,jpf1.getText());
             pr.setString(2,jpf0.getText());
             pr.setString(3,Login.acc_id);
            pr.executeUpdate();
            jpf0.setText("");
            jpf1.setText("");
            jpf2.setText("");
            a++;
            System.out.println(a);
       }
       catch(Exception e1)
       {
           System.out.println(e1);
       }
           JOptionPane.showMessageDialog(null, "Change Password  Sucessfully");
        }
            else
                JOptionPane.showMessageDialog(null, "New Password and Confirm Password not matched");
        }
        }
        else  if(e.getSource()==b2)
        {
             jpf0.setText("");
            jpf1.setText("");
              jpf2.setText("");
        }
        else  if(e.getSource()==b3)
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
