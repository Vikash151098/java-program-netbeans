package com.trial;
import java.util.Scanner;

 class calculator
{
     int n1,n2;
     int add()
        {
        int n3;
        n3=n1+n2;
        return n3;
        }
  int sub()
        {
        int n4;
        n4=n1-n2;
        return n4;
    }
   int mul()
        {
        int n5;
        n5=n1*n2;
        return n5;
    }
    int div()
        {
        int n6;
        n6=n1/n2;
        return n6;
    }
     void enter()
     {
         Scanner reader=new Scanner(System.in);
     System.out.println("enter first no."); 
       n1=reader.nextInt();
      
    System.out.println("enter second no.");
    n2=reader.nextInt();
     }
    public static void main(String[] args) {
         calculator ob=new calculator();
         ob.enter();
        Scanner reader=new Scanner(System.in);
        System.out.println("enter\n"+"1 for add \n"+"2 for substraction\n"+"3 for multiplication\n"+"4 for division");
    int i=reader.nextInt();
   
     switch(i)
    {
        case 1:
           
        int x=ob.add();
        System.out.println("result:"+x);
    
        break;
        case 2:
          
        int y= ob.sub();
    System.out.println("result:"+y);
        break;
        case 3:
           
         int z=ob.mul();
        System.out.println("result:"+z);
       
        break;
        case 4:
          
        int w=ob.div();
        System.out.println("result:"+w);
        break;
        default:
        System.out.println("you have  entered another no. so please enter either 1 or 2 or 3 or 4 ");
        
    }
    }
 
}