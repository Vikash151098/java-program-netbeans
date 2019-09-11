package letsgetquizzical;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

public class help extends JFrame implements ActionListener
{
    JButton b1;
   JLabel l , l1,l2,l3,l4, l5,l6,l7,l8,l9,l10, l11 ,l13;
    
    ImageIcon img1;
    public help() 
    {
        setIcon();
       setLayout(null);
       setResizable(false);
       img1=new ImageIcon(getClass().getResource("/image/help1111.jpg"));
                l=new JLabel(img1);
                setContentPane(l);
    setTitle("Help");
    setSize(600,500);
     setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        l11=new JLabel("HELP DESK");
        l11.setBounds(150,20,300,40);
        Font ft=new Font("FORTE",Font.BOLD, 34);
        l11.setFont(ft);
        l11.setForeground(Color.white);
        add(l11);
        l2=new JLabel("2.EACH QUESTION WILL HAVE FOUR OPTIONS.");
        l2.setBounds(10,130,500,40);
        Font ft2=new Font("forte",Font.BOLD, 18);
        l2.setFont(ft2);
        l2.setForeground(Color.white);
        add(l2);
        l13=new JLabel("1.EACH ROUND HAS ONE QUESTION.");
        l13.setBounds(10,100,500,40);
        l13.setFont(ft2);
        l13.setForeground(Color.white);
        add(l13);
         l3=new JLabel("3.TIME RUNS AS OPTIONS ARE SHOWN.");
        l3.setBounds(10,160,600,40);
        l3.setFont(ft2);
        l3.setForeground(Color.white);
        add(l3);
         l4=new JLabel("4.YOU HAVE TO SELECT ONE APPROPRIATE OPTION.");
        l4.setBounds(10,190,800,40);
        l4.setFont(ft2);
        l4.setForeground(Color.white);
        add(l4);
         l5=new JLabel("5.ON CHOOSING CORRECT OPTION YOU MOVE TO NEXT LEVEL.");
        l5.setBounds(10,220,800,40);
        l5.setFont(ft2);
        l5.setForeground(Color.white);
        add(l5);
         l6=new JLabel("6.ON CHOOSING WRONG OPTION YOU HAVE TO EXIT GAME.");
        l6.setBounds(10,250,800,40); 
        l6.setFont(ft2);
        l6.setForeground(Color.white);
        add(l6);
         l7=new JLabel("7.THERE ARE TWO LIFELINES LIKE FLIP  & EXPERT CALL.");
        l7.setBounds(10,280,800,40);
        l7.setFont(ft2);
        l7.setForeground(Color.white);
        add(l7);
        l8=new JLabel("8.FLIP-WHERE QUESTION WILL BE FLIPED.");
        l8.setBounds(10,310,800,40);
        l8.setFont(ft2);
        l8.setForeground(Color.white);
        add(l8);
        l9=new JLabel("9.EXPERT CALL-WHERE YOU GET ANSWER.");
        l9.setBounds(10,340,800,40);
        l9.setFont(ft2);
        l9.setForeground(Color.white);
        add(l9);
        l10=new JLabel("10.YOU CAN USE THE LIFELINES ONLY ONCE IN WHOLE GAME.");
        l10.setBounds(10,370,800,40);   
        l10.setFont(ft2);
        l10.setForeground(Color.white);
        add(l10);
        b1=new JButton("Back");
        b1.setBackground(Color.blue);
        b1.setFont(ft2);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
      b1.setBounds(480,420, 80, 50);
      add(b1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
     {
        new First(); 
        dispose();
     }
    }
    void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    } 
}

