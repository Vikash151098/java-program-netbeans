/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class keyviewer extends JFrame implements KeyListener{
    JTextField j1=new JTextField(80);
         JLabel l1=new JLabel("Press any key in the text field.");
     keyviewer()
     {
         setLayout(new BorderLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         j1.addKeyListener(this);
         add(j1,BorderLayout.CENTER);
         add(l1,BorderLayout.NORTH);
         setSize(300,200);
         setVisible(true);
     }
    public static void main(String[] args) {
       new keyviewer();
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        String k=e.getKeyText(key);
      //  l1.setText("you pressed       ");
        System.out.println(key);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
