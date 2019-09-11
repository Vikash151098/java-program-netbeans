/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

/**
 *
 * @author VK
 */
public class Point3D {
    private int x,y,z;
    
    public Point3D(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        
    }
    public void move(int a,int b,int c)
    {
        this.x=a;
        this.y=b;
        this.z=c;
    }
    public void translate(int p,int q,int r)
    {
        this.x+=p;
         this.y+=q;
          this.z+=r;
    }
    String get()
    {
        return (this.x+","+this.y+","+this.z);
    }
    public static void main(String[] args) {
        Point3D ob=new Point3D(2,5,9);
        System.out.println("current point is "+ob.get());
        
        //move point to (3,9,35)
        ob.move(3, 9, 35);
        System.out.println("current point after move  is "+ob.get());
        
        //translate the point(-4,-4,-4)
        ob.translate(-4,-4, -4);
        System.out.println("current point after translate  is "+ob.get());
    }
    
}
