/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludo;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class first  extends JFrame
{
    JPanel p;
    Ludo_Board p1;
    public first()
    {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,620);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        p=new JPanel(new CardLayout());
        p.setBounds(0,0,600,620);
        setContentPane(p);
        p1=new Ludo_Board();
        p.add(p1);
    }
    
    public static void main(String[] args) {
        new first();
    }
}
