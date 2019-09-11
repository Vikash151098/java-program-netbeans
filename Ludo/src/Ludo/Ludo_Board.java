/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ludo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
public class Ludo_Board  extends JPanel implements ActionListener
{
    int j=240;
int k=0;
int l=0;
    JButton b[];
    Ludo_Board()
    {
        setLayout(null);
        setSize(600,620);
        setVisible(true);
        JButton b[]=new JButton[18];;

        
for(int i=0;i<18;i++,l++)
        {
            b[i] =new JButton();
       if(l==3)
       {
           k=k+40;
           j=240;
       }
        b[i].setBounds(j,k,40,40);
       b[i].addActionListener(this);
        add(b[i]);
        
        j=j+40;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
