
package Digital_Banking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class userlogin extends JPanel implements ActionListener
{
    JPasswordField t1;
    JButton jb;
    Connection con;
    PreparedStatement pr;
     JTextField t0;
 public userlogin()
    {
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
        setBackground(mynewblue);
    JLabel j1=new JLabel("ENTER Account ID AND PASSWORD");
    j1.setBounds(220,30,300,50);
    add(j1);
    
    JLabel j2=new JLabel("Account ID:");
    j2.setBounds(150,160,300,50);
    add(j2);
    
     t0=new JTextField();
    t0.setBounds(250,170,200,25);
    add(t0);
    
    JLabel j3=new JLabel("PASSWORD:");
    j3.setBounds(150,210,300,50);
    
    add(j3);
     t1=new JPasswordField();
    t1.setBounds(250,220,200,25);
   add(t1);
    
     jb = new JButton("SUBMIT");
    jb.setBounds(460, 320,100, 25);
    jb.addActionListener(this);
    add(jb);
  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb)
        {
             try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
                System.out.println("connection");
                pr=con.prepareStatement("insert into login_detail values(?,?,?)");
                pr.setString(1,t0.getText());
                pr.setString(2,t1.getText());
                pr.setInt(3,0);
               pr.executeUpdate();
               JOptionPane.showMessageDialog(null,"You have succesfully completed And Go to Login Page");
            }
             catch(Exception e1)
             {
                 System.out.println(e1);
             }
        }
    }
 
}


