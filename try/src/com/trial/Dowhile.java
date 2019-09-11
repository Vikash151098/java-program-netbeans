package com.trial;

class test
{
    public static void main(String [] arg)
    {
      int i, j;
for (i = 0, j = 0; i * j < 1000; i++, j += 2) {
System.out.println(i + " * " + j + " = " + (i * j));
}
    }
}