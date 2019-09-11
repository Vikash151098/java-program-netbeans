
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VK
 */
public class secondlargestno {
    public static void main(String[] args) {
        int c=0;
       
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=a;
         while(a>0)
         {
       a=a/10;
      c++;
       }
     
        
        int p[]=new int[c]; 
       for(int i=0;i<c;i++)
       {
      int b=d%10;
      d=d/10;
      p[i]=b;
       
       }
       for(int i=0;i<c;i++)
       {
           for(int j=i+1;j<c;j++)
           {
           if(p[i]<=p[j])
           {
               int t=p[i];
               p[i]=p[j];
               p[j]=t;
           }
          
       }
       }
        System.out.println(p[1]);
             
    }   
}
