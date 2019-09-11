///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Vikash Kumar
// */
//public class Pairs {
//    
//}
//HashSet<String> pairs = new HashSet<String>(t);
//
//    for(int i = 0; i < t; i++)
//    {
//        pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
//        System.out.println(pairs.size());        
//    }
//
//
//int count=0;
//boolean flag=false;
//
//for(int i=0;i<t;i++)
//{
//    if(pair_left[i]!=pair_right[i])
//    {
//    if(i==0)
//    {
//        count++;
//    }
//    for(int j=0;j<i&&i!=0;j++)
//    {
//
//  if((pair_left[i].equals(pair_left[j]))&&(pair_right[i].equals(pair_right[j])))
//  {
//      flag=false;
//      break;
//      }
//  else
//  {
//     flag=true; 
//  }
//  
//    }
//    if(flag)
//    {
//       count++; 
//    }
//System.out.println(count);
//}
//}