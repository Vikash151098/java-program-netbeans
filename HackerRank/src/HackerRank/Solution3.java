/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

/**
 *
 * @author VK
 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution3{
    
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Object phone_book[][]=new Object[n][2];
        
        ArrayList<String> key=new ArrayList<>();
        
        for(int i = 0; i <n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phone_book[i][0]=name;
            phone_book[i][1]=phone;
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            key.add(s); 
        }
        in.close();
        
        for(int k=0;k<key.size();k++)
        {
            for(int j=0;j<n;j++)
            {
            if(phone_book[j][0].equals(key.get(k)))
            {
                System.out.println(phone_book[j][0]+"="+phone_book[j][1]); 
            }
            else
            {
                System.out.println("Not found");
            }
            }
        }
    }
}

