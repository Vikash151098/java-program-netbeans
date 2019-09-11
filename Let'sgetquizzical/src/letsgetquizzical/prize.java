/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgetquizzical;

/**
 *
 * @author VK
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
public class prize extends JFrame  implements ActionListener
{
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5;
    ImageIcon img;
    String days;
    String months;
    String years;
    
    public prize()
    {
        setIcon();
        Font ft=new Font("Harlow Solid Italic",Font.ITALIC,18);
        Font ft1=new Font("Times New Roman", Font.BOLD, 25);
        
        setLayout(null);
        img=new ImageIcon(getClass().getResource("/image/check.jpg"));
        l1=new JLabel(img);
        setContentPane(l1);
        l2=new JLabel(home.name);
        l2.setBounds(70,122,300,25);
        l2.setForeground(Color.BLACK);
        l2.setFont(ft);
       
        add(l2);
        l3=new JLabel(second.str[second.j][1]);
         l3.setBounds(80,150,500,20);
         l3.setForeground(Color.BLACK);
        
        l3.setFont(ft);
        add(l3);
        l4=new JLabel(second.str[second.j][0]+"/-");
        l4.setBounds(460,170,110,20);
         l4.setForeground(Color.BLACK);
       
        l4.setFont(ft);
        add(l4);
        date();
        l5=new JLabel(days+"   "+months+"    "+years);
        l5.setBounds(458,82,114,20);
         l5.setForeground(Color.BLACK);
       
        l5.setFont(ft);
        add(l5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1=new JButton("HOME");
        b1.setBounds(50,420,120,50);
        b1.setFont(ft1);
        b1.setForeground(Color.white);
       b1.setBackground(Color.BLUE);
       b1.addActionListener(this);
        add(b1);
        b2=new JButton("Logout");
        b2.setBounds(450,420,120,50);
        b2.setFont(ft1);
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);
        setSize(600,500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }
     public void date()
    {
        LocalDateTime now=LocalDateTime.now();
        int day=now.get(ChronoField.DAY_OF_MONTH);
        int month=now.get(ChronoField.MONTH_OF_YEAR);
        int year=now.get(ChronoField.YEAR);
        
         days=Integer.toString(day);
        months=Integer.toString(month);
        years=Integer.toString(year);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
          new First();
         second.i=0;
         second.j=0;
         second.click1=true;
         second.click2=true;
         dispose();
        }
        else if(e.getSource()==b2)
        {
          
          new home();
          dispose();
        }
       
    }
     void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    } 
}
