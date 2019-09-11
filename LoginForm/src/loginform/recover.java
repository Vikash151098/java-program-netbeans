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
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class recover extends JFrame implements ActionListener{
  JTextField t1;

    public recover(){
      t1=new JTextField();
      t1.setBounds(100, 150, 150, 30);
      add(t1);
        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
    
    public static void main(String[] args) {
       new recover(); 
    }

    

   
    public void actionPerformed(ActionEvent e) {
   }

   
}
