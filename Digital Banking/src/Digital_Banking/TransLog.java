/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital_Banking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author VK
 */
public class TransLog extends JPanel implements ActionListener
{
    Welcome p20;
    JButton b1;
    JTable jtb;
    Connection con;
    Statement stmt;
    ResultSet rs;
    Object str[][];
    String str1[]={"Login Id","A/c Id","Transaction Type","Amount","Post Balance","Trans Time"};
  public TransLog()
  {
     
      setLayout(null);
      
       get();
      jtb=new JTable(str, str1);
     
      // ScrollPane
    JScrollPane scrollPane = new JScrollPane(jtb);
    scrollPane.setBounds(0,0,1350,380);
    add(scrollPane);
    b1=new JButton("BACK");
      b1.setBounds(650,380,70,30);
      b1.addActionListener(this);
      add(b1);
      p20=new Welcome();
      
  }
  
  void get()
        {
           
        try
            {
                 int count=0;
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
                
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from translog where acc_id="+Login.acc_id);
                
             while(rs.next())
             {
                 count++;
             }
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from translog where acc_id="+Login.acc_id);
            str=new Object[count][6];
            int row=0;
            
             while(rs.next())
        {
             str[row][0]=rs.getObject(1);
            str[row][1]=rs.getObject(2);
            str[row][2]=rs.getObject(3);
            str[row][3]=rs.getObject(4);
            str[row][4]=rs.getObject(5);
            str[row][5]=rs.getObject(6);
            row++;
            
        }
                
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            } 
            
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
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
