/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Jatin
 */
public class lib_home extends JFrame implements ActionListener
{
     JButton b1,b2;
  JLabel l1;
  
  public lib_home(){
      setLayout(null);
      setTitle("Library Book");
              l1=new JLabel();
   l1.setBounds(0, 0, 600, 500);
        ImageIcon img4=new ImageIcon("src/Images/Lib.jpeg");
        l1.setIcon(img4);
        setContentPane(l1);
     b1=new JButton("Book Issue");
     b1.setBounds(220, 150, 150, 40);
    b1.addActionListener(this);
      add(b1);
        b2=new JButton("Book Return");
     b2.setBounds(220, 240,150,40 );
     b2.addActionListener(this);
      add(b2);
    setSize(600,500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         setResizable(false);
         
  }
    
    public void actionPerformed(ActionEvent e) {
  if(e.getSource()==b1)
  {
      new NextPage();
  }
    dispose();
    if(e.getSource()==b2)
    {
        new SearchRoll();
    }
    }
    public static void main(String[] args) {
        new lib_home();
    }
}
