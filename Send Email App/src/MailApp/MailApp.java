/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MailApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Vikash Kumar
 */
public class MailApp extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField j1,j2;
    JTextArea a1;
    JButton b;
    
   public MailApp()
   {
       setLayout(null);
     l1=new JLabel("TO");
     l1.setBounds(0,0,50,30);
     add(l1);
     j1=new JTextField();
     j1.setBounds(80,0,150,30);
     j1.addActionListener(this);
     add(j1);
     l2=new JLabel("Subject");
     l2.setBounds(0,50,50,30);
     add(l2);
     j2=new JTextField();
     j2.setBounds(80,50,150,30);
     j2.addActionListener(this);
     add(j2);
     l2=new JLabel("Message");
     l2.setBounds(0,100,80,30);
     add(l2);
     a1=new JTextArea();
     a1.setBounds(80,100,150,80);
     add(a1);
     b=new JButton("send");
     b.setBounds(100,210,80,30);
     b.addActionListener(this);
     add(b);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(600,400);
     setVisible(true);
   }
   public static void main(String[] args) {
        MailApp app=new MailApp();
        
    }
   private static boolean netIsAvailable()
   {
       try
       {
           final URL url=new URL("http://www.google.com");
           final URLConnection con=url.openConnection();
           con.connect();
           con.getInputStream().close();
           return true;
       }
       catch(MalformedURLException e)
       {
           throw new RuntimeException(e);
       }
       catch(IOException e)
       {
           return false;
       }
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
        {
            
                String to=j1.getText();
                String subject=j2.getText();
                String message=a1.getText();
                
               final String user="vikash991527@gmail.com";
               final String pass="Vikash@1998";
                
               if(netIsAvailable())
               {
            try {
                SendMail.send(to,subject,message,user,pass);
            } catch (MessagingException ex) {
                Logger.getLogger(MailApp.class.getName()).log(Level.SEVERE, null, ex);
            }
               } 
               else
               {
                   JOptionPane.showMessageDialog(null,"Pleae Connect to Internet");
                   MailApp app=new MailApp();
                   dispose();
               }
        }
    }
}
