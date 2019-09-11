/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class Application2 extends JPanel implements ActionListener
{
    
    public Application2()
    {
        setLayout(null);
        setBackground(Color.BLACK);
    final JPanel p1 = new JPanel();
    p1.setBackground(Color.yellow);
    p1.setBounds(200,200,100,100);
     final JPanel p2= new JPanel();
    p2.setBackground(Color.GREEN);
    p2.setBounds(300,320,100,100);
    JButton b1=new JButton("submit");
    b1.setBounds(50,50,100,50);
    b1.addActionListener(this);
    add(b1);
    JLabel l1=new JLabel("please click the button");
    l1.setBounds(170,50,150,50);
    add(l1);
    add(p1);
    add(p2);
        setSize(600,400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null, "Submit ");
      
    }

    }

  
    

