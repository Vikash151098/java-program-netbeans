/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

/**
 *
 * @author VK
 */
import java.io.*;
public class PDF_Reader {
    
    public static void main(String[] args) throws IOException {


        File f=new File("C:/Users/Hp/Desktop/exp 1 CN.pdf");

        OutputStream oos = new FileOutputStream("C:/Users/Hp/Desktop/test.pdf");

        byte[] buf = new byte[8192];

        InputStream is = new FileInputStream(f);

        int c = 0;

        while ((c = is.read(buf, 0, buf.length)) > 0) {
            oos.write(buf, 0, c);
            oos.flush();
        }

        oos.close();
        System.out.println("stop");
        is.close();

    }

}