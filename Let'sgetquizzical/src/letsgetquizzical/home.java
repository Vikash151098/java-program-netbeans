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



public class home extends JFrame implements ActionListener,KeyListener
{
    int count=0;
    JLabel l,l1,l2;
   public JTextField jtf;
  public  JPasswordField jpf;
    JButton b1,b2;
 
    ImageIcon img;
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    static String name;
    static String uname;
public home() 
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
    l1=new JLabel("Username");
    l1.setForeground(Color.WHITE);
    l1.setBounds(100,100,100,30);
    l1.setFont(ft);
    add(l1);
    jtf=new JTextField();
    jtf.setBounds(220,100,150,30);
    add(jtf);
    l2=new JLabel("Password");
    l2.setForeground(Color.WHITE);
    l2.setBounds(100,150,100,30);
     l2.setFont(ft);
    add(l2);
    jpf=new JPasswordField();
    jpf.setBounds(220,150,150,30);
    jpf.addKeyListener(this);
    add(jpf);
    b1=new JButton("Login");
    b1.setBounds(120,200,100,30);
    b1.setFont(ft);
    b1.addActionListener(this);
    add(b1);
    b2=new JButton("Sign Up");
    b2.setBounds(250,200,100,30);
    b2.setFont(ft);
    b2.addActionListener(this);
    add(b2);
    setSize(600,500);
    setLocationRelativeTo(null);
    setVisible(true);
}
public void login()
{
    
     String pass=null;
     if((jtf.getText().equals(""))||(jpf.getText().equals("")))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter username and password");
            }
     else
     {
    try
    {
             con=Database.getconnection();
        
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from login");
             while(rs.next())
        {
            name=rs.getString(1);
             uname=rs.getString(2);
             pass=rs.getString(3);
            
            if(uname.equals(jtf.getText())&&pass.equals(jpf.getText()))
            {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"you have successfully logged in");
                new First();
                dispose();
                count++;
                break;
            }
            
      }
          if(count==0) 
          {
              JDialog.setDefaultLookAndFeelDecorated(true);
              JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
          }   
    }
    
    catch(Exception e)
    {
        System.out.println(e);
    }
     }
     
}
    public static void main(String[] args) {
     new   home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
           login();
        }
        else if(e.getSource()==b2)
        {
            new signup();
            dispose();
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
           login();
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
