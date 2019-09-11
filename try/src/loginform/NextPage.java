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
import java.awt.event.*;
import javax.swing.*;



public class NextPage extends JFrame implements ActionListener
    {
    JButton j1;
    ImageIcon ic1;
    JLabel o1;
    public NextPage(){ 
        
        setLayout(null);
        setTitle("NextPage");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        j1=new JButton("Back");
        j1.setBounds(300, 250, 100, 30);
        j1.addActionListener(this);
        add(j1);
        setSize(600,500);
        setVisible(true);
    } 
     @Override
    public void actionPerformed(ActionEvent e)
    { 
       if(e.getSource()==j1)
       {
         new  LoginForm();
       }
       
   }
   
}

