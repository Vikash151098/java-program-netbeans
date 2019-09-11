/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgetquizzical;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author VK
 */
public class PrizeHistory extends JFrame implements ActionListener
{
    ImageIcon img;
    JButton b1;
    JLabel jl;
    JTable jtb;
    Connection con;
    Statement stmt;
    PreparedStatement pr;
    ResultSet rs;
    String days;
    String months;
    String years;
    int count=0;
    Object str[][];
    String str1[]={"Date","Prize Amount"};
    public PrizeHistory()
    {
        Font ft2=new Font("forte",Font.BOLD, 18);
        get();
        setIcon();
        setLayout(null);
         
         img=new ImageIcon(getClass().getResource("/image/background.jpg"));
         jl=new JLabel(img);
         setContentPane(jl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jtb=new JTable(str, str1);
      // ScrollPane
    JScrollPane scrollPane = new JScrollPane(jtb);
    scrollPane.setBounds(0,100,600,400);
    getContentPane().add(scrollPane);
    b1=new JButton("Back");
      b1.setBounds(480,30,80,50);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
       b1.setFont(ft2);
      b1.addActionListener(this);
        add(b1);
        setSize(600,500);
        setVisible(true);
        //setResizable(false);
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
    
    void get()
        {
        try
            {
               
               con=Database.getconnection();
                
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from "+home.uname);
             while(rs.next())
             {
                 count++;
             }
             rs=stmt.executeQuery("select * from "+home.uname);
            str=new Object[count][2];
            int row=0;
             while(rs.next())
        {
            str[row][0]=rs.getString(1);
            str[row][1]=rs.getString(2);
            row++;
        }    
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }   
  }
    
    void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
             new First(); 
        dispose();
        }
        
    }
}
