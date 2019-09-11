package com.java24hours;

class newroot
{
    public static void main(String[] args) {
        int n=10;
        if(args.length>0){
            n=Integer.parseInt(args[0]);
    }
        System.out.println("the sqare root of "+n+" is "+Math.sqrt(n));
        
    }
}