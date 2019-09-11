
package letsgetquizzical;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class incorrect extends JFrame implements ActionListener
{
JButton b1;
JButton b2;
JLabel l1,l3,l4;
MultiLineLabel l2;

ImageIcon img1;
   public incorrect() 
    {
        setIcon();
     setLayout(null);
     setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    img1=new ImageIcon(getClass().getResource("/image/oops2.jpg")); 
    l1=new JLabel(img1);
    setContentPane(l1);
    l1.setBounds(0,0,100,50);
     b1=new JButton("Logout");
      Font f=new Font("Georgia",Font.BOLD,30);
      b1.setFont(f);
     b1.setBounds(380,375,200,50);
     b1.setBackground(Color.blue);
     b1.setForeground(Color.white);
     add (b1);
     b1.addActionListener(this);
      b2=new JButton("Replay");
      Font ft1=new Font("Georgia",Font.BOLD,30);
      b2.setFont(ft1);
     b2.setBounds(10,375,200,50);
     b2.setBackground(Color.blue);
     b2.setForeground(Color.white);
     add (b2);
     b2.addActionListener(this);
     l2=new MultiLineLabel("Answer given by you is incorrect");
     l2.setBounds(70,180,500,150);
     Font ft=new Font("Georgia",Font.BOLD,27);
     l2.setFont(ft);
      l2.setForeground(Color.white);
     add(l2);
     l3=new JLabel("Correct Answer is :");
     Font ft2=new Font("Georgia",Font.BOLD,27);
     l3.setFont(ft2);
     l3.setForeground(Color.white);
     l3.setBounds(170,270,300,50);
     add(l3);
     l4=new JLabel(connection.result[second.value][6]);
      Font ft3=new Font("Georgia",Font.BOLD,27);
     l4.setFont(ft3);
     l4.setForeground(Color.white);
     l4.setBounds(270,305,100,50);
     add(l4);
     setSize(600,500);
        setLocationRelativeTo(null);
     setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
 {
     if(e.getSource()==b2)
     {
         new First();
         second.i=0;
         second.j=0;
         second.click1=true;
         second.click2=true;
         dispose();
     }
     if(e.getSource()==b1)
                  {
                    new home();
          dispose();
                  }
 }
     void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }
}

  
    

    