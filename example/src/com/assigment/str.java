package com.assigment;
import java.util.*;
class str
{
   public static void main(String[] args) {
       StringBuilder y=new StringBuilder();
   Scanner s=new Scanner(System.in);
       
       
       String x="vikash";
       String x2=x.concat("kumar");
       
   
       System.out.println("enter String :");
   String str=s.nextLine();
    char a[]=str.toCharArray();
   y.append(x);
    y=y.reverse();
    
    int x3=x.length();
    char x4=x.charAt(3);
    int x5=x.indexOf('k');
    int x6=x2.lastIndexOf('u');
    String st1=str.toUpperCase();
    String  x7=x2.substring(3,8);
    String st2=str.trim();
   for(int i=0;i<a.length;i++)
   {
       System.out.println(a[i]);
   }
       System.out.println(x2);
       System.out.println(x3);
       System.out.println(x4);
       System.out.println(x7);
       System.out.println(x5);
       System.out.println(x6);
       System.out.println(st1);
       System.out.println(st2);
       System.out.println(y);
    
     
}
}