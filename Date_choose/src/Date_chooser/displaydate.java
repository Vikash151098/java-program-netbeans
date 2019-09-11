/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Date_Chooser;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author VK
 */
 class Date_Chooser  extends JComponent implements ItemListener
{
     public static final int LEAST_ALLOWED = 200; // default setting for

    // maxAllowed
      private int maxAllowed = LEAST_ALLOWED; // max width allowed to use

    private boolean maxAllowedSet = false; // signals if the max allowed width

    // has been explicitly set
    
    JComboBox b1,b2,b3;
    Object  month[]={"Month",1,2,3,4,5,6,7,8,9,10,11,12},year[];
    int j=1950;
    boolean check=true;
    Date_Chooser()
    {
        year=new Object[200];
        year[0]="Year";
        for( int i=1;i<200;i++)
        {
            year[i]=j;
            j++;
        }
        int x=super.getX();
        int y=super.getY();
        int width=super.getWidth();
        b1=new JComboBox(month);
       b1.addItemListener(this);
       b1.setBounds(x,y,50,30);
       add(b1);
        b2=new JComboBox();
         b2.setBounds(x+50,y,40,30);
         b2.addItemListener(this);
         add(b2);
          b3=new JComboBox(year);
          b3.setBounds(x+100,y,50,30);
          b3.addItemListener(this);
          add(b3);
          
    }
     @Override
           public void setBounds(int x, int y, int width, int height)
    {
        super.setBounds(x, y, width, height);
        this.maxAllowed = width;
        this.maxAllowedSet = true;
    }
    void add29()
    {
         b2.addItem("Day");
        for(int i=1;i<=29;i++)
           {
              b2.addItem(i);
           }
    }
     void add31()
    {
         b2.addItem("Day");
        for(int i=1;i<=31;i++)
           {
              b2.addItem(i);
              
           }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED)
        {

            if(b1.getSelectedItem().equals(2))
                    {
                       add29();
                    }
            else if(b1.getSelectedItem().equals(1)||b1.getSelectedItem().equals(3)||b1.getSelectedItem().equals(4)
                    ||b1.getSelectedItem().equals(5)||b1.getSelectedItem().equals(6)||b1.getSelectedItem().equals(7)
                    ||b1.getSelectedItem().equals(8) ||b1.getSelectedItem().equals(9) ||b1.getSelectedItem().equals(10)
                     ||b1.getSelectedItem().equals(11) ||b1.getSelectedItem().equals(12) ||b1.getSelectedItem().equals(13)
                     ||b1.getSelectedItem().equals(14) ||b1.getSelectedItem().equals(15) ||b1.getSelectedItem().equals(16)
                     ||b1.getSelectedItem().equals(17) ||b1.getSelectedItem().equals(18) ||b1.getSelectedItem().equals(19) 
                    ||b1.getSelectedItem().equals(20) ||b1.getSelectedItem().equals(21) ||b1.getSelectedItem().equals(22)
                     ||b1.getSelectedItem().equals(23) ||b1.getSelectedItem().equals(24) ||b1.getSelectedItem().equals(25)
                     ||b1.getSelectedItem().equals(26) ||b1.getSelectedItem().equals(27) ||b1.getSelectedItem().equals(28)
                     ||b1.getSelectedItem().equals(29) ||b1.getSelectedItem().equals(30) ||b1.getSelectedItem().equals(31))
            {
                add31();
                
            }
        }
    }
}
public class displaydate extends JFrame
{
  
    Date_Chooser p;
    public displaydate()
    {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        setVisible(true);
        p=new Date_Chooser();
        p.setBounds(10,10,200,100);
        add(p);
    }
    public static void main(String[] args) {
        new displaydate();
    }
}
