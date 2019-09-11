/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class ExcepTest {
    public static void main(String[] args) {
        try
        {
            int a[]=new int[2];
            System.out.println("access element three"+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("out of block");
    }
}
