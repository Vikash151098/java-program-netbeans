/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author VK
 */
public class home extends JFrame  implements ActionListener{
    JButton b1,b2,b3,b4;
    public home()
    {
        setTitle("home");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1=new JButton("REGISTER NEW STUDENT");
        b1.setBounds(50,50,200,50);
        b1.addActionListener(this);
        add(b1);
         b2=new JButton("VIEW STUDENTS");
        b2.setBounds(350,50,200,50);
        b2.addActionListener(this);
        add(b2);
         b3=new JButton("SEARCH STUDENT");
        b3.setBounds(50,150,200,50);
        b3.addActionListener(this);
        add(b3);
         b4=new JButton("PAYMENT");
        b4.setBounds(350,150,200,50);
        b4.addActionListener(this);
        add(b4);
        setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new home();
    }

   
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
           new RegisterStudents();
           dispose();
        }
        else if(e.getSource()==b2)
        {
           new ViewStudents();
           dispose();
        }
        else  if(e.getSource()==b3)
        {
            new SearchStudent();
            dispose();
        }
        else  if(e.getSource()==b4)
        {
            new payment();
            dispose();
        }
    }
    
}
