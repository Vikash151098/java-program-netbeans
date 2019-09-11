package com.assigment;
class return_more
{
    int a;
int b;
  int  copy(int x,int y)
    {
        a=x;
        b=y;   
      return a&b ;
    }
      void show()
  {
     System.out.println("a: "+a+" b: "+b);
  }
    public static void main(String[] args) {
       return_more  ob=new return_more();
               ob.copy(5, 6);
               ob.show();
    }
}