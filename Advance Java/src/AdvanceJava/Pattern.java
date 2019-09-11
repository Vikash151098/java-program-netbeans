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
public class Pattern {
    
    void linex(int x1,int y1,int x2,int y2)
    {
//        for(int i=0;i<=y;i++)
//        {
//            if(x>0&&y>0)
//            {
//            for(int k=y;k>i;k--)
//            {
//                System.out.print(" ");
//            }
//            }
//            for(int j=0;j==0;j++)
//            {
//                System.out.print("#");
//            }
//            
//            System.out.println("");
//        }
        
        // calculate dx , dy
int dx = x2 - x1;
int dy = y2 - y1;

// Depending upon absolute value of dx & dy
// choose number of steps to put pixel as
// steps = abs(dx) > abs(dy) ? abs(dx) : abs(dy)
int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);

// calculate increment in x & y for each steps
float Xinc = dx / (float) steps;
float Yinc = dy / (float) steps;

// Put pixel for each step
int X = x1;
int Y = y1;
for (int i = 0; i <= steps; i++)
{
    putpixel (X,Y);
    X += Xinc;
    Y += Yinc;
}
   }
    void circle()
    {
        
    }
    void semi_circle()
    {
        
    }
    void rectangle()
    {
        
    }
    void putpixel(int x,int y)
    {
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(i==y-1&&j==x-1)
            {
                System.out.println("*");   
            }
            else
                System.out.print(" "); 
            }
            
            System.out.println();
            
        }
        
    }
    public static void main(String[] args) {
        Pattern p=new Pattern();
        p.linex(0, 0, 10, 10);
    }
}
