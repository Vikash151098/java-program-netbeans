package letsgetquizzical;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class First extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4;
 ImageIcon img1;
 JLabel l1;
 public First()
 {
     setIcon();
    Font ft=new Font("Times New Roman", Font.BOLD, 30);
     img1=new ImageIcon(getClass().getResource("/image/backlogo.jpg"));
    l1=new JLabel(img1);
     setContentPane(l1);
     l1.setBounds(0,0,600,500);
     b1=new JButton("Help");
     b1.setFont(ft);
      b1.setBounds(5,320,100,30);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
      b1.addActionListener(this);
      add(b1);
      setResizable(false);
    setSize(600,500);
     setLocationRelativeTo(null);
    setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     //setIconImage(getIconImage());
b4=new JButton("Won History");
     b4.setFont(ft);
     b4.setBackground(Color.blue);
      b4.setBounds(380,320,200, 50);
      b4.setForeground(Color.white);
      b4.addActionListener(this);
      add(b4);
     b2=new JButton("Play now!");
     b2.setFont(ft);
     b2.setBackground(Color.blue);
      b2.setBounds(380,380,200, 50);
      b2.setForeground(Color.white);
      b2.addActionListener(this);
      add(b2);

      b3=new JButton("Exit");
      b3.setFont(ft);
       b3.setBackground(Color.blue);
       b3.setForeground(Color.white);
      b3.setBounds(5,400, 100, 30);
      b3.addActionListener(this);
      add(b3);
 }
 
 public void actionPerformed(ActionEvent e)
 {
     if(e.getSource()==b1)
     {
        new help(); 
        dispose();
     }
     else if(e.getSource()==b2)
     {
         new connection().getdata();
         second.random();
        new second();
        dispose();
        
     }
     else if(e.getSource()==b3)
     {
         System.exit(0);
     }
     else if(e.getSource()==b4)
     {
         new PrizeHistory();
         dispose();
     }
 }
  void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }
}
