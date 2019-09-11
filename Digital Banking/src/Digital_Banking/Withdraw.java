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
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class Withdraw extends JPanel implements ActionListener
{
    Welcome p20;
    JLabel l0,l1;
     JTextField jtf;
      JButton b1,b2,b3;
      Connection con;
    Statement stmt;
    PreparedStatement pr;
    ResultSet rs;
    int balance;
    int total;
     int hour,minute,month,day,year;
     View_Balance p10;
    public Withdraw()
    {
         setLayout(null);
         Color mynewblue=new Color(0,191,255);
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.BOLD,12);
        setBackground(mynewblue);
        l0=new JLabel("Withdraw");
        l0.setForeground(Color.WHITE);
        l0.setBounds(550,50,300,50);
        l0.setFont(ft);
        add(l0);
        l1=new JLabel("Amount");
        l1.setForeground(Color.WHITE);
        l1.setBounds(450,140,100,50);
        l1.setFont(ft);
        add(l1);
        jtf=new JTextField();
        jtf.setBounds(550,150,200,30);
        add(jtf);
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
        p20=new Welcome();
    }
void date_time()
    {
        LocalDateTime now=LocalDateTime.now();
       hour=now.get(ChronoField.HOUR_OF_DAY);
       minute=now.get(ChronoField.MINUTE_OF_HOUR);
       month=now.get(ChronoField.MONTH_OF_YEAR);
       day=now.get(ChronoField.DAY_OF_MONTH);
       year=now.get(ChronoField.YEAR);
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b1)
        {
            date_time();
             try
    {
        Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
             stmt=con.createStatement();
             System.out.println("connection");
              rs=stmt.executeQuery("select balance from login_detail where acc_id="+Login.acc_id);
              while(rs.next())
              {
                  balance=rs.getInt("balance");
              }
              if(balance>=Integer.parseInt(jtf.getText()))
              {
              
               total=balance-Integer.parseInt(jtf.getText());
               pr=con.prepareStatement("update login_detail set balance=? where acc_id="+Login.acc_id);
                pr.setInt(1,total);
                pr.executeUpdate();
                pr=con.prepareStatement("insert into translog values(?,?,?,?,?,?)");
             pr.setInt(1,0);
             pr.setString(2,Login.acc_id);
              pr.setString(3,"Withdraw");
               pr.setString(4,jtf.getText());
                pr.setString(5,Integer.toString(total));
                 pr.setString(6,Integer.toString(hour)+":"+Integer.toString(minute)+" "+Integer.toString(day)+"-"+
                    Integer.toString(month)+"-"+Integer.toString(year));
             pr.executeUpdate();
            
             JDialog.setDefaultLookAndFeelDecorated(true);
             JOptionPane.showMessageDialog(null, "Withdraw Sucessfully");
             p10=new View_Balance();
            //removing panel
           home.p.removeAll();
            home.p.repaint();
            home.p.revalidate();
            
            //adding panel
            
            home.p.add(p10);
            home.p.repaint();
            home.p.revalidate();
             jtf.setText("");
       }
              else
                  JOptionPane.showMessageDialog(null,"Insufficient Balance");
    }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
             
        }
        else if(e.getSource()==b2)
        {
            jtf.setText("");
        }
        else if(e.getSource()==b3)
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
