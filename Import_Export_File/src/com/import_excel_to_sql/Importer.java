/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.import_excel_to_sql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author Vikash Kumar
 */
public class Importer {
    static final String url = "jdbc:mysql://localhost/excel_converter";
    private static Connection getConnection(){
        Connection con = null;
        try{
        	Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","Vikash@151098");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Driver class not found. Please add MySQL connector jar in classpath");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Exception occured while getting Database connection");
        }
        return con;
    }
    
    public ArrayList<Object[]> getExcelData() throws FileNotFoundException{
        ArrayList<Object[]> excelDataList = null;
        String path = "C:/Users/Vikash Kumar/Desktop/Student_data.xls";
        File file=new File(path);
        FileInputStream fi=new FileInputStream(file);
        
        
        return excelDataList;
    }   
}
