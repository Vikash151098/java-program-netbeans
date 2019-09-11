package com.java24hours;
class alphabet_finder
{
    public static void main(String[] args) {
        String str[]={"A STITCH IN TIME SAVES NINE","DON'T EAT YELLOW SNOW",
            "TASTE THE RAINBOW","EVERY GOOD BOY DOES FINE","I WANT MY MTV"};
        int lettercount[]=new int[26];
        for (String current : str) {
            char a[]=current.toCharArray();
            for(int count2=0;count2<a.length;count2++)
            {
                char b=a[count2];
                if((b>='A')&(b<='z')){
                    lettercount[b-'A']++;
                }
            }
        }
        for(char count='A';count<='Z';count++)
        {
            System.out.print(count+":"+
                    lettercount[count-'A']+" ");
        }
        System.out.println();
        
    }
}