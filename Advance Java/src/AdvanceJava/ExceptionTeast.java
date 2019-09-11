/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvanceJava;

/**
 *
 * @author Vikash Kumar
 */
class ExceptionTest {
public static void main(String[] args) {
int d = 0, result;
try
{
result = 100/d;
}

catch(ArithmeticException e)
{
    System.out.println("an arthmetic exception occured");
    result=100;
}
System.out.println("after catch block");
   System.out.println(result); 
}
}