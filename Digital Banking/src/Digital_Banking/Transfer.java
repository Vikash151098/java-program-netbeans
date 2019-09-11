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
public class Transfer extends JPanel implements ActionListener
{
    JLabel l1,l2,l3,l4;
     JTextField jtf,jtf1;
    JButton b1,b2,b3;
    Connection con;
    Statement stmt;
    PreparedStatement pr;
    ResultSet rs;
    Welcome p20;
    int balance1,balance2,total1,total2;
     int hour,minute,month,day,year;
     View_Balance p10;
    public Transfer()
    {
       
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.BOLD,12);
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
         setBackground(mynewblue);
        l1=new JLabel("TRANSFER");
       l1.setBounds(550,50,300,50);
       l1.setFont(ft);
       add(l1);
        l2=new JLabel("Amount");
        l2.setForeground(Color.WHITE);
        l2.setBounds(450,140,100,50);
        l2.setFont(ft);
        add(l2);
        jtf=new JTextField();
        jtf.setBounds(600,150,200,30);
        add(jtf);
        l3=new JLabel("To A/c Id");
        l3.setForeground(Color.WHITE);
        l3.setBounds(450,190,120,50);
        l3.setFont(ft);
        add(l3);
        jtf1=new JTextField();
        jtf1.setBounds(600,200,200,30);
        add(jtf1);
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
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            date_time();
         try
    {
        Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
             stmt=con.createStatement();
             
              rs=stmt.executeQuery("select balance from login_detail where acc_id="+Login.acc_id);
              while(rs.next())
              {
                  balance1=rs.getInt("balance");
              }
              if(balance1>=Integer.parseInt(jtf.getText()))
              {
               total1=balance1-Integer.parseInt(jtf.getText());
               pr=con.prepareStatement("update login_detail set balance=? where acc_id="+Login.acc_id);
                pr.setInt(1,total1);
                pr.executeUpdate();
                // To account 
                rs=stmt.executeQuery("select balance from login_detail where acc_id="+jtf1.getText());
              while(rs.next())
              {
                 
                  balance2=rs.getInt("balance");
              }
              total2=balance2+Integer.parseInt(jtf.getText());
              pr=con.prepareStatement("update login_detail set balance=? where acc_id="+jtf1.getText());
                pr.setInt(1,total2);
                pr.executeUpdate();
             pr=con.prepareStatement("insert into translog values(?,?,?,?,?,?)");
             pr.setInt(1,0);
             pr.setString(2,Login.acc_id);
              pr.setString(3,"Transfer to A/c Id"+jtf1.getText());
               pr.setString(4,jtf.getText());
                pr.setString(5,Integer.toString(total1));
                 pr.setString(6,Integer.toString(hour)+":"+Integer.toString(minute)+" "+Integer.toString(day)+"-"+
                    Integer.toString(month)+"-"+Integer.toString(year));
             pr.executeUpdate();
            
            JDialog.setDefaultLookAndFeelDecorated(true);
          JOptionPane.showMessageDialog(null, "Transfer Sucessfully");
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
            jtf1.setText("");
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
            jtf1.setText("");
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
