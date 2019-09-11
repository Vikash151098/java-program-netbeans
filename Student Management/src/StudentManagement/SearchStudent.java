/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author VK
 */
public class SearchStudent extends JFrame implements ActionListener
{
    JLabel l0,l1;
    JTextField jtf;
    JButton b1,b2;
    JPanel p;
    JTable jtb;
    JScrollPane scrollPane;
    String str[][];
    Connection con;
    Statement stmt;
    ResultSet rs;
  public SearchStudent()
  {
       str=new String[1][8];
       
    Object str1[]={"name","Father's name","Mother's name","Course","Branch","roll no.","add.","Contact no"};
      Font ft=new Font("Times New Roman", Font.BOLD,18);
      setTitle("SearchStudent");
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      l0=new JLabel("SEARCH STUDENT DETAILS");
      l0.setBounds(200,20,250,30);
      l0.setFont(ft);
      add(l0);
      l1=new JLabel("ENTER STUDENT ROLL NO.");
      l1.setBounds(50,100,200,30);
     // l1.setFont(ft);
      add(l1);
      jtf=new JTextField();
      jtf.setBounds(250,100,150,25);
      add(jtf);
      b1=new JButton("SEARCH");
        b1.setBounds(220,150,100,30);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("BACK");
        b2.setBounds(10,10,100,30);
        b2.addActionListener(this);
        add(b2);
        p=new JPanel(new CardLayout());
        p.setBounds(0,200,800,400);
      //  p.setBackground(Color.red);
        jtb=new JTable(str, str1);
     
      // ScrollPane
    scrollPane = new JScrollPane(jtb);
    scrollPane.setBounds(30,200,300,100);
    
        add(p);
      setSize(700,600);
        setVisible(true);
        setLocationRelativeTo(null);
  }
    public static void main(String[] args) {
        new SearchStudent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==b1)
       {
           for(int i=0;i<8;i++)
            {
                str[0][i]=null;
            }
            try
            {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
                System.out.println("connection");
                stmt=con.createStatement();
             rs=stmt.executeQuery("select * from student_detail where rollno="+jtf.getText());
            
             while(rs.next())
        {
            String id=rs.getString(1);
            str[0][0]=rs.getString(2);
            str[0][1]=rs.getString(3);
            str[0][2]=rs.getString(4);
            str[0][3]=rs.getString(5);
            str[0][4]=rs.getString(6);
            str[0][5]=rs.getString(7);
            str[0][6]=rs.getString(8);
            str[0][7]=rs.getString(9);
            
        }
            
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
             if(str[0][1]==null)
             {
                 JOptionPane.showMessageDialog(null,"rollno is not found");
             }
             else
             {
           //removing panel
            p.removeAll();
            p.repaint();
            p.revalidate();
            
            //adding panel
            
            p.add(scrollPane);
            p.repaint();
            p.revalidate();
            
             }
       }
       else if(e.getSource()==b2)
       {
           new home();
           dispose();
       }
    }
}
