
package design1;

//swing
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;
public class Design1 extends JFrame implements ActionListener{
  JLabel l1,l2;
  JTextField t1,t2;
  JButton b1,b2,b3;
  //Container ct; 
  ImageIcon ic;
  JLabel  l11;
  Design1()
  {
      setLayout(null);
      ic=new ImageIcon("src/images/car.jpg");
      l11 =new JLabel(ic);
      l11.setBounds(0, 0,800, 600);
      //ct=getContentPane();
      
      //ct.setBackground(Color.yellow);
      setTitle("new frame");
      l1=new JLabel("username");
      l1.setBounds(10, 40, 60,40);
      t1=new JTextField();
      t1.setBounds(80, 40, 60,40);
      l2=new JLabel("password");
      l2.setBounds(10, 90, 60,40);
      t2=new JTextField();
      t2.setBounds(80, 90, 60,40);
      b1=new JButton("Login");
      b1=new JButton();
      b1.setBounds(10, 140, 60, 40);
      b1.addActionListener(this);
      b2=new JButton("Reset");
      b2.setBounds(80, 140, 60, 40);
      b2.addActionListener(this);
      b3=new JButton("Next");
      b3.setBounds(130, 140, 60, 40);
      b3.addActionListener(this);
     // b1.add(l11);
      add(l2);
      add(t1);
      add(t2);
      add(l1);
      add(b1);
      add(b2);
      add(b3);
      add(l11);
      setVisible(true);
      setSize(800, 600);
  }     
    public static void main(String[] args) {
    new Design1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
             String uname=t1.getText();
             String upass=t2.getText();
             
       System.out.println("button1");
       System.out.println("uname"+uname);
       System.out.println("uname"+upass);
        } 
        else if(e.getSource()==b2)
        { 
  JOptionPane.showMessageDialog(this,"test test test." );
            System.out.println("button2");
            t1.setText("");
            t2.setText("");
         }
        else if(e.getSource()==b3)
        { 
          new nextpage();
          dispose();
        }
    }
}
