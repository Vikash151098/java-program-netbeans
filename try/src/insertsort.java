/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VK
 */
public class insertsort {
    int a[]={1,3,2,1,3,2,5,42,9,7,8};
    int b[]=new int[a.length];
    void abc() {
        b[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            b[i]=a[i];
            for(int j=i;j>0;j--)
            {
                if(b[j]>=b[j-1])
                {
                    break;
                }
                    else
                {
                    int t=b[j];
                    b[j]=b[j-1];
                    b[j-1]=t;
                }
                
                    
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
    public static void main(String[] args) {
        new insertsort().abc();
    }
}
