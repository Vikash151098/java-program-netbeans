package com.employ;
import java.util.Scanner;
 class enter
{
    private String name;
    private String city;
    private int salary;
  public  void getdata()
    {
        Scanner reader=new Scanner(System.in);
        System.out.print("enter employ name : ");
        name=reader.nextLine();
        System.out.print("enter employ city name : ");
        city=reader.nextLine();
        System.out.print("enter employ salary : ");
        salary=reader.nextInt();
    }
   public void showdata()
    {
        System.out.println("employ name : "+name);
         System.out.println("employ city name : "+city);
          System.out.println("employ salary : "+salary);
    }
}
class employ
{
    public static void main(String[] args) {
        enter ob[]=new enter[4];
        for(int i=0;i<4;i++)
        {
        ob[i].getdata();
        
        }
        for(int i=0;i<4;i++)
        {
        ob[i].showdata();
        
        }
    }
}