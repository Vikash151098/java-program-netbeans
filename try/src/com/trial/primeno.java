package com.trial;
class prime 
{
    public static void main(String[] args) {
       int a=11,i;
       for(i=2;i<a;i++)
       {
           if(a%i==0)
           {
                System.out.println("not prime no");
               break;
           }   
       }
       if(i==a)
      System.out.println("prime no.");
       
    }
}