 class mid
{   
   static int count=0;
   static int y=4663879;
  static int z=y;
    public static void main(String [ ] arg)
    {
      
       while(z!=0)
       {
           z/=10;
           ++count;
       }
       int middle=(count-1)/2;
       int last=count;
       int middledigit=0;
      boolean midexist;
     midexist = ((count%2)==1);
          if(midexist)
          {
              int i;
              i=last;
              int x=y;
               while(i!=middle){
                   middledigit=x%10;
                   x/=10;
                   i--;
               }
              System.out.println("the mid  no. of dogit is :"+middledigit);
          }
           
        else
             System.out.println("the even no. can't mid digit");
           
             
         
         
    }
}