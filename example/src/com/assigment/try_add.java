package com.assigment;
import java.util.Scanner;
class t
{
    t()
    {
        System.out.println("this example shows addtion of two number:\n"+"10+20=30\n"+"let's try yourself");
    }
    t(int x,int y)
    {  
        System.out.println(x+"+"+y+"="+(x+y));     
    }
    public static void main(String[] args) {
        int a,b;
        for(int j=0;j<50;j++)
        {
            System.out.println("choose any one of  these options: ");
        System.out.println("Press 1 for see the example");
        System.out.println("Press 2 for Test");
        Scanner reader=new Scanner(System.in);
        int i=reader.nextInt();
        if(i>2){
            System.out.println("you entered other no. than 1 or 2 so program has been exited");
            System.exit(0);}
        if(i==1)
        {
           t ob=new t();
            System.out.println("you want to retry press 3: ");
            System.out.println("Or you want to exit press 4: ");
             j=reader.nextInt();
            if(j==3)
            continue;
            else if(j==4)
                 System.exit(0);
            else{
                System.out.println("you entered other no. than 3 or 4 so program has been exited");  
            
             break;}
        }
        if(i==2)
        {
         System.out.println("enter the value : ");
         System.out.print("a: ");
         a=reader.nextInt();
         System.out.print("b: ");
         b=reader.nextInt();
          t ob=new t(a,b);
          System.out.println("you want to retry press 3: ");
          System.out.println("Or you want to exit press 4: ");
           int  k=reader.nextInt();
           if(k==3)
            continue;
           else if(k==4)
                 System.exit(0);
           else{
               System.out.println("you entered other no. than 3 or 4 so program has been exited");
                 break;}
        }
        
       
        }
        
      
    }
}