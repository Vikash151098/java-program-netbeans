class login 
{
        static  String input_username="vikash98";
  static  String input_password="vikash@1998";
     static   String output_username="vikash98";
     static  String output_password="vikash@1998";
   boolean  check()
                {
                               
        if(input_username == output_username && input_password==output_password)
            return true;
        else
            return false;
                }
    public static void main(String [] arg)
    {         
      
        login ob=new login();
        boolean x=ob.check();
       if(x==true)
        System.out.println("log in");
       else
      System.out.println("username or password incorrect");     
    }
}