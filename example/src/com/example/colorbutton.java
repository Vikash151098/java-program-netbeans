package com.example;
import javax.swing.*;
public class colorbutton extends JFrame
{
    public colorbutton()
    {
        super("COLOUR BUTTOM");
        setLookAndFeel();
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }
    private void setLookAndFeel()
    {
        try
        {
          UIManager.setLookAndFeel("javax.swing.plat.nimbus.nimbussetLookAndFeel");
        }
        catch(Exception e)
        {
          //  ignore error
        }
    }
    
    public static void main(String [] arg)
         {
             new colorbutton();
         }
    
   
} 