/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VK
 */
public class ladder {
    public static void main(String[] args) {
        boolean a=true;
        for(int i=1;i<=5;i++)
        {
            if(i%2!=0)
            {
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            }
            else
            {
                for(int j=i;j>=1;j--){
                System.out.print(j);
                
            }
            }
            System.out.println("");
        }
    }
}
