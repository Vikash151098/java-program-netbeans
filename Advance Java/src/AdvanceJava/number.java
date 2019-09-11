/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvanceJava;
import java.util.Stack;
/**
 *
 * @author Vikash Kumar
 */
public class number {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[]={3,2,6,7,1,8,9,10,5,4};
        
  
        Stack st=new Stack();
        
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
            if(A[i]+B[j]>1&&A[i]+B[j]<8)
            {
                st.push(A[i]+B[j]);   
            }
            }
        }
        while(st.size()>0)
        {
            System.out.println(st.pop());  
        }
    }
    
    
}
