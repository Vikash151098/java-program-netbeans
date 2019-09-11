package com.example;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
class multiLine extends JFrame
{
    Border bd;
    String str="vikash kumar";
  public multiLine()
          {
              setLayout(null);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              bd=BorderFactory.createLineBorder(Color.red);
             JLabel jl=new JLabel("<html>"+"<br/>"+str+"</html>");
             jl.setBounds(50,50,200,50);
             jl.setBorder(bd);
             add(jl);
             setSize(600,500);
    setVisible(true);
          }
    public static void main(String[] args) {
        new multiLine();
    }
}