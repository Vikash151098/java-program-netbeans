/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludo;

import javax.swing.JFrame;

/**
 *
 * @author VK
 */
public class activity extends JFrame {
    public activity()
    {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new activity();
    }
    
}
