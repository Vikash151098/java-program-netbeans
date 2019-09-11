package com.java24hours;

import java.util.*;
class Dice
{
    public static void main(String [] arg)
    {
      Random  generator = new Random();
     int value = generator.nextInt(6)+1;
        System.out.println(value);
    }
}