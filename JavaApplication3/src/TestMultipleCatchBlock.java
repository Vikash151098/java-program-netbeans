/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class TestMultipleCatchBlock {
    public static void main(String[] args) {
        try
        {
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("task 2");
        }
        catch(ArithmeticException e)
        {
            System.out.println("task 1");
        }
        System.out.println("rest of the code");
    }
}
