package com.java24hours;

class spaceremover
{
    public static void main(String[] args) {
        String jarry="v i k a s h           k u m a r";
        char[] gh=jarry.toCharArray();
        for(int dex=0;dex<gh.length;dex++)
        {
         char current =gh[dex];  
         if(current!=' ')
                System.out.print(current);
         else
                System.out.print("");  
        }
        System.out.println("");
    }
    
}