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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author VK
 */
public class Profile extends JPanel implements ActionListener
{
    TableModel dm;
    Welcome p20;
    JButton b1;
    JTable jtb;
    Connection con;
    Statement stmt;
    ResultSet rs;
    Object str[][];
    String str1[]={"A/c Id","Name","Father's Name","DOB","gender","Email Id","martial status","city","pincode","state"
    ,"religion","category","Income","Qualification","Occupation","PAN no.","Aadhar no.","Senior Citizen","existing A/c"};
    public Profile()
    {
        setLayout(null);
      
       get();
     
     jtb=new JTable(tranpose());
     jtb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
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
    TableModel tranpose()
    {
        for(int i=0;i<str.length;i++)
        {
            dm.setValueAt(str1[0],i,0);
            dm.setValueAt(str[0][i],i,1);
        }
        return dm;
    }
    void get()
        {
           
        try
            {
                 int count=0;
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital_banking","root","Vikash@151098");
                
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from personal_detail where acc_id="+Login.acc_id);
                
             while(rs.next())
             {
                 count++;
             }
             stmt=con.createStatement();
             rs=stmt.executeQuery("select * from personal_detail where acc_id="+Login.acc_id);
            str=new Object[count][19];
            int row=0;
            
             while(rs.next())
        {
             str[row][0]=rs.getObject(1);
            str[row][1]=rs.getObject(2);
            str[row][2]=rs.getObject(3);
            str[row][3]=rs.getObject(4);
            str[row][4]=rs.getObject(5);
            str[row][5]=rs.getObject(6);
            str[row][6]=rs.getObject(7);
            str[row][7]=rs.getObject(8);
            str[row][8]=rs.getObject(9);
            str[row][9]=rs.getObject(10);
            str[row][10]=rs.getObject(11);
            str[row][11]=rs.getObject(12);
            str[row][12]=rs.getObject(13);
            str[row][13]=rs.getObject(14);
            str[row][14]=rs.getObject(15);
            str[row][15]=rs.getObject(16);
            str[row][16]=rs.getObject(17);
            str[row][17]=rs.getObject(18);
            str[row][18]=rs.getObject(19);
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
