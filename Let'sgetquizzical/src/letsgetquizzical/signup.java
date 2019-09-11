package letsgetquizzical;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class signup extends JFrame implements ActionListener,KeyListener
{
    JButton b1,b2;
    JLabel l,l0 ,l1,l2;
    JTextField jtf,jtf1;
    JPasswordField jpf;
    ImageIcon img;
    PreparedStatement pr;
    Connection con;
    Statement stmt;
    ResultSet rs;
    int a=0;
    public signup()
    {
        setIcon();
        setResizable(false);
        Font ft=new Font("Times New Roman",Font.BOLD,18);
     img=new ImageIcon(getClass().getResource("/image/backlogo.jpg"));
    l=new JLabel(img);
    setContentPane(l);
    l.setBounds(0,0,600,500);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l0=new JLabel("Name");
    l0.setBounds(100,110,100,30);
    l0.setForeground(Color.WHITE);
      l0.setFont(ft);
    add(l0);
    jtf=new JTextField();
    jtf.setBounds(220,110,150,30);
    add(jtf);
    l1=new JLabel("Username");
    l1.setForeground(Color.WHITE);
    l1.setBounds(100,150,100,30);
    l1.setFont(ft);
    add(l1);
    jtf1=new JTextField();
    jtf1.setBounds(220,150,150,30);
    add(jtf1);
    l2=new JLabel("Password");
    l2.setForeground(Color.WHITE);
    l2.setBounds(100,200,100,30);
     l2.setFont(ft);
    add(l2);
    jpf=new JPasswordField();
    jpf.setBounds(220,200,150,30);
    jpf.addKeyListener(this);
    add(jpf);
    b1=new JButton("Back");
    b1.setBounds(120,250,100,30);
    b1.setFont(ft);
    b1.addActionListener(this);
    add(b1);
    b2=new JButton("Sign Up");
    b2.setBounds(250,250,100,30);
    b2.setFont(ft);
    b2.addActionListener(this);
    add(b2);
    setSize(600,500);
    setLocationRelativeTo(null);
    setVisible(true);
    }
   public void sign()
{  
     if((jtf.getText().equals(""))||(jtf1.getText().equals(""))||(jpf.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter Name,Username or Password");
            }
    
    else {
         try
         {
         String uname;
         con=Database.getconnection();
             stmt=con.createStatement();
             rs=stmt.executeQuery("select username from login");
             while(rs.next())
        {
            uname=rs.getString(1);
        
         if(uname.equals(jtf1.getText()))
         {
             JOptionPane.showMessageDialog(null, "username you entered is already exist so try another username");
             a++;
             new signup();
             dispose();
         }
        }
         }
         catch(Exception e1)
         {
             System.out.println(e1);
         }
       if(a==0) 
       {
    try
    {
             con=Database.getconnection();
             stmt=con.createStatement();
             stmt.executeUpdate("create table "+jtf1.getText().toString()+"(date varchar(15),prizewon varchar(10))");
             System.out.println("created table in database");
             pr=con.prepareStatement("insert into login values(?,?,?)");
             pr.setString(1,jtf.getText() );
             pr.setString(2,jtf1.getText());
             pr.setString(3,jpf.getText()); 
             pr.executeUpdate();
             JDialog.setDefaultLookAndFeelDecorated(true);
           JOptionPane.showMessageDialog(null,"you have successfuly signed up");
          new home();
          dispose();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
     }
}
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            new home();
            dispose();
        }
        else if(e.getSource()==b2)
        {
            sign();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==10)
        {
            sign();
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }
}