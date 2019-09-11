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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.Color;

public class LoginForm extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JButton b1, b2, b3, b4;
    JTextField t1;
    JPasswordField t2;
    ImageIcon ic1;
    JLabel j1, j2, k1, k2, l2, j4, l1, l7;
    int count;

    Container C;
    ImageIcon img, img1;

    public LoginForm() {

        setLayout(null);

        setTitle("Login Window");

        l1 = new JLabel();
        l1.setBounds(0, 0, 600, 500);
        ImageIcon img4 = new ImageIcon("src/Images/Lib.jpeg");
        l1.setIcon(img4);
        setContentPane(l1);
        setResizable(false);
        JLabel l2 = new JLabel("Create a New Account !");

        l2.setBounds(250, 250, 180, 40);
        l2.setForeground(Color.white);

        add(l2);

        b1 = new JButton("   Login");
        img = new ImageIcon("src/Images/login.PNG");
        b1 = new JButton(img);
        b1.setBounds(228, 170, 70, 40);
        b1.addActionListener(this);
        add(b1);
        b2 = new JButton("Reset");
        img1 = new ImageIcon("src/Images/refresh.PNG");
        b2 = new JButton(img1);
        b2.setBounds(150, 170, 70, 40);
        b2.addActionListener(this);
        add(b2);
        b3 = new JButton("Sign Up");
        b3.addActionListener(this);
        b3.setBounds(280, 290, 90, 35);
        add(b3);

        j1 = new JLabel("Username");
        j1.setBounds(80, 100, 80, 20);
        j1.setForeground(Color.white);
        add(j1);
        j2 = new JLabel("Password");
        j2.setBounds(80, 130, 80, 20);
        j2.setForeground(Color.white);
        add(j2);
        k2 = new JLabel("LOGIN FORM");
        k2.setBounds(180, 30, 150, 60);
        k2.setForeground(Color.white);
        add(k2);
        t1 = new JTextField();
        t1.setBounds(150, 100, 150, 20);
        t1.addActionListener(this);
        add(t1);
        t2 = new JPasswordField();
        t2.setBounds(150, 130, 150, 20);
        t2.addActionListener(this);
        add(t2);
        l7 = new JLabel("Forget Password!");
        l7.setBounds(100, 250, 150, 35);
        l7.setForeground(Color.white);
        add(l7);
        b4 = new JButton("Forget");
        b4.setBounds(120, 290, 70, 35);
         b4.addActionListener(this);
        add(b4);

        setSize(600, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b3) {
            new Sign_up();
            dispose();
        }
        Connection con;
        Statement stmt;
        ResultSet rs;
            if (e.getSource() == b4) {
                    new Forget();
                }
        if (e.getSource() == b1) {
            count = 0;
            String uuserid = t1.getText();
            String upassword = t2.getText();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                System.out.println("connection");
                stmt = con.createStatement();
                rs = stmt.executeQuery("select* from test ");
                while (rs.next()) {
                    String name1 = rs.getString(1);
                    String pass1 = rs.getString(2);
                    if (uuserid.equals(name1) && upassword.equals(pass1)) {
                        count = count + 1;
                        System.out.println("Succesfull user");
                        new lib_home();
                    }

                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(this, "invalid user");

                }
               
            } 
            catch (Exception e1) {
                System.out.println(e1);
            }

        }
   
    }
   

    public static void main(String[] args) {
        // TODO code application logic here
        new LoginForm();

    }
}
