package Digital_Banking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class signup extends JPanel implements ActionListener
{
   public static  ArrayList<Object> arr;
   public  JButton jb;
    signup2 p20;
    ButtonGroup bg1,bg2;
    Connection con;
    PreparedStatement pr;
    JTextField t1,t2,t3,t4,t5,t6,t7;
   
    JRadioButton jr0,jr01,jr11;
 public signup()
    {
        arr=new ArrayList<>();
     setLayout(null);
     Color mynewblue=new Color(0,191,255);
        setBackground(mynewblue);
    JLabel j1=new JLabel("APPLICATION FORM NO:");
    j1.setBounds(220,0,300,50);
    add(j1);
    JLabel j2=new JLabel("PERSONAL DETAILS");
    j2.setBounds(240,30,300,50);
    
    add(j2);
    JLabel j3=new JLabel("NAME:");
    j3.setBounds(150,60,300,50);
   
    add(j3);
     t1=new JTextField();
    t1.setBounds(250,75,200,25);
    add(t1);
    JLabel j4=new JLabel("FATHER NAME:");
    j4.setBounds(150,95,300,50);
    
    add(j4);
     t2=new JTextField();
    t2.setBounds(250,110,200,25);
    add(t2);
    
    JLabel j5=new JLabel("DATE OF BIRTH:");
    j5.setBounds(150,130,300,50);
    
    add(j5);
     t3=new JTextField();
    t3.setBounds(250,145,200,25);
    add(t3);
   
    JLabel j6=new JLabel("GENDER:");
    j6.setBounds(150,165,300,50);
    
    add(j6);
    bg1=new ButtonGroup();
    JRadioButton jr0 = new JRadioButton();
    jr0.setText("male");
    jr0.setBounds(250,180,70,25);
    add(jr0);
    JRadioButton jr01 = new JRadioButton();
    jr01.setText("female");
    jr01.setBounds(320,180,70,25);
    add(jr01);
    JRadioButton jr11 = new JRadioButton();
    jr11.setText("other");
    jr11.setBounds(390,180,70,25);
    add(jr11);
    bg1.add(jr0);
    bg1.add(jr01);
    bg1.add(jr11);
    
    JLabel j7=new JLabel("EMAIL:");
    j7.setBounds(150,200,300,50);
   
    add(j7);
  
     t4=new JTextField();
    t4.setBounds(250,215,200,25);
    add(t4);
  
    JLabel j8=new JLabel("MARTIAL STATUS:");
    j8.setBounds(150,235,300,50);
    
    add(j8);
    bg2=new ButtonGroup();
    JRadioButton jr = new JRadioButton();
    jr.setText("single");
    jr.setBounds(260,250,60,25);
    add(jr);
    
    JRadioButton jr1 = new JRadioButton();
    jr1.setText("married");
    jr1.setBounds(315,250,70,25);
    add(jr1);
    
    JRadioButton jr2 = new JRadioButton();
    jr2.setText("unmarried");
    jr2.setBounds(385,250,100,25);
    add(jr2);
    bg2.add(jr);
    bg2.add(jr1);
    bg2.add(jr2);
    JLabel j9=new JLabel("CITY");
    j9.setBounds(150,265,300,50);
    add(j9);
    
     t5=new JTextField();
    t5.setBounds(250,275,200,25);
    add(t5);
 
    JLabel j10=new JLabel("PINCODE");
    j10.setBounds(150,300,300,50);
    add(j10);
    
     t6=new JTextField();
    t6.setBounds(250,310,200,25);
    add(t6);
    
    JLabel j11=new JLabel("STATE");
    j11.setBounds(150,335,300,50);
  
    add(j11);
    
     t7=new JTextField();
    t7.setBounds(250,350,200,25);
    add(t7);
   
    
     jb = new JButton("PROCEED");
    jb.setBounds(460, 380,100, 25);
    jb.addActionListener(this);
    add(jb);
    p20=new signup2();
   
}
  public String getSelectedButtonText(ButtonGroup buttongroup)
  {
      for(Enumeration<AbstractButton> buttons=buttongroup.getElements();
              buttons.hasMoreElements();)
      {
          AbstractButton button=buttons.nextElement();
          if(button.isSelected())
          {
              return button.getText();
          }
      }
      return null;
  }
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==jb)
        {
            if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(bg1.getSelection()==null)
                    ||(t4.getText().equals(""))||(bg2.getSelection()==null)||(t5.getText().equals(""))||(t6.getText().equals(""))
                   ||(t7.getText().equals("")))
                {
                JDialog.setDefaultLookAndFeelDecorated(true);
                JOptionPane.showMessageDialog(null,"Please enter All the necessary Detail");
            }
     else
            
            {
                arr.add(t1.getText());
                arr.add(t2.getText());
                arr.add(t3.getText());
                arr.add(getSelectedButtonText(bg1));
                arr.add(t4.getText());
                arr.add(getSelectedButtonText(bg2));
                arr.add(t5.getText());
                arr.add(t6.getText());
                arr.add( t7.getText());
                
                 //removing panel
            home.p.removeAll();
            home.p.repaint();
           home. p.revalidate();
            
            //adding panel
           home. p.add(p20);
            home.p.repaint();
           home. p.revalidate();  
          
            }
        }
           
           
        }
       
    }
 

