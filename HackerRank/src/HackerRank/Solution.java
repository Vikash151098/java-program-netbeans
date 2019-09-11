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

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String s[]=new String[t];
        for(int i=0;i<t;i++)
        {
            
        s[i]=sc.nextLine();
        
        }
        
        for(int j=0;j<t;j++)
        {
            for(int k=0;k<s[j].length();k=k+2)
            {
                char c=s[j].charAt(k);
                System.out.print(c);
            }
            System.out.print(" ");
            for(int l=1;l<s[j].length();l=l+2)
            {
                char d=s[j].charAt(l);
                System.out.print(d);
            }
            System.out.println();
        }
        
    }
}
