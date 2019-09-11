
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vikash Kumar
 */
public class FillZero {
    int arr[][]={{0,1,2,3},{2,0,3,5},{3,5,6,8},{3,4,0,8}};
    ArrayList<Integer> a=new ArrayList<Integer>();

    void search()
    {
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length;j++)
          {
              if(arr[i][j]==0)
              {
                  a.add(i);
                  a.add(j);
              }
          }
      }
    }
    void insert()
    {
        for(int i=0;i<a.size();i=i+2)
        {
            fillzero(a.get(i), a.get(i+1));
       
        }
    }
    void fillzero(int p,int q)
    {
        for(int i=0;i<arr.length;i++)
        {
      arr[i][q]=0;
        }
        for(int j=0;j<arr.length;j++)
        {
      arr[p][j]=0;
        }
    }
    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        FillZero obj=new FillZero();
        obj.search();
        obj.insert();
        obj.display();
        
    }
    
}
