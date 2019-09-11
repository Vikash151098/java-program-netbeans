/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author VK
 */
public class Application1 implements ActionListener {
    JButton b1,b2,b3;
      JMenu menu, submenu;  
          JMenuItem i1, i2, i3, i4, i5;  
   JPanel p,p1,p2,p3;
   Application2 p5;
   Application3 p4;
    public Application1()
    {
          JFrame f= new JFrame("Menu and MenuItem Example");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Panel 1");  
          i1.addActionListener(this);
          i2=new JMenuItem("Panel 2");  
           i2.addActionListener(this);
          i3=new JMenuItem("Panel 3");  
           i3.addActionListener(this);
          i4=new JMenuItem("Panel 4");
           i4.addActionListener(this);
          i5=new JMenuItem("Panel 5");
           i5.addActionListener(this);
          submenu.add(i4); submenu.add(i5);  
          menu.add(i1); menu.add(i2); menu.add(i3);  
          mb.add(menu);  
          mb.add(submenu); 
          p=new JPanel(new CardLayout());
          p.setBackground(Color.darkGray);
          p.setBounds(0,0,1366,1200);
          
          p1=new JPanel(new BasicOptionPaneUI.ButtonAreaLayout(true, 0));
          p1.setBackground(Color.BLUE);
          JPanel pb=new JPanel();
          pb.setBounds(0,0,200,150);
          b1=new JButton("Pannel 4");
          b1.addActionListener(this);
           b1.setBackground(Color.WHITE);
           pb.add(b1);
          p1.add(pb);
          
          p2=new JPanel();
          
          p2.setBackground(Color.YELLOW);
           
          p3=new JPanel();
          p3.setBackground(Color.GREEN);
          
          p4=new Application3();
          b2=new JButton("back");
          b2.setBounds(0,0,100,80);
          b2.addActionListener(this);
           b2.setBackground(Color.cyan);
          p4.add(b2);
           
          p5=new Application2();
          f.add(p);
          f.setJMenuBar(mb);  
          f.setSize(1366,1200);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          f.setLayout(null);  
          f.setVisible(true);  
          f.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Application1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(p1);
            p.repaint();
            p.revalidate();
            
        }
        else if(e.getSource()==i2)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p2);
            p.repaint();
            p.revalidate();
        }
        else if(e.getSource()==i3)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p3);
            p.repaint();
            p.revalidate();
        }
        else if(e.getSource()==i4)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p4);
            p.repaint();
            p.revalidate();
        }
        else if(e.getSource()==i5)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p5);
            p.repaint();
            p.revalidate();
        }
        else if(e.getSource()==b1)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p4);
            p.repaint();
            p.revalidate();
        }
        else if(e.getSource()==b2)
        {
            //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            p.add(p1);
            p.repaint();
            p.revalidate();
        }
       
    }
}
