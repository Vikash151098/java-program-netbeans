package com.assigment;
import java.util.*;
class vowel
{
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("this program find how many vowel in your sentences");
        System.out.println("enter the sentences ");
        String s=str.nextLine();
        char c[]=s.toCharArray();
        char j;
        System.out.print("output: ");
        for(int i=0;i<s.length();i++)
        {
            j=c[i];
            if(j=='a'||j=='A'||j=='e'||j=='E'||j=='i'||j=='I'||j=='o'||j=='O'||j=='u'||j=='U'){ 
            System.out.print(j+",");}
        }
        System.out.println("");
    }
}