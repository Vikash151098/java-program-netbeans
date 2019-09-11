package com.trial;
class arr
{
public static void main(String []arg)
{
  int []a={7,6,5,8,0,3,1,2,4,9};  
int []b=new int[9];

for(int i=0;i<9;i++)
{
if(i<4){
b[i]=a[i];}
else
{
b[i]=a[i+1];}
}
//displaying the value of an array
for(int j=0;j<9;j++)
{
System.out.println(j+1+" th element of an array is: "+b[j]);

}
}

}