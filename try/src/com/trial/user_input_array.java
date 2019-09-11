package com.trial;
import  java.util.Scanner;
class disparr
{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
       int a[]=new int[10];
        System.out.println("enter value in array");
       for(int i=0;i<10;i++)
       {
           a[i]=reader.nextInt();
       }
       System.out.println("show  value in array in assending order");
       for(int i=0;i<10;i++)
       {
           System.out.println(a[i]);  
       }
       System.out.println("show  value in array in dessending order");
       for(int i=9;i>=0;i--)
       {
           System.out.println(a[i]);
       }
        
    }
    
}