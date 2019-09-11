package com.assigment;
import java.util.*;
class sort{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       char t;
        System.out.println("enter the size of array: ");
      int n=sc.nextInt();
     char a[]=new char[n];
        System.out.println("enter the value in each array: ");
      for(int i=0;i<n;i++)
      {
           a[i]=sc.next().charAt(0);
      }
      for(int i=0;i<n-2;i++)
      {
        for(int j=0;j<n-1;j++)
        {
            if(a[j]>a[j+1])
            {
               t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
            }
        }
      }
        System.out.println("the sorted array are: ");
      for(int i=0;i<n;i++ )
      {
          System.out.println(a[i]);
      }
    }
 
}