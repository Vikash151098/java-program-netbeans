/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import static StudentManagement.RegisterStudents.jtf5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class setfee  extends JFrame implements ActionListener
{
    JLabel l0, l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField jtf[]=new JTextField[9];
    JButton b;
    Connection con;
    PreparedStatement pr;
    public setfee()
    {
        setTitle("set fee structure");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0=new JLabel("SEMESTER");
        l0.setBounds(100,50,100,30);
        add(l0);
        l9=new JLabel("AMOUNT");
        l9.setBounds(200,50,100,30);
        add(l9);
                
        l1=new JLabel("SEMESTER 1");
        l1.setBounds(100,100,100,30);
        add(l1);
        jtf[1]=new JTextField();
        jtf[1].setBounds(200,100,100,30);
        add(jtf[1]);
         l2=new JLabel("SEMESTER 2");
        l2.setBounds(100,150,100,30);
        add(l2);
        jtf[2]=new JTextField();
        jtf[2].setBounds(200,150,100,30);
        add(jtf[2]);
         l3=new JLabel("SEMESTER 3");
        l3.setBounds(100,200,100,30);
        add(l3);
        jtf[3]=new JTextField();
        jtf[3].setBounds(200,200,100,30);
        add(jtf[3]);
         l4=new JLabel("SEMESTER 4");
        l4.setBounds(100,250,100,30);
        add(l4);
        jtf[4]=new JTextField();
        jtf[4].setBounds(200,250,100,30);
        add(jtf[4]);
         l5=new JLabel("SEMESTER 5");
        l5.setBounds(100,300,100,30);
        add(l5);
        jtf[5]=new JTextField();
        jtf[5].setBounds(200,300,100,30);
        add(jtf[5]);
         l6=new JLabel("SEMESTER 6");
        l6.setBounds(100,350,100,30);
        add(l6);
        jtf[6]=new JTextField();
        jtf[6].setBounds(200,350,100,30);
        add(jtf[6]);
         l7=new JLabel("SEMESTER 7");
        l7.setBounds(100,400,100,30);
        add(l7);
        jtf[7]=new JTextField();
        jtf[7].setBounds(200,400,100,30);
        add(jtf[7]);
         l8=new JLabel("SEMESTER 8");
        l8.setBounds(100,450,100,30);
        add(l8);
        jtf[8]=new JTextField();
        jtf[8].setBounds(200,450,100,30);
        add(jtf[8]);
        b=new JButton("submit");
        b.setBounds(250,500,100,30);
        b.addActionListener(this);
        add(b);
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new setfee();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
             try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
                System.out.println("connection");
                for(int i=1;i<9;i++)
                {
                pr=con.prepareStatement("insert into payment values(?,?,?,?,?)");
                pr.setInt(1,0);
                pr.setString(2,RegisterStudents.jtf5.getText());
                pr.setInt(3,i);
                pr.setString(4,jtf[i].getText());
                pr.setString(5, null);
                pr.executeUpdate();
                System.out.println("yes");
            }
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
        }
    }
}
