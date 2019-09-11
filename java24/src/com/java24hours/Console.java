package com.java24hours;

 import java.io.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

 public class Console {
    
 public static String readLine() {
 StringBuilder response = new StringBuilder();
 try {
 BufferedInputStream bin = new
 BufferedInputStream(System.in);
 int in = 0;
 char inChar;
 do {
 in = bin.read();
 inChar = (char) in;
 if (in != -1) {
 response.append(inChar);
 }
 } while ((in !=10));
 bin.close();
 return response.toString();
 } catch (IOException e) {
 System.out.println("Exception: " + e.getMessage());
 return null;
 }
 }

 public static void main(String[] arguments) {

 System.out.print("> ");
 String input = Console.readLine();
    
 System.out.println("That's not a verb I recognize.");
 }
 }
