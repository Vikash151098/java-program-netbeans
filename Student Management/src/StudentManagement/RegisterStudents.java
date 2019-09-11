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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class RegisterStudents extends JFrame implements ActionListener
{
    JLabel l0,l1,l2,l3,l4,l5,l6,l7;
    JTextField jtf0,jtf1,jtf2,jtf6,jtf7;
    static JTextField jtf5;
    JComboBox jb1,jb2;
    JButton b1,b2;
    Connection con;
    PreparedStatement pr;
    String []str1={"SELECT","B TECH","MBA"};
    String []str2={"SELECT","CSE","ME","ECE","CE"};
  public RegisterStudents()
  {
      Font ft=new Font("Times New Roman", Font.BOLD,15);
       setTitle("Register Student");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0=new JLabel("NAME");
        l0.setBounds(100,100,150,30);
        l0.setFont(ft);
        add(l0);
         jtf0=new JTextField();
        jtf0.setBounds(250,100,150,30);
        jtf0.addActionListener(this);
        add(jtf0);
        l1=new JLabel("FATHER'S NAME");
        l1.setBounds(100,150,150,30);
        l1.setFont(ft);
        add(l1);
        jtf1=new JTextField();
        jtf1.setBounds(250,150,150,30);
        jtf1.addActionListener(this);
        add(jtf1);
         l2=new JLabel("MOTHER NAME");
        l2.setBounds(100,200,150,30);
        l2.setFont(ft);
        add(l2);
        jtf2=new JTextField();
        jtf2.setBounds(250,200,150,30);
        jtf2.addActionListener(this);
        add(jtf2);
         l3=new JLabel("COURSE");
        l3.setBounds(100,250,150,30);
        l3.setFont(ft);
        add(l3);
        jb1=new JComboBox(str1);
        jb1.setBounds(250,250,150,30);
        jb1.addActionListener(this);
        add(jb1);
         l4=new JLabel("BRANCH");
        l4.setBounds(100,300,150,30);
        l4.setFont(ft);
        add(l4);
        jb2=new JComboBox(str2);
        jb2.setBounds(250,300,150,30);
        jb2.addActionListener(this);
        add(jb2);
        l5=new JLabel("ROLL NO.");
        l5.setBounds(100,350,150,30);
        l5.setFont(ft);
        add(l5);
        jtf5=new JTextField();
        jtf5.setBounds(250,350,150,30);
        jtf5.addActionListener(this);
        add(jtf5);
        l6=new JLabel("ADDRESS ");
        l6.setBounds(100,400,150,30);
        l6.setFont(ft);
        add(l6);
        jtf6=new JTextField();
        jtf6.setBounds(250,400,150,30);
        jtf6.addActionListener(this);
        add(jtf6);
         l7=new JLabel("CONTACT NO.");
        l7.setBounds(100,450,150,30);
        l7.setFont(ft);
        add(l7);
        jtf7=new JTextField();
        jtf7.setBounds(250,450,150,30);
        jtf7.addActionListener(this);
        add(jtf7);
        b1=new JButton("SUBMIT");
        b1.setBounds(220,520,100,30);
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
        new RegisterStudents();
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
                pr=con.prepareStatement("insert into student_detail values(?,?,?,?,?,?,?,?,?)");
                pr.setInt(1,0);
                pr.setString(2,jtf0.getText());
                pr.setString(3,jtf1.getText());
                pr.setString(4,jtf2.getText());
                pr.setString(5,jb1.getSelectedItem().toString());
                pr.setString(6,jb2.getSelectedItem().toString());
                pr.setString(7,jtf5.getText());
                pr.setString(8,jtf6.getText());
                pr.setString(9,jtf7.getText());
                pr.executeUpdate();
                System.out.println("yes");
                
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
            new setfee();
            dispose();
        }
        else if(e.getSource()==b2)
        {
            new home();
           dispose();
        }
    }
}
