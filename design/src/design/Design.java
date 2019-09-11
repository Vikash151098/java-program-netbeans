
package design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Design extends JFrame implements ActionListener{
 
      JLabel lbl1,lbl2;
      JTextField t1,t2;
      JButton b1,b2;
      Container ct; 
     public Design()
      {
     setLayout(null);
     ct=getContentPane();
     ct.setBackground(Color.yellow);
     lbl1=new JLabel("Username");
     lbl1.setBounds(40, 40, 80, 80);
     //lbl1.setBackground(Color.pink);
     //lbl1.setBorder(ABORT);
     t1=new JTextField();
     t1.setBounds(130, 40, 80, 80);
     //t1.setBackground(Color.red);
     lbl2=new JLabel("Password");
     lbl2.setBounds(40, 130, 80, 80);
     t2=new JTextField();
     t2.setBounds(130, 130, 80, 80);
     b1=new JButton("ADD");
     b1.setBackground(Color.red);
     
     b1.setBounds(40, 220, 80, 80);
     b2=new JButton("close");
     b2.setBounds(130, 220, 80, 80);
     b1.addActionListener(this);
     b2.addActionListener(this);
     add(lbl1);
     add(lbl2);
     add(t1);
     add(t2);
     add(b1);
     add(b2);
     setSize(500, 500);
     setVisible(true);
      }

    public static void main(String[] args) {
new Design();
    }

    
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1)
      {
       String uname=t1.getText();
       String upass=t2.getText();
       if(uname.equals("admin") && upass.equals("admin"))
       {
        new nextframe(uname); 
        dispose();
       }
       
     System.out.println("first button");     
      }
      else if(e.getSource()==b2)
      {
          System.out.println("second button");     
      }
      
    }
    
}
