package com.assigment;
import java.util.*;
 class ConstructorTest 
 {
    Scanner sc = new Scanner(System.in);
    double xa,ya;
    public ConstructorTest() 
    { 
        
        System.out.println(" <---TEST REVIEW ---->");
        System.out.println("20"+"+"+"10"+"=30");
        System.out.println("20"+"-"+"10"+"=10");
        System.out.println("20"+"*"+"10"+"=200");
        System.out.println("20"+"/"+"10"+"=2");
    System.out.println(" ");
    }
    double z,y,x,w,zz,yy,xx,ww;
     void Level() 
     {
         z = 25;
         System.out.println(" ---  LEVEL 1 ---");
        System.out.print(" 10+15 = ");
          zz = sc.nextInt();
        }
       void Level(int aa) {
         y = aa;
         System.out.println(" ---  LEVEL 2 ---");
        System.out.print(" 15-10 = ");
          yy = sc.nextInt();
        }
        void Level(float bb) {
         x = bb;
        System.out.println(" ---  LEVEL 3 ---");
        System.out.print(" 10*15 = ");
          xx = sc.nextInt();
        }
         void Level(double cc) {
         w = cc;
        System.out.println(" ---  LEVEL 4 ---");
        System.out.print(" 90/15 = ");
          ww = sc.nextInt();
        }
    
        void LevelResult() {
            if (z==zz && y==yy && x==xx&& w==ww)  { 
            System.out.println(" corrct Answer");
            System.out.println(" You can play next Level."); 
            }  
            else { 
            System.out.println(" You are Wrong.");
            System.out.println(" You are Disqualified...");
            System.exit(0);
            }
        }   
 }
 
class Test {
  public static void main(String[] args) {
   ConstructorTest ct =new ConstructorTest();    
    System.out.println(" <--- YOUR TEST TIME --->");
    System.out.println(" ");
      ct.Level();
       ct.LevelResult();
      ct.Level(5);
      ct.LevelResult();
      ct.Level(150.00f);
      ct.LevelResult();
       ct.Level(6.0);
       ct.LevelResult();
    ct.LevelResult();
    
  }
}
