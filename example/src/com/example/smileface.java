package com.example;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import sun.java2d.loops.CompositeType;
import sun.java2d.loops.FillRect;
import sun.java2d.loops.SurfaceType;

public class smileface extends JFrame
{
public smileface()
{
    
   super("RECTANGLE");
    setSize(700, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    draw d=new draw();
    add(d);
    setVisible(true);
}
public class draw extends JPanel 
{
public void paintComponent(Graphics comp) 
{
Graphics2D comp2d = (Graphics2D) comp;

comp2d.setColor(Color.GRAY);
Ellipse2D.Float el=new Ellipse2D.Float();
int x=(int)el.getX();
    
comp2d.draw(el);

comp2d.setColor(Color.red);
Arc2D.Float smile = new Arc2D.Float(65F, 140F, 80F, 80F,230F, 80F, Arc2D.Float.OPEN);
comp2d.draw(smile);


                             
Ellipse2D.Float sc1=new Ellipse2D.Float(52.5f,135,25,25);
Ellipse2D.Float sc2=new Ellipse2D.Float(122.5f,135,25,25);
comp2d.draw(sc1);
//comp2d.fill(smile);
comp2d.draw(sc2);
   

}
}

public static void main(String[] args) {
       new smileface();
    }
}