package com.assigment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
class abc
{
    public static void main(String[] args) {
        ArrayList <Integer> ar=new ArrayList();
        ArrayList <Double> ar1=new ArrayList();
        ar.add(4);
        ar.add(69);
        Iterator t1=ar.iterator();
        while(t1.hasNext())
        {
        System.out.println(t1.next());
        }
        
    }
}