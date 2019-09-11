package loginform;
/**
 *
 * @author Jatin
 */
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class NextPage extends JFrame implements ActionListener
    {
    JButton j1,b1,b3,b4,b5;
    ImageIcon ic1,img6;
    JLabel o1,o2,l5,l6;
    JTextField t1,t2,t3;
    private Object e;
    Choice c1,c2;
    public NextPage(){ 
        
        setLayout(null);
        setTitle("NextPage");
        l5=new JLabel();
         ic1=new ImageIcon("src/Images/Lib.jpeg");
        l5.setIcon(ic1);
        setContentPane(l5);
        //setTitle("Book Issue");
   /** String[] Branch={"Computer Science","Civil Engineering","Mechanical Engineering","Electrical Engineering","Electonics Engineering","Information Technology"};
        JComboBox Clist=new JComboBox(Branch);
        Clist.setLayout(null);
        Clist.setBounds(180, 240, 150, 30);
        add(Clist);
         String[] Subs={"C++ ","Java","HTML","Python","SOM","FM1","FM2","DCLD","DS","OS","SP"};
        JComboBox Clist1=new JComboBox(Subs);
        Clist1.setLayout(null);
        Clist1.setBounds(180, 285, 150, 30);
        add(Clist1);*/
        c1=new Choice();
        c1.setBounds(180,240,150,30);
        c1.add("-select-");
        c1.add("Computer Science");
        c1.add("Information Technology");
        c1.add("Mechanical Engineering");
        c1.add("Civil Engineering");
        c1.add("Electrical Engineering");
        c1.add("Electronics");
        add(c1);
        c2=new Choice();
        c2.setBounds(180,285,150,30);
         c2.add("-select-");
        c2.add("C++");
        c2.add("Fluid Mechanics 1");
         c2.add("Fluid Mechanics 2");
        c2.add("Data Structure");
         c2.add("Discrete Structure");
        c2.add("M-I");
         c2.add("M-II");
        c2.add("M-III");
         c2.add("M-IV");
        c2.add("DCLD");
         c2.add("Operating System");
        c2.add("OOPS");
         c2.add("SOM");
        c2.add("Engineering Drawing");
        add(c2);
       JLabel l4=new JLabel("Subject");
        l4.setBounds(85, 278,150, 30);
         l4.setForeground(Color.white);
        add(l4);
        l5=new JLabel("Student Roll No.");//180, 285, 150, 30
        l5.setBounds(80, 205, 300, 20);
        l5.setForeground(Color.white);
        add(l5);
        t3=new JTextField();//roll no. of student text 
        t3.setBounds(180, 200, 150, 30);//180, 200, 150, 30
        add(t3);
        b1=new JButton("SUBMIT");
        b1.setBounds(240,320,87,40);
        b1.addActionListener(this);
        add(b1);
        
         JLabel l3=new JLabel("Department");
        l3.setBounds(80, 240,150, 30);
         l3.setForeground(Color.white);
        add(l3);
         JLabel l1=new JLabel("Book Issue Date");
        l1.setBounds(80,100 ,150, 50);
         l1.setForeground(Color.white);
        add(l1);
         t1=new JTextField();//issued date text field
        t1.setBounds(180,110,150,30);
        add(t1);
        JLabel l2=new JLabel("Book Return Date");
        l2.setBounds(80, 150, 150, 50);
         l2.setForeground(Color.white);
        add(l2);
        t2=new JTextField(); //return date text field
        t2.setBounds(180, 160, 150, 30);
        add(t2);
       b3=new JButton("...");
       b3.setBounds(320,110,40,30);
       b3.addActionListener(this);
       b4=new JButton("...");
       b4.setBounds(320,160,40,30);
       b4.addActionListener(this);
       add(b3);
       add(b4);
       b5=new JButton("Home");
         img6=new ImageIcon("src/Images/Home.PNG");
        b5=new JButton(img6);
        b5.setBounds(10, 10, 50, 40);
        b5.addActionListener(this);
        add(b5);
        setSize(600,500);
        setVisible(true);
         setResizable(false);
    } 
  
   public void actionPerformed(ActionEvent e){
       
        Connection con;
     PreparedStatement pr;
      
{ 
      if(e.getSource()==b1){
          
          String Issue_date=new String(t1.getText());  
         
         String Return_date=new String(t2.getText());
         int Student_Roll_No=Integer.parseInt(t3.getText());
         String i=(String)c1.getSelectedItem();
         String i1=(String)c2.getSelectedItem();     
         //  new Book_Issued();
          try
         {
             Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
             System.out.println("connection");
             pr=con.prepareStatement("insert into library(Book_Issue_Date,returnbook_date,Student_Roll_No,Department,Subject) values(?,?,?,?,?)");
             pr.setString(1,Issue_date);
             pr.setString(2,Return_date);
             pr.setInt(3,Student_Roll_No);
             pr.setString(4,i);
             pr.setString(5,i1);
             pr.executeUpdate();
            
           
     }
       catch(Exception e1)
       {
            System.out.println(e1);
       } 
           JFrame j=new JFrame();
          j.setSize(100,200);
            JOptionPane.showMessageDialog(j,"Book is Issued!");
      }
      else if(e.getSource()==b3){
          
         t1.setText(new DatePicker().setPickedDate());    
      }
      if(e.getSource()==b4){
          t2.setText(new DatePicker().setPickedDate());
      }
   }
    if(e.getSource()==b5)
    {
        new lib_home();
    }
     
   }
  
    public static void main(String[] args) {
        new NextPage();
    }
   class DatePicker {
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	JLabel l = new JLabel("", JLabel.CENTER);
	String day = "";
	JDialog d;
	JButton[] button = new JButton[49];

	public DatePicker() {
		d = new JDialog();
		d.setModal(true);
		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setPreferredSize(new Dimension(430, 120));

		for (int x = 0; x < button.length; x++) {
			final int selection = x;
			button[x] = new JButton();
			button[x].setFocusPainted(false);
			button[x].setBackground(Color.white);
			if (x > 6)
				button[x].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						day = button[selection].getActionCommand();
						d.dispose();
					}
				});
			if (x < 7) {
				button[x].setText(header[x]);
				button[x].setForeground(Color.red);
			}
			p1.add(button[x]);
		}
		JPanel p2 = new JPanel(new GridLayout(1, 3));
		JButton previous = new JButton("<< Previous");
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				month--;
				displayDate();
			}
		});
		p2.add(previous);
		p2.add(l);
		JButton next = new JButton("Next >>");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				month++;
				displayDate();
			}
		});
		p2.add(next);
		d.add(p1, BorderLayout.CENTER);
		d.add(p2, BorderLayout.SOUTH);
		d.pack();
		//d.setLocationRelativeTo(parent);
		displayDate();
		d.setVisible(true);
	}

	public void displayDate() {
		for (int x = 7; x < button.length; x++)
			button[x].setText("");
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"MMMM yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, 1);
		int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
		int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
		for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
			button[x].setText("" + day);
		l.setText(sdf.format(cal.getTime()));
		d.setTitle("Date Picker");
	}

	public String setPickedDate() {
		if (day.equals(""))
			return day;
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"dd-MM-yyyy");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(year, month, Integer.parseInt(day));
		return sdf.format(cal.getTime());
	}
}
}

