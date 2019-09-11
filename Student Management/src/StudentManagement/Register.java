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
public class Register extends JFrame implements ActionListener
{
    JLabel l0,l1;
    JTextField jtf0,jtf;
    JPasswordField jpf;
    JButton b1;
    Connection con;
    PreparedStatement pr;
  public Register()
  {
      Font ft=new Font("Times New Roman", Font.BOLD,20);
       setTitle("Register");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0=new JLabel("NAME");
        l0.setBounds(100,100,150,30);
        l0.setFont(ft);
        add(l0);
         jtf0=new JTextField();
        jtf0.setBounds(250,100,150,30);
        add(jtf0);
        l1=new JLabel("USERNAME");
        l1.setBounds(100,150,150,30);
        l1.setFont(ft);
        add(l1);
        jtf=new JTextField();
        jtf.setBounds(250,150,150,30);
        add(jtf);
        JLabel l2=new JLabel("PASSWORD");
        l2.setBounds(100,200,150,30);
        l2.setFont(ft);
        add(l2);
        jpf=new JPasswordField();
        jpf.setBounds(250,200,150,30);
        add(jpf);
        b1=new JButton("SUBMIT");
        b1.setBounds(220,270,100,30);
        add(b1);
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
  }
  public void sign()
{
     if((jtf0.getText().equals(""))||(jtf.getText().equals(""))||(jpf.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter Name,Username or Password");
            }
    else {
    try
    {
          Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizzical","root","");
             pr=con.prepareStatement("insert into login values(?,?,?)");
             pr.setString(1,jtf0.getText() );
             pr.setString(2,jtf.getText());
             pr.setString(3,jpf.getText()); 
             pr.executeUpdate();
             JDialog.setDefaultLookAndFeelDecorated(true);
           JOptionPane.showMessageDialog(null,"you have successfuly signed up");

    }
    catch(Exception e)
    {
        System.out.println(e);
    }
     }
}
    public static void main(String[] args) {
        new Register();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            sign();
        }
    }
}
