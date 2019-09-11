package letsgetquizzical;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class lakh extends JFrame implements ActionListener {
     JButton b1,b2;
     ImageIcon img1;
     ImageIcon img2;
     ImageIcon img3;
     JLabel l1;
     JLabel l2;
     JLabel l3;
     JLabel l4;
     Connection con;
    PreparedStatement pr;
    String days;
    String months;
    String years;
    public lakh()
    {
        setIcon();
    setLayout(null);
    setResizable(false);
    img1=new ImageIcon(getClass().getResource("/image/lakh.jpg")); 
    l1=new JLabel(img1);
    setContentPane(l1);
    l1.setBounds(0,0,100,50);
    img2=new ImageIcon(getClass().getResource("/image/quitgame.jpg"));
    b1=new JButton(img2);
    b1.setBounds(10,380,150,50);
    b1.addActionListener(this);
    add(b1);
    img3=new ImageIcon(getClass().getResource("/image/continue.jpg"));
     b2=new JButton(img3);
     b2.setBounds(400,380, 150, 50);
     b2.addActionListener(this);
     add(b2);
     l2=new JLabel("CONGRATULATIONS!!!");
     l2.setBounds(50,50,550,40);
     Font ft=new Font("forte", Font.ITALIC, 50);
     l2.setFont(ft);
     l2.setForeground(Color.white); 
     add(l2);
     l3=new JLabel("WOW,YOU WON 1 LAKH!!!.");
     l3.setBounds(50,200,550,40);
     Font ft2=new Font("forte", Font.BOLD, 38);
     l3.setFont(ft2);
     l3.setForeground(Color.WHITE); 
     add(l3);
     l4=new JLabel("Click continue to win more prizes");
     l4.setBounds(100,250,550,40);
     Font ft3=new Font("forte", Font.BOLD, 24);
     l4.setFont(ft3);
     l4.setForeground(Color.blue); 
     add(l4);
    setSize(600,500);
     setLocationRelativeTo(null);
    setVisible(true);
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
     public void actionPerformed(ActionEvent e)
 {
     if(e.getSource()==b2)
        {
            second.next();
            second.nextrupees();
            second.random();
           new second();
           dispose();
       }
     else if (e.getSource()==b1)
                  {
                      set();
                    new prize();
                    dispose();
                  }
 } 
     void set()
                      {
        try
            {
                date();
               con=Database.getconnection();
               
                pr=con.prepareStatement("insert into "+ home.uname+" values(?,?)");
             pr.setString(1,days+"/"+months+"/"+years );
             pr.setString(2,second.str[second.j][0]+"/-");
             pr.executeUpdate(); 
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
}
