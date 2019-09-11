/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MailApp;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Vikash Kumar
 */
public class SendMail {
    
    public static void send(String to,String sub,String msg,final String user,final String pass) throws AddressException, MessagingException
    {
      Properties props=new Properties();
      props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
      props.put("mail.smtp.host","smtp.gmail.com");
      props.put("mail.smtp.port","587");
       
        
        Session session=Session.getDefaultInstance(props,new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(user, pass);
        }
        });
        try
        {
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);
            
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Email Sended!");
        }
        catch(MessagingException e)
        {
            JOptionPane.showMessageDialog(null,"something happens");
            throw new RuntimeException(e);
        }
    }
    
}
