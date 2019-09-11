/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java24hours;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JApplet;

/**
 *
 * @author VK
 */
public class SalutonApplet extends JApplet
{
    String greeting;
   public void init()
   {
       greeting="saluton mondo";
   }
   public void paint(Graphics screen)
   {
       Graphics2D screen2d=(Graphics2D) screen;
       screen2d.drawString(greeting, 25, 50);
       screen2d.fillRect(50,50,50,50);
       screen2d.setColor(Color.red);
   }
   
       
}
