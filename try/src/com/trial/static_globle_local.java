package com.trial;
class ab
{
int a=4;     //declaring globle variable
static int b=5;   //declaring static variable

void x()      //non static method access static variable,globle  as well as local varial  
{
int c=8;    //declaring local variable
System.out.println("value of a: "+a);
System.out.println("value of b: "+b);
System.out.println("value of c: "+c);
}
static void y()         // static method access static variable as well as local variable
{
System.out.println("value of b access through static y method b : "+b);
}
public static void main(String []arg) //main method is also static method
{
ab ob=new ab();
ob.x();
ob.y();
System.out.println("value of b access through main method b : "+b);

}

}