/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author VK
 */
public class ViewStudents extends JFrame implements ActionListener
{
    JButton b1;
    JTable jtb;
    Connection con;
    Statement stmt;
    ResultSet rs;
    int count=0;
    Object str[][];
    String str1[]={"name","father's name","roll no.","semester","branch","contact"};
  public ViewStudents()
  {
      get();
      setTitle("View students");
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jtb=new JTable(str, str1);
     
      // ScrollPane
    JScrollPane scrollPane = new JScrollPane(jtb);
    scrollPane.setBounds(0,100,700,500);
    getContentPane().add(scrollPane);
      
      b1=new JButton("BACK");
      b1.setBounds(10,10,100,30);
      b1.addActionListener(this);
      add(b1);
      setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
  }
        void get()
        {
        try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
                System.out.println("connection");
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from student_detail ");
            
             while(rs.next())
             {
                 count++;
             }
             rs=stmt.executeQuery("select * from student_detail ");
            str=new Object[count][6];
            int row=0;
             while(rs.next())
        {
            String id=rs.getString(1);
            str[row][0]=rs.getString(2);
            str[row][1]=rs.getString(3);
             String moth=rs.getString(4);
              String cour=rs.getString(5);
            str[row][4]=rs.getString(6);
            str[row][2]=rs.getString(7);
            String add=rs.getString(8);
            str[row][5]=rs.getString(9);
            row++;
        }
            
             rs=stmt.executeQuery("select semester from payment");
            int row1=0;
             while(rs.next())
        {  
            str[row1][3]=rs.getInt(1);
            row1++;
        }
            
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }   
  }
    public static void main(String[] args) {
        new ViewStudents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1)
      {
          new home();
          dispose();
      }
    }
}
