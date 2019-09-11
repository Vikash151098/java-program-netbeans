
package design1;

import javax.swing.*;
import java.awt.event.*;
public class nextpage extends JFrame implements ActionListener{
    JComboBox j1;
   public nextpage()
   {
       setLayout(null);
       setTitle("Next frame");
       String name[] ={"select","india","usa"};
       j1=new JComboBox(name);
       j1.setBounds(10,10,100,60);
       j1.addActionListener(this);
       add(j1);
       setSize(500, 500);
       setVisible(true);
   }    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==j1)
       {
     int index=(int)j1.getSelectedIndex();
     String var="";
     if(index==1)
     {
      var=(String)j1.getSelectedItem();
      System.out.println(var);
     }
     else if(index==2)
     {
          var=(String)j1.getSelectedItem();
      System.out.println(var);
       }
       }  
       
    }
}
