
package menu;

import java.awt.Font;
import javax.swing.*;

public class NextFrame extends JFrame{
    ImageIcon ic;
    JLabel l1;
    JButton JB1;
    Font f1;
    public NextFrame()
    {
        setLayout(null);
        f1=new Font("Times New Roman",Font.BOLD,20);
        ic=new ImageIcon("src/menu.image/car.jpg");
        l1=new JLabel(ic);
        l1.setBounds(0, 0, 1000, 700);
        JB1=new JButton("ADD");
        JB1.setBounds(40, 40, 120, 40);
        JB1.setFont(f1);
        add(JB1);
        add(l1);
        setVisible(true);
        setSize(1000, 700);
    }   
    
}
