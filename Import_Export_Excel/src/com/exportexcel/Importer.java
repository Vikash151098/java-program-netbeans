package com.exportexcel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import javax.swing.JFileChooser;

public class Importer {

	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<Student>();
		FileInputStream fstream = null;
		try {
			fstream = new FileInputStream("C:/Users/Hp/Desktop/SampleData.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		try {
			while ((strLine = br.readLine()) != null)   {
				Student stud= new Student();
				String parts[] = strLine.split("\t"); 
							
				if(parts.length==4){
					if(new Integer(parts[0])>0){
					stud.setId(parts[0]);
					stud.setRoll_no(parts[1]);
					stud.setName(parts[2]);
					stud.setGender(parts[3]);
					}
					studentList.add(stud);
				}			  
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("student count :" + studentList.size());
		
        Connection connection = null;
        PreparedStatement pst = null;

        String url = "jdbc:mysql://localhost:3306/excel_converter";
        String user = "root";
        String password = "";

        try {

            //String msisdn = "971552636090";
            
           
            connection = DriverManager.getConnection(url, user, password);

           /* pst = con.prepareStatement("INSERT INTO blacklist.dnd(msisdn) VALUES(?)");
            pst.setString(1, msisdn);
            pst.executeUpdate();*/
            
            connection.setAutoCommit(false);
            //PreparedStatement ps = connection.prepareStatement("INSERT INTO blacklist.basedec17second(msisdn,msisdn_type,base_type) VALUES (?,?,?)");
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student_detail(id,rollno,name,gender) VALUES (?,?,?,?)");
            for (Student stud:studentList){
                ps.setObject(1, stud.getId());
                ps.setObject(2, stud.getRoll_no());
                ps.setObject(3, stud.getName());
                ps.setObject(4, stud.getGender());
                ps.addBatch();
            }
            
            ps.executeBatch();
            connection.commit();
            System.out.println("Student data inserted succesfully");
        } catch (SQLException ex) {
            System.out.println("Student data not inserted succesfully :" + ex);

        } finally {

            try {
                
                if (pst != null) {
                    pst.close();
                }
                
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException ex) {
                
            	System.out.println("Exception in execution finally : " + ex);
            }
        }
    }
        
        
}

class Student{
	
	String id;
	String roll_no;
	String name;
	String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll_no=" + roll_no + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
}