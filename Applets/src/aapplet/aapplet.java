/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author VK
 */
public class aapplet extends Applet {
Button b1;
  public void paint(Graphics g)
          
          
  {
      g.drawString("my name is vikash", 50, 30);
      g.drawRect(20, 30, 50, 40);
      g.drawOval(30,40,20,50);
      g.fillRect(80,80, 80, 80);
      g.setColor(Color.red);
      b1=new Button("press");
      b1.setBounds(50,70,80,30);
      b1.setBackground(Color.BLUE);
      //add(b1);
  }
}
