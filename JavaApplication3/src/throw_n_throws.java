/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class throw_n_throws {
    static void throwMethod() throws NullPointerException
    {
        System.out.println("inside throw method");
        throw new NullPointerException("demo");
    }
    public static void main(String[] args) {
        try
        {
            throwMethod();
        }
        catch(NullPointerException e)
        {
            System.out.println("the exeception get caught"+e);
        }
    }
}
