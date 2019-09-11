/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author Jatin
 */
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm  extends JFrame implements ActionListener
{

    /**
     * @param args the command line arguments
     */
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    ImageIcon ic;
    JLabel j1,j2, k1 ;
    String username="vikash";
    String password="123";
     
    public  LoginForm(){
        
      
        setLayout(null);
        setTitle("Login Window");
        
        b1=new JButton("Login");
        b1.setBounds(228, 170, 70, 20);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Reset");
        b2.setBounds(150, 170,70, 20);
        b2.addActionListener(this);
        add(b2);
        j1=new JLabel("Username");
        j1.setBounds(80,100, 80, 20);
        add(j1);
        j2=new JLabel("Password");
        j2.setBounds(80,130, 80, 20);
        add(j2);
        t1=new JTextField();
        t1.setBounds(150, 100, 150, 20);
        t1.addActionListener(this);
        add(t1);
        t2=new JPasswordField();
        t2.setBounds(150, 130, 150, 20);
        t2.addActionListener(this);
        add(t2);
       setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
       
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    { 
   if(e.getSource()==b1){
       String str1=new String(t1.getText());
       String str2=new String(t2.getPassword());
       
       
       if(username.equals(str1)&&password.equals(str2))
       {
       new NextPage();
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Incorrect username or password");
       }
   }
   else if(e.getSource()==b2)
   {
       t1.setText("");
       t2.setText("");
       
   }
        }
    public static void main(String[] args) {
        // TODO code application logic here
   new LoginForm();
   
    }
    }
    
    

