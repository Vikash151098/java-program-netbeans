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
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.util.*;

public class PDFTest {

 public static void main(String[] args){
 PDDocument pd;
 BufferedWriter wr;
 try {
         File input = new File("C:/Users/Hp/Desktop/exp 1 CN.pdf");  // The PDF file from where you would like to extract
         File output = new File("C:/Users/Hp/Desktop/SampleText.txt"); // The text file where you are going to store the extracted data
         pd = PDDocument.load(input);
         System.out.println(pd.getNumberOfPages());
         System.out.println(pd.isEncrypted());
         pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
        // PDFTextStripper stripper = new PDFTextStripper();
         wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
         //stripper.writeText(pd, wr);
         if (pd != null) {
             pd.close();
         }
        // I use close() to flush the stream.
        wr.close();
 } catch (Exception e){
         e.printStackTrace();
        } 
     }
}