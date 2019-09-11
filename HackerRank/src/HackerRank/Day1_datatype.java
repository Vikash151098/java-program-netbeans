/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author VK
 */

 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_datatype {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
         Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
int a;
double b;
String c;

        /* Read and save an integer, double, and String to your variables.*/
        a=scan.nextInt();
        b=scan.nextDouble();
        scan.nextLine();
        c=scan.nextLine();
       
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
       
        /* Print the sum of both integer variables on a new line. */
System.out.println(i+a);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+b);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
          
System.out.println(s+c);
        scan.close();
    }
}
    
