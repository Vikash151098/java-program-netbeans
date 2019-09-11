package letsgetquizzical;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class correct extends JFrame implements ActionListener
{
    JButton btn1,btn2;
    ImageIcon img1;
    JLabel l1,l2;
    MultiLineLabel l3;
    Connection con;
    PreparedStatement pr;
    String days;
    String months;
    String years;
    public correct()
    {
        setIcon();
        img1=new ImageIcon(getClass().getResource("/image/background.jpg"));
    l1=new JLabel(img1);
     setContentPane(l1);
     l1.setBounds(0,0,600,500);
      Font ft2=new Font("forte",Font.BOLD, 25);
     l2=new JLabel("Correct Answer");
     l2.setFont(ft2);
     l2.setForeground(Color.white);
     l2.setBounds(190,150,300,50);
     add(l2);
     l3=new MultiLineLabel("Click Next button to Win more prize or Click Rupees Button to get prize");
     l3.setFont(ft2);
      l3.setForeground(Color.white);
     l3.setBounds(100,220,450,100);
     add(l3);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Font ft=new Font("Times New Roman", Font.BOLD, 33);
        btn1=new JButton("Next");
        btn1.setBounds(460,380,100,50);
        btn1.setFont(ft);
        btn1.setBackground(Color.blue);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        add(btn1);
        btn2=new JButton("Prize");
        btn2.setBounds(60,380,120,50);
        btn2.setFont(ft);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        add(btn2);
        
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
     if(e.getSource()==btn1)
        {
            second.next();
            second.nextrupees();
            second.random();
           new second();
           dispose();
           
       }
     else if (e.getSource()==btn2)
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