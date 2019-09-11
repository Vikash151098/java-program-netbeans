/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital_Banking;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class home  implements ActionListener      
{
   public static JPanel p;
      JMenu menu1, menu2,menu3,menu4,menu5,menu6,help;  
          JMenuItem i0,i1, i2, i3, i4,deposite, i5,i6,i7,i8,i9,i10;  
          
          JPanel p0,p1;
          Login p2;
          Contact p3;
          Transfer p4;
           Deposite p7;
          Withdraw p8;
          Change_Password p5;
          TransLog p6;
         Welcome p9;
         View_Balance p10;
         signup p11;
         Profile p12;
         
    public home()
    {
        JFrame f= new JFrame("Digital Banking");  
          JMenuBar mb=new JMenuBar();  
          menu1=new JMenu("Menu");  
          menu2=new JMenu("Transaction");  
          menu3=new JMenu("View");
          menu4=new JMenu("More Selection");
          
          
          help=new JMenu("HELP");
          i1=new JMenuItem("Login");  
          i1.addActionListener(this);
          i0=new JMenuItem("Logout");  
          i0.addActionListener(this);
          i2=new JMenuItem("Sign Up");  
           i2.addActionListener(this);
          
         deposite=new JMenuItem("Deposite");
         deposite.addActionListener(this);
         i3=new JMenuItem("Withdraw Cash");  
           i3.addActionListener(this);
          i4=new JMenuItem("Transfer Fund");
           i4.addActionListener(this);
            i5=new JMenuItem("Balance Enquiry");
           i5.addActionListener(this);
            i6=new JMenuItem("TransLog");
           i6.addActionListener(this);
            i7=new JMenuItem("Profile");
            i7.addActionListener(this);
           i9=new JMenuItem("CONTACT");
           i9.addActionListener(this);
           i10=new JMenuItem("Change Password");
           i10.addActionListener(this);

          menu1.add(i1); menu1.add(i0); menu1.add(i2); 
          menu2.add(deposite);menu2.add(i3); menu2.add(i4);
          menu3.add(i5);menu3.add(i6);menu3.add(i7);
          menu4.add(i10);
          help.add(i9);
          mb.add(menu1);  
          mb.add(menu2); 
          mb.add(menu3); 
          mb.add(menu4); 
          mb.add(help); 
          p0=new JPanel();
          p0.setBounds(0,0,1366,80);
          p0.setBackground(Color.BLUE);
          ImageIcon i1=new ImageIcon("src/image/Digital-Banking.png");
         JLabel l=new JLabel(i1);
         p0.add(l);
          //f.add(p0);
           p1=new JPanel();
          p1.setBounds(0,0,1366,250);
          ImageIcon i2=new ImageIcon(getClass().getResource("/image/digital-bank.png"));
         JLabel l1=new JLabel(i2);
         p1.add(l1);
          f.add(p1);
          p9=new Welcome();
          p=new JPanel(new CardLayout());
          p.add(p9);
          p.setBounds(0, 250, 1366,660);
          f.add(p);
          f.setJMenuBar(mb);  
          f.setSize(1366,1200);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setLayout(null);  
          f.setVisible(true);  
          p2=new Login();
          p3=new Contact();
          p4=new Transfer();
          p7=new  Deposite();
          p8=new Withdraw();
          
          p11=new signup();
          JDialog.setDefaultLookAndFeelDecorated(true);
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p2);
            p.repaint();
            p.revalidate();
            
            
        }
        else if(e.getSource()==i0)
         {
             
             if(Login.acc_id!=null)
             {
                 Login.acc_id=null;
             JOptionPane.showMessageDialog(null,"Logout Sucessfully");
             }
             else
                 JOptionPane.showMessageDialog(null,"Please Login First");
             
             //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p9);
            p.repaint();
            p.revalidate(); 
                    }
        else if(e.getSource()==i2)
                    {
                    //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p11);
            p.repaint();
            p.revalidate(); 
                    }
         else  if(e.getSource()==deposite)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p7);
            p.repaint();
            p.revalidate(); 
        }
        }
        else  if(e.getSource()==i3)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p8);
            p.repaint();
            p.revalidate(); 
        }
        }
        else  if(e.getSource()==i4)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p4);
            p.repaint();
            p.revalidate(); 
        }
        }
        else  if(e.getSource()==i5)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
               
          p10=new View_Balance();
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p10);
            p.repaint();
            p.revalidate(); 
        }
        }
        else  if(e.getSource()==i6)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
                 p6=new TransLog();
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p6);
            p.repaint();
            p.revalidate(); 
        }
        }
        else  if(e.getSource()==i7)
        {
             if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
                 p12=new Profile();
            //removing panel
            
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p12);
            p.repaint();
            p.revalidate(); 
        }
        }
   else  if(e.getSource()==i8)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            //p.add();
            p.repaint();
            p.revalidate(); 
        }
        else  if(e.getSource()==i9)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p3);
            p.repaint();
            p.revalidate(); 
        }
        else  if(e.getSource()==i10)
        {
            if(Login.acc_id==null)
            {
                JOptionPane.showMessageDialog(null,"Please Login First");
            }
            else
            {
                p5=new Change_Password();
           // removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
           //adding panel
            
            p.add(p5);
            p.repaint();
            p.revalidate(); 
        }
        }
    }
    public static void main(String[] args) {
        new home();
    }
}
