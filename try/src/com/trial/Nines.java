package com.trial;

class nines
{
   public static void main(String [] arg)
   {int a;
       
       for(a=1;a<200;a++)
       {
           int multiple=9*a;
           System.out.print(multiple+" ");
           for(int j=1;j<a;j++)
           {
           if(a==j*25)
           {
               System.out.println();
           }
           }
       
       }
       System.out.println();
   }
    
    
}