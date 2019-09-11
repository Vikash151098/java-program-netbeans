
package menu;

import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
   JMenuBar jm1;
   JMenu m1,m2;
   JMenuItem mi1,mi2,mi3,mi4;
   
       public Menu()
       {
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jm1=new JMenuBar();
           jm1.setBounds(0,0,500,60);
           m1=new JMenu("File1");
           m1.setBounds(0,0, 60,60);
           m2=new JMenu("Edit");
           m2.setBounds(70,0, 60,60);
           mi1=new JMenuItem("first");
            mi1.addActionListener(this);
            
           mi2=new JMenuItem("second");
           mi3=new JMenuItem("edit1");
           mi4=new JMenuItem("edit2");
           mi2.addActionListener(this);
           mi3.addActionListener(this);
           mi4.addActionListener(this);
           m1.add(mi1);
          m1.add(mi2);
          m2.add(mi3);
          m2.add(mi4);
          jm1.add(m1);
          jm1.add(m2);
        setJMenuBar(jm1);
           setVisible(true);
           setSize(500, 500);
       }    

    public static void main(String[] args) {
new Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==mi1)
       {
         new NextFrame();           
       }
       else if(e.getSource()==mi2)
       {
             JOptionPane.showMessageDialog(this,"india"); 
       }
    }
    
}
