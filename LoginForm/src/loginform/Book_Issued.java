/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author Jatin
 */
public class Book_Issued extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1,l2;
     ImageIcon img,img1;
    public Book_Issued(){
        setLayout(null);
        setTitle("Book Is Issued");
        l1= new JLabel();
       img=new ImageIcon("src/Images/Lib.jpeg");
       l1.setBounds(0, 0, 600, 500);
        l1.setIcon(img);
        setContentPane(l1);
        l2=new JLabel("Your Book Is Issued Thankyou!");
        l2.setForeground(Color.white);
        l2.setBounds(100, 200, 200, 30);
        add(l2);
        
        b1=new JButton("   Login");
         img=new ImageIcon("src/Images/Home.PNG");
        b1=new JButton(img);
        b1.setBounds(210, 230, 70, 40);
        b1.addActionListener(this);
        add(b1);
        
      
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
         setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==b1){
    new lib_home();
    }
    
    dispose();
    }
    
    public static void main(String[] args) {
     new Book_Issued();
    }

   }

