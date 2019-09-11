
package Digital_Banking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class signup2 extends JPanel implements ActionListener
{
    ButtonGroup bg1,bg2;
    Connection con;
    PreparedStatement pr;
    Statement stmt;
    ResultSet rs;
     JButton jb;
     JTextField t0,t1,t2,t3,t4,t5,t6;
     userlogin p20;
     String ac_id;
 public signup2()
    {
    
        setLayout(null);
        Color mynewblue=new Color(0,191,255);
        setBackground(mynewblue);
    JLabel j1=new JLabel("APPLICATION FORM NO:");
    j1.setBounds(220,3,300,50);
   
    add(j1);
    
    JLabel j2=new JLabel("RELIGION:");
    j2.setBounds(150,75,300,50);
    
    add(j2);
     t0=new JTextField();
    t0.setBounds(250,85,200,25);
    add(t0);
    
    JLabel j3=new JLabel("CATEGORY:");
    j3.setBounds(150,105,300,50);
    
    add(j3);
     t1=new JTextField();
    t1.setBounds(250,115,200,25);
    add(t1);
    
    JLabel j4=new JLabel("INCOME:");
    j4.setBounds(150,135,300,50);
    
    add(j4);
     t2=new JTextField();
    t2.setBounds(250,150,200,25);
    add(t2);
    
    
    JLabel j5=new JLabel("QUALIFICATION:");
    j5.setBounds(150,170,300,50);
   
    add(j5);
     t3=new JTextField();
    t3.setBounds(250,185,200,25);
    add(t3);
    
    
    JLabel j6=new JLabel("OCCUPATION:");
    j6.setBounds(150,205,300,50);
    
    add(j6);
     t4=new JTextField();
    t4.setBounds(250,220,200,25);
    add(t4);
 
    
    
    JLabel j7=new JLabel("PAN NO:");
    j7.setBounds(150,240,300,50);
    
    add(j7);
     t5=new JTextField();
    t5.setBounds(250,255,200,25);
    add(t5);
   
    
    JLabel j8=new JLabel("AADHAR NO:");
    j8.setBounds(150,275,300,50);
   
    add(j8);
    
     t6=new JTextField();
    t6.setBounds(250,290,200,25);
    add(t6);
    
    
    JLabel j9=new JLabel("SENIOR CITIZEN:");
    j9.setBounds(150,305,300,50);
    
    add(j9);
    bg1=new ButtonGroup();
    JRadioButton jr1 = new JRadioButton();
    jr1.setText("yes");
    jr1.setBounds(250,320,60,25);
    add(jr1);
    
    JRadioButton jr2 = new JRadioButton();
    jr2.setText("no");
    jr2.setBounds(320,320,60,25);
    add(jr2);
    bg1.add(jr1);
    bg1.add(jr2);
    
    JLabel j10=new JLabel("EXISTING ACCOUNT:");
    j10.setBounds(150,340,300,50);
    add(j10);
   bg2=new ButtonGroup();
    JRadioButton jr3 = new JRadioButton();
    jr3.setText("yes");
    jr3.setBounds(270,355,60,25);
    add(jr3);
    
    JRadioButton jr4 = new JRadioButton();
    jr4.setText("no");
    jr4.setBounds(330,355,60,25);
    add(jr4);
    bg2.add(jr3);
    bg2.add(jr4);
    
     jb = new JButton("FINISH");
    jb.setBounds(460, 375,100, 25);
    jb.addActionListener(this);
    add(jb);
    p20=new userlogin();
      
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
             if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))
                    ||(t4.getText().equals(""))||(t5.getText().equals(""))||(t6.getText().equals(""))
                     ||(bg1.getSelection()==null)||(bg2.getSelection()==null))
                {
                
                JOptionPane.showMessageDialog(null,"Please enter All the necessary Detail");
            }
     else
            
            {
             try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
                System.out.println("connection");
                pr=con.prepareStatement("insert into personal_detail values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                pr.setString(1, null);
                 pr.setObject(2,signup.arr.get(0));
                 pr.setObject(3,signup.arr.get(1));
                pr.setObject(4,signup.arr.get(2));
                pr.setObject(5,signup.arr.get(3));
                pr.setObject(6,signup.arr.get(4));
                pr.setObject(7,signup.arr.get(5));
                pr.setObject(8,signup.arr.get(6));
                 pr.setObject(9,signup.arr.get(7));
                 pr.setObject(10,signup.arr.get(8));
                pr.setString(11,t0.getText());
                pr.setString(12,t1.getText());
                pr.setString(13,t2.getText());
                pr.setString(14,t3.getText());
                pr.setString(15,t4.getText());
                pr.setString(16,t5.getText());
                pr.setString(17,t6.getText());
                pr.setString(18,getSelectedButtonText(bg1));
                pr.setString(19, getSelectedButtonText(bg2));
                pr.executeUpdate();
                System.out.println("yes");
                stmt=con.createStatement();
             rs=stmt.executeQuery("select acc_id from personal_detail where aadhar_no="+t6.getText());
             while(rs.next())
             {
                 ac_id=rs.getString(1);
             }
        
        }
            
            catch(Exception e1)
            {
                System.out.println(e1);
            }
             JOptionPane.showMessageDialog(null,"your Account Id id: "+ac_id+" please note A/c Id  ");
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

