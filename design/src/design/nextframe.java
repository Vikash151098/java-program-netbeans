
package design;
import java.awt.Label;
import javax.swing.*;
public class nextframe extends JFrame  {
    JLabel l1;
    nextframe(String uname)
   {
       setLayout(null);
       l1=new JLabel("welcome new user::"+uname);
       l1.setBounds(80, 80, 150, 40);
       add(l1);
       setSize(500, 500);
       setVisible(true);
      
   }    
    
}
