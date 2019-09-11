/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author VK
 */
public class ConfigWriter {
    
    String newline=System.getProperty("line.separator");
    ConfigWriter()
    {
        try
        {
            File file=new File("ganesh.txt");
            FileOutputStream out=new FileOutputStream(file);
            write(out,"name=ganesh");
            write(out,"roll no=1610007");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }  
    }
    void write(FileOutputStream stream,String output) throws IOException
    {
        output=output+newline;
        byte[]data=output.getBytes();
        stream.write(data, 0, data.length);
    }
    public static void main(String[] args) {
        new ConfigWriter();
    }
}
