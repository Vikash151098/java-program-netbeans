
package design;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class combobox extends JFrame implements ActionListener{
    JComboBox jc;
    Container ct; 
    combobox()
    {
        setLayout(null);
        ct=getContentPane();
      
      ct.setBackground(Color.green);
        String country []={"select","INDIA","PAK","USA"};
        jc=new JComboBox(country);
        jc.setBounds(40,40, 60,40);
        jc.addActionListener(this);
        add(jc);
        
        setSize(500, 500);
       setVisible(true);
    }   
    public static void main(String [ ] ar)
    {
        new combobox();
    }   

    @Override
    public void actionPerformed(ActionEvent e1) {
       if(e1.getSource()==jc)
       {
           //int i=jc.getSelectedIndex();
    String i=(String)jc.getSelectedItem();
     if(i.equals("INDIA"))
           {
        System.out.println("indiaAAAAAAAAAA::");
        JOptionPane.showMessageDialog(this,"india"); 
           }  
           else if(i.equals("PAK"))
           {
             JOptionPane.showMessageDialog(this,"pak");              
           }      
    /* if(i==1)
           {
        System.out.println("india::");              
           }  
           else if(i==2)
           {
               System.out.println("pak::");              
           }*/  
       }   
    }
    
}
