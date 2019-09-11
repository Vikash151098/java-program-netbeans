/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalbanking;

/**
 *
 * @author VK
 */
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import digitalbanking.MultiLineLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class welcome extends JFrame
{
      public welcome()
      {
          JFrame jf = new JFrame();
          JMenuBar jmb= new JMenuBar();
          ImageIcon img1;
          JLabel l1;
          MultiLineLabel j1;
          jf.setJMenuBar(jmb);
         
          jf.setTitle("DIGITALBANKING");
          jf.setSize(600,500);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JMenu menu=new JMenu("MENU");
          jmb.add(menu);
          JMenu action=new JMenu("ACTION");
          jmb.add(action);
          JMenu view=new JMenu("VIEW");
          jmb.add(view);
          JMenu help=new JMenu("HELP");
          jmb.add(help);
          
          JMenuItem login =new JMenuItem("login");
          menu.add(login);
          JMenuItem logout =new JMenuItem("logout");
          menu.add(logout);
          JMenuItem exit =new JMenuItem("exit");
          menu.add(exit);
          menu.addSeparator();
          
          JMenuItem changepwd =new JMenuItem("change password");
          action.add(changepwd);
          JMenuItem transaction =new JMenuItem("transaction");
          action.add(transaction);
          
          JMenuItem translog =new JMenuItem("translog");
          view.add(translog);
          JMenuItem balance =new JMenuItem("balance");
          view.add(balance);
          
          JMenuItem contact =new JMenuItem("contact");
          help.add(contact);
          
          img1=new ImageIcon("src/img/welcome.jpg");
          l1=new JLabel(img1);
          setContentPane(l1);
          l1.setBounds(0,0,600,500);
          jf.add(l1);
           j1=new MultiLineLabel("WELCOME TO USE MY SERVICE");  
           j1.setBounds(100,100,200,100); 
           Font ft2=new Font("forte",Font.BOLD, 30);
           j1.setFont(ft2);
           jf.add(j1);
            jf.setVisible(true);
}
      public static void main(String[] args) 
    {
      new welcome();
      
    }
    
}
