
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class WordKey {
    
    public static void main(String[] args) {
        int a=0;
        String s[]={"if","break","int","goto","defer","continue","class","double","void","default"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        String p=sc.nextLine();
        System.out.println("Expected output");
        for (String item : s) {
            if (item.equals(p)) {
                a++;
                break;
            } 
        }
        if(a==1)
        {
            System.out.println(p+" is a keyword");
        }
        else
        {
            System.out.println(p+" is not a keyword");
        }
        
        
    }
    
}
