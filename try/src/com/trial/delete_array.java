package com.trial;
class array
{
public static void main(String []arg)
{
int []a={6,8,5,9,1,2,8,6,7,3};
int []b=new int[9];
for(int i=0;i<9;i++)
{
if(i<4)
b[i]=a[i];
else
b[i]=a[i+1];
//displaying the value of an array
System.out.println(i+1+" th element of array is: "+b[i]);
//you see that 5th element means '3' are deleted
}

}

}