/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author Jatin
 */
import javax.swing.*;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class Acc_Reg extends JFrame implements ActionListener{
    
    JButton b1;
    JLabel l1,l2;
    
    public Acc_Reg(){
        setLayout(null);
        l2=new JLabel();
   l2.setBounds(0, 0, 600, 500);
        ImageIcon img4=new ImageIcon("src/Images/Lib.jpeg");
        l2.setIcon(img4);
        setContentPane(l2);
        l1=new JLabel("Your Account Is Registered ");
        l1.setBounds(100, 200, 200, 30);
        l1.setForeground(Color.white);
        add(l1);
        b1=new JButton("Login");
        b1.setBounds(200, 250, 80, 30);
        b1.addActionListener(this);
        add(b1);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
         setResizable(false);
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b1){
       new LoginForm();
   }
    dispose();
        }
    public static void main(String[] args) {
        new Acc_Reg();
    }
}
   

