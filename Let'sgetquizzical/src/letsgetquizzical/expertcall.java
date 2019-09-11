package letsgetquizzical;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class expertcall extends JFrame implements ActionListener
{
JButton b1;
ImageIcon img1;
JLabel l1,l2,l3;
public expertcall()
{
    setIcon();
  Font ft=new Font("Times New Roman", Font.BOLD, 36);
     img1=new ImageIcon(getClass().getResource("/image/background.jpg"));
    l1=new JLabel(img1);
     setContentPane(l1);
     l1.setBounds(0,0,600,500);
     l2=new JLabel("THE CORRECT ANSWER IS:");
        l2.setBounds(80,100,500,40);
        Font ft2=new Font("forte",Font.BOLD, 30);
        l2.setFont(ft2);
        l2.setForeground(Color.white);
        add(l2);
        l3=new JLabel(connection.result[second.value][6]);
        l3.setForeground(Color.white);
        l3.setFont(ft);
        l3.setBounds(250,150,500,40);
        add(l3);
     b1=new JButton("Continue");
      b1.setBounds(360,380,200,50);
     
        b1.setFont(ft);
      b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
      b1.addActionListener(this);
      add(b1);
       setTitle("Expert Call");
    setResizable(false);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(600,500);
      setLocationRelativeTo(null);
    setVisible(true);
}
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            new second();
            dispose();
        }  
    }
     void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO1.png")));
    }
    }


