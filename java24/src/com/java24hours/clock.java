package com.java24hours;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

class clock
{
    public static void main(String [] arg)
    {
      LocalDateTime now=LocalDateTime.now();
      int hour=now.get(ChronoField.HOUR_OF_DAY);
      int minute=now.get(ChronoField.MINUTE_OF_HOUR);
      int month=now.get(ChronoField.MONTH_OF_YEAR);
      int day=now.get(ChronoField.DAY_OF_MONTH);
      int year=now.get(ChronoField.YEAR);
      //display greeting 
      if(hour<12)
          System.out.println("good morning");
      else if(hour>17)
          System.out.println("good evening");
      else
          System.out.println("good afternoon");
      
      
      //display minute 
      if(minute!=0)
      {
         System.out.print("it's");
         System.out.print(" "+minute+" ");
         System.out.print((minute!=1)?"minutes":"minute");
         System.out.print(" past");
      }
     //display the hour
     System.out.print("  ");
     System.out.print((hour>12)?hour-12:hour);
     System.out.print(" o'clock on  ");
     //display the name of month
     switch(month)
     {
         case 1:
             System.out.print("january");
             break;
         case 2:
             System.out.print("february");
             break;
         case 3:
             System.out.print("march");
             break;
         case 4:
             System.out.print("april");
             break;
         case 5:
             System.out.print("may");
             break;
         case 6:
             System.out.print("june");
             break;
         case 7:
             System.out.print("july");
             break;
            
         case 8:
             System.out.print("august");
             break;
         case 9:
             System.out.print("september");
             break;
         case 10:
             System.out.print("october");
             break;
         case 11:
             System.out.print("november");
             break;
         case 12:
             System.out.print("december");
      
     }
     
      //display the day and year
      System.out.println(" "+day+", "+year+".");
      
        
    }
}