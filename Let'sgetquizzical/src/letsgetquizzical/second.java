package letsgetquizzical;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class second extends JFrame implements ActionListener
{
    
    JLabel jl1;
    MultiLineLabel jl2;
    JLabel jl3;
    JButton btn1;
     JButton btn2;
      JButton btn3;
       JButton btn4;
       JButton btn5;
       JButton btn6;
       JButton btn7;
       ImageIcon img;
       ImageIcon img1;
       ImageIcon img2;
       ImageIcon img3;
       Border bf1;
    public static String ch;
  public static  int i=0;
  public static int value;
  public static  int j=0;
 static  boolean click1=true;
  static  boolean click2=true;
 static  int previous;
 static String str[][]={
        {" 1000","One thousand rupees only"}
        ,{" 5000","Five thousand rupees only"}
        ,{" 10000"," Ten thousand rupees only"}
        ,{" 20000","twenty thousand rupees only"}
        ,{" 50000","fifty thousand rupees only"}
        ,{" 1 lakh","One lakh rupees only"}
        ,{" 2 lakh","Two lakh rupees only"}
        ,{" 5 lakh","Five lakh rupees only"}
        ,{" 7 lakh","Seven lakh rupees only"}
        ,{" 10 lakh","Ten lakh rupees only"}};
       public second()
    {
        setIcon();
        Font ft1=new Font("Adove Gothic Std B", Font.BOLD, 12);
        bf1=BorderFactory.createLineBorder(Color.black, 2);
           
        setLayout(null);
        img=new ImageIcon(getClass().getResource("/image/background.jpg"));
        
       jl3=new JLabel("Rs "+str[j][0]);
       jl3.setBounds(10,90,80,40);
       jl3.setBorder(bf1);
       jl3.setForeground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl1=new JLabel(img);
        setContentPane(jl1);
        jl1.setBounds(0,0,600,500);
        Font ft=new Font("Times New Roman", Font.BOLD, 20);
        jl2=new MultiLineLabel(connection.result[second.value][1]);
        jl2.setFont(ft);
        jl2.setBackground(Color.BLACK);
        jl2.setBorder(bf1);
       jl2.setBounds(50,200,500,50);
        jl2.setForeground(Color.white);
       
        btn1=new JButton("A.  "+connection.result[second.value][2]);
        btn1.setBounds(50,300,240,50);
        btn1.setFont(ft1);
        btn1.setBackground(Color.blue);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        
        btn2=new JButton("B.  "+connection.result[second.value][3]);
        btn2.setBounds(300,300,240,50);
        btn2.setFont(ft1);
        btn2.setBackground(Color.blue);
        btn2.setForeground(Color.white);
         btn2.addActionListener(this);
        
        btn3=new JButton("C.  "+connection.result[second.value][4]);
        btn3.setBounds(50,400,240,50);
        btn3.setFont(ft1);
        btn3.setBackground(Color.blue);
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        
        btn4=new JButton("D.  "+connection.result[second.value][5]);   
        btn4.setBounds(300,400,240,50);
        btn4.setFont(ft1);
        btn4.setBackground(Color.blue);
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
       
        img1=new ImageIcon(getClass().getResource("/image/home.jpg"));
        btn5=new JButton(img1);
        btn5.setBounds(10,10,60,40);
        btn5.addActionListener(this);
        add(btn5);
        
         img2=new ImageIcon(getClass().getResource("/image/expert.jpg"));
        btn6=new JButton(img2);
        btn6.setBounds(510,10,60,40);
        btn6.addActionListener(this);
        add(btn6);
        
        img3=new ImageIcon(getClass().getResource("/image/flip1.jpg"));
        btn7=new JButton(img3);
        btn7.setBounds(430,10,60,40);
        btn7.addActionListener(this);
        add(btn7);
         add(jl2);
        add(jl3);
       add(btn1);
       add(btn2);
       add(btn3);
       add(btn4);
        setResizable(false);
        setSize(600,500);
         setLocationRelativeTo(null);
        setVisible(true);
    }
       public static void random()
       {
           Random  generator = new Random();
        value = generator.nextInt(10)+i;
        if(previous==second.value)
        {
            random();
        }
       }
       public static  int  next()
       {
          return  i=i+10;
       }
      public static int nextrupees()
      {
          return j++;
      }
       public void actionPerformed(ActionEvent e)
 {
    
      if(e.getSource()==btn1)
     {ch="a";
      new submit();
      dispose();
     }
       if(e.getSource()==btn2)
     {ch="b";
       new submit();
       dispose();
     }
       if(e.getSource()==btn3)
     {ch="c";
       new submit();
       dispose();
     }
        if(e.getSource()==btn4)
     {
         ch="d";
       new submit();
       dispose();
     }
      else  if(e.getSource()==btn5)
      {
          second.i=0;
         second.j=0;
         second.click1=true;
         second.click2=true;
          new First();
          dispose();
      }
      else  if(e.getSource()==btn6)
      {
          if(click1)
          {
       new expertcall();  
       dispose();
       click1=false;
          }
          else
          {
               JOptionPane.showMessageDialog(null, "You have already use this lifeline");
          }
      }
      else  if(e.getSource()==btn7)
      {
          if(click2)
          {
              previous=second.value;
          second.random();
           new second();
           click2=false;
           dispose();
          }
          else
          {
              JOptionPane.showMessageDialog(null, "You have already use this lifeline");
          }
      }
 }
    void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }
    }    
