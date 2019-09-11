
package design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButton1 extends JFrame implements ActionListener{
    
JRadioButton r1;
JRadioButton r2;
JButton jb1;
RadioButton1(){  

  
 r1=new JRadioButton("A) Male");  
 r2=new JRadioButton("B) FeMale");  
r1.setBounds(50,100,70,30);  
r2.setBounds(50,150,70,30);  
  jb1=new JButton("click");
  jb1.setBounds(50,190,70,30);  
ButtonGroup bg=new ButtonGroup();  
bg.add(r1);bg.add(r2);  
  
add(r1);add(r2);  
jb1.addActionListener(this);
add(jb1);
  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
    new RadioButton1();  
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==jb1)
    {
        if(r1.isSelected())
        {
       JOptionPane.showMessageDialog(this,"You are male");               
        }
        else if(r2.isSelected())
        {
    JOptionPane.showMessageDialog(this,"You are female");  
        }   
    }
}}
