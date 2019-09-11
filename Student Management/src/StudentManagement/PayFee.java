/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class PayFee extends JFrame implements ActionListener
{
    JLabel l0,l1;
    JTextField jtf1,jtf2;
    JButton b1,b2;
    Connection con;
    PreparedStatement pr;
    Statement stmt;
    ResultSet rs;
 public PayFee()
 {
     Font ft=new Font("Times New Roman", Font.BOLD,20);
     setTitle("pay fee");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0=new JLabel("Rollno.");
       l0.setBounds(100,100,100,30);
       l0.setFont(ft);
        add(l0);
        jtf1=new JTextField();
        jtf1.setBounds(200,100,100,30);
        add(jtf1);
        l1=new JLabel("Amount");
        l1.setBounds(100,150,100,30);
        l1.setFont(ft);
        add(l1);
        jtf2=new JTextField();
        jtf2.setBounds(200,150,100,30);
        add(jtf2);
        b1=new JButton("Submit");
        b1.setBounds(150,200,100,30);
        b1.setFont(ft);
        b1.addActionListener(this);
        add(b1);
         b2=new JButton("BACK");
        b2.setBounds(10,10,100,30);
        b2.setFont(ft);
        b2.addActionListener(this);
        add(b2);
         setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
 }
    public static void main(String[] args) {
        new PayFee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
                System.out.println("connection");
                
                pr=con.prepareStatement("update payment set paid_amount=? where rollno=?");
                pr.setString(1,jtf2.getText());
                pr.setString(2,jtf1.getText());
                pr.executeUpdate();
             
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
        else if(e.getSource()==b2)
        {
            new home();
            dispose();
        }
    }
}
