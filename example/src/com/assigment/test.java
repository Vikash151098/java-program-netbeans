package com.assigment;
import java.util.Scanner;
class add
{
    static int result;
    add()
    {
        
        System.out.println("this example shows addtion of two number:\n"+"10+20=30\n");
    }
    add(int x,int y)
    {  result=x+y;
           
    }
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("This program cheaks the result of the addition of two number is correct or not ");
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
           add ob=new add();
            System.out.println("you want to retry : press 3 ");
            System.out.println("Or you want to exit : press 4 ");
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
         System.out.print("a= ");
         a=reader.nextInt();
         System.out.print("b= ");
         b=reader.nextInt();
         System.out.print("enter the value of result : ");
         c=reader.nextInt();
          add ob=new add(a,b);
          if(c==result)
                System.out.println("your answer has correct");
          else 
                System.out.println("your answer has incorrect");
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