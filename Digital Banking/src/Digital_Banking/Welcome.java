/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital_Banking;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class Welcome extends JPanel
{
    JLabel l;
    public Welcome()
    {
        Color mynewblue=new Color(0,191,255);
        setLayout(null);
        Font ft=new Font("Elephant", Font.BOLD,20);
        setBackground(mynewblue);
        l=new JLabel("Welcome To Use My Service");
        l.setFont(ft);
        l.setBackground(Color.YELLOW);
        l.setBounds(500,200,800,100);
        add(l);
    }
}
