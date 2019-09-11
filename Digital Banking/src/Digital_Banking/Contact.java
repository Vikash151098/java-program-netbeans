/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital_Banking;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author VK
 */
public class Contact extends JPanel implements ActionListener
{
     JLabel l0,l1,l2,l3,l4,l5,l6;
    public Contact()
    {
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
        Font ft=new Font("Elephant", Font.BOLD,20);
        Font ft1=new Font("Elephant", Font.PLAIN,18);
        setBackground(mynewblue);
        l0=new JLabel("CONTACT   WITH  ME");
        l0.setForeground(Color.WHITE);
        l0.setBackground(Color.GRAY);
        l0.setBounds(550,50,300,50);
        l0.setFont(ft);
        add(l0);
        l1=new JLabel("Gmail : ");
        l1.setForeground(Color.WHITE);
        l1.setBounds(500,150,100,30);
        l1.setFont(ft1);
        add(l1);
        l2=new JLabel("vkumar0961@gmail.com ");
        l2.setForeground(Color.WHITE);
        l2.setBounds(650,150,300,30);
        l2.setFont(ft1);
        add(l2);
         l3=new JLabel("Yahoo :");
        l3.setForeground(Color.WHITE);
        l3.setBounds(500,200,100,30);
        l3.setFont(ft1);
        add(l3);
         l4=new JLabel("kumarv380@yahoo.com ");
        l4.setForeground(Color.WHITE);
        l4.setBounds(650,200,300,30);
        l4.setFont(ft1);
        add(l4);
         l5=new JLabel("Mobile No. :");
        l5.setForeground(Color.WHITE);
        l5.setBounds(500,250,120,30);
        l5.setFont(ft1);
        add(l5);
         l6=new JLabel("9915278218");
        l6.setForeground(Color.WHITE);
        l6.setBounds(650,250,150,30);
        l6.setFont(ft1);
        add(l6);
  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
