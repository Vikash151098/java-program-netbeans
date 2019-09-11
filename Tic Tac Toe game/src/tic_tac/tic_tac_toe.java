/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author VK
 */
public class tic_tac_toe extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton reset;
    ImageIcon img1,img2;
    Icon a[]=new Icon[9];
  public static  boolean event;
    public tic_tac_toe()
    {
        setIcon();
        setLayout(null);
        img1=new ImageIcon(getClass().getResource("/pic/circle.png"));
         img2=new ImageIcon(getClass().getResource("/pic/cross.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1=new JButton();
        b1.setBounds(0,0,100,100);
       
      b1.addActionListener(this);
        add(b1);
        b2=new JButton();
        b2.setBounds(100,0,100,100);
        b2.addActionListener(this);
        add(b2);
        b3=new JButton();
        b3.setBounds(200,0,100,100);
        b3.addActionListener(this);
        add(b3);
        b4=new JButton();
        b4.setBounds(0,100,100,100);
        b4.addActionListener(this);
        add(b4);
        b5=new JButton();
        b5.setBounds(100,100,100,100);
        b5.addActionListener(this);
        add(b5);
        b6=new JButton();
        b6.setBounds(200,100,100,100);
        b6.addActionListener(this);
        add(b6);
        b7=new JButton();
        b7.setBounds(0,200,100,100);
        b7.addActionListener(this);
        add(b7);
        b8=new JButton();
        b8.setBounds(100,200,100,100);
        b8.addActionListener(this);
        add(b8);
        b9=new JButton();
        b9.setBounds(200,200,100,100);
        b9.addActionListener(this);
        add(b9);
        reset=new JButton("RESET");
        reset.setBounds(100,320,80,30);
        reset.addActionListener(this);
        add(reset);
        setSize(350,400);
        setVisible(true);
        setResizable(false);
    }
    public static void main(String[] args) {
        new tic_tac_toe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
         if(e.getSource()==b1)
       {
          
          if(b1.getIcon()==null)
          {
             
           b1.setIcon(select_img());
            a[0]=b1.getIcon();
           result();
          }
       }
       else   if(e.getSource()==b2)
       {
           if(b2.getIcon()==null)
           {
           
          b2.setIcon(select_img());
          a[1]=b2.getIcon();
          result();
           }
       }
        else   if(e.getSource()==b3)
       {
           if(b3.getIcon()==null)
           {
           
          b3.setIcon(select_img()); 
          a[2]=b3.getIcon();
          result();
       }
       }
         else   if(e.getSource()==b4)
       {
           if(b4.getIcon()==null)
           {
           
          b4.setIcon(select_img()); 
          a[3]=b4.getIcon();
          result();
           }
       }
         else   if(e.getSource()==b5)
       {
           if(b5.getIcon()==null)
           {
           
          b5.setIcon(select_img()); 
          a[4]=b5.getIcon();
          result();
       }
       }
         else   if(e.getSource()==b6)
       {
           if(b6.getIcon()==null)
           {
          
          b6.setIcon(select_img()); 
           a[5]=b6.getIcon();
          result();
       }
       }
         else   if(e.getSource()==b7)
       {
           if(b7.getIcon()==null)
           {
           
           b7.setIcon(select_img());
           a[6]=b7.getIcon();
           result();
       }
       }
         else   if(e.getSource()==b8)
       {
           if(b8.getIcon()==null)
           {
           
          b8.setIcon(select_img()); 
          a[7]=b8.getIcon();
          result();
       }
       }
         else   if(e.getSource()==b9)
       {
           if(b9.getIcon()==null)
           {
          
           b9.setIcon(select_img());
            a[8]=b9.getIcon();
           result();
       }
       }
         else if(e.getSource()==reset)
         {
             reset();
         }
    }
    // select icon to set on the button
    ImageIcon select_img()
    {
       if(event==true)
       {
           
           event=false;
           return img1;
       }
      else
       {
           event=true;
           return img2;
       }
        
    }
    //check the result which player is win or not
    void result()
    {
        if(a[0]==a[1]&&a[1]==a[2])
        {
            if(a[2]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
            else  if(a[2]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else   if(a[3]==a[4]&&a[4]==a[5])
        {
        if(a[5]==img2)    
        
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
        else if(a[5]==img1)    
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else    if(a[6]==a[7]&&a[7]==a[8])
        {
            if(a[8]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
            else  if(a[8]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else   if(a[0]==a[3]&&a[3]==a[6])
        {
            if(a[6]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
        else if(a[6]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this,"player 2 won");
            reset();
        }
        }
        else   if(a[1]==a[4]&&a[4]==a[7])
        {
            if(a[7]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
        else if(a[7]==img1) 
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else   if(a[2]==a[5]&&a[5]==a[8])
        {
            if(a[8]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
            else if(a[8]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else   if(a[0]==a[4]&&a[4]==a[8])
        {
            if(a[8]==img2)
                
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
            else   if(a[8]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
        else   if(a[2]==a[4]&&a[4]==a[6])
        {
            if(a[6]==img2)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 1 won");
            reset();
        }
            else if(a[6]==img1)
        {
            JOptionPane.showMessageDialog(tic_tac_toe.this, "player 2 won");
            reset();
        }
        }
    }
    void reset()
    {
        event=false;
        for(int i=0;i<9;i++)
        {
            a[i]=null;
        }
        b1.setIcon(null);
        b2.setIcon(null);
        b3.setIcon(null);
        b4.setIcon(null);
        b5.setIcon(null);
        b6.setIcon(null);
        b7.setIcon(null);
        b8.setIcon(null);
        b9.setIcon(null);
    }
    void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Tic_Tac_Toe_red1.png")));
    }
}