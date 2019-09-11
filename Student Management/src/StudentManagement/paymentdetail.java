/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

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

/**
 *
 * @author VK
 */
public class paymentdetail  extends JFrame implements ActionListener
{
    JLabel l0,l00,l1,l11,l2,l22,l3,l33,l4,l44,l5,l55,l6,l66;
    JButton b3;
    Connection con;
    Statement stmt;
    ResultSet rs;
    String sem;
    int total_amount;
    int paid_amount;
    String name;
    String fathername;
    public paymentdetail()
    {
        getdata();
        setTitle("paymentdetail");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0=new JLabel("NAME");
        l0.setBounds(100,10,100,30);
        add(l0);
        l00=new JLabel(name);
        l00.setBounds(250,10,100,30);
        add(l00);
        l1=new JLabel("FATHER'S NAME");
        l1.setBounds(100,50,100,30);
        add(l1);
         l11=new JLabel(fathername);
        l11.setBounds(250,50,100,30);
        add(l11);
        l2=new JLabel("ROLLNO");
        l2.setBounds(100,100,100,30);
        add(l2);
        l22=new JLabel();
        l22.setBounds(250,100,100,30);
        add(l22);
        l3=new JLabel("SEMESTER");
        l3.setBounds(100,150,100,30);
        add(l3);
        l33=new JLabel(sem);
        l33.setBounds(250,150,100,30);
        add(l33);
        l4=new JLabel("TOTAL FEE");
        l4.setBounds(100,200,100,30);
        add(l4);
         l44=new JLabel(Integer.toString(total_amount));
        l44.setBounds(250,200,100,30);
        add(l44);
        l5=new JLabel("PAID FEE");
        l5.setBounds(100,250,100,30);
        add(l5);
        l55=new JLabel(Integer.toString(paid_amount));
        l55.setBounds(250,250,100,30);
        add(l55);
        l6=new JLabel("PENDING FEE");
        l6.setBounds(100,300,100,30);
        add(l6);
        l66=new JLabel(Integer.toString(total_amount-paid_amount));
        l66.setBounds(250,300,100,30);
        add(l66);
        b3=new JButton("Pay Fee");
        b3.setBounds(250,530,100,30);
        b3.addActionListener(this);
        add(b3);
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    void getdata()
    {
           try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
                System.out.println("connection");
                stmt=con.createStatement();
             rs=stmt.executeQuery("select  * from  student_detail where rollno="+payment.jtf.getText());
             while(rs.next())
        {
            name=rs.getString("name");
            fathername=rs.getString("fathername");
           
        }
          rs=stmt.executeQuery("select * from payment where rollno="+payment.jtf.getText());
             while(rs.next())
             {
                 sem=rs.getString("semester");
                 total_amount=rs.getInt("total_amount");
                 paid_amount=rs.getInt("paid_amount");
                 
             }
             
            }
          catch(Exception e1)
          {
              System.out.println(e1);
          }
    }
    public static void main(String[] args) {
        new paymentdetail();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b3)
        {
            new PayFee();
            dispose();
        }
    }
}
