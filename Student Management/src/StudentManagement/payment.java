/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class payment extends JFrame  implements ActionListener{

   
    JLabel ll;
  static  JTextField jtf;
    JButton b1,b2,b3;
    public payment()
    {
         Font ft=new Font("Times New Roman", Font.BOLD,20);
     setTitle("payment");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ll=new JLabel("Rollno.");
       ll.setBounds(200,50,100,30);
       ll.setFont(ft);
        add(ll);
        jtf=new JTextField();
        jtf.setBounds(300,50,100,30);
       jtf.addActionListener(this);
        add(jtf);
         b1=new JButton("Submit");
        b1.setBounds(250,100,100,30);
        b1.setFont(ft);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("BACK");
        b2.setBounds(10,10,100,30);
        b2.addActionListener(this);
        add(b2);
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new payment();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            new paymentdetail();
            dispose();
        }
        else if(e.getSource()==b2)
        {
            new home();
            dispose();
        }
        
    }
    
}
