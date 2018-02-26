//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

import java.util.Random;
import java.applet.Applet;
import java.awt.*;

public class LineUp extends Applet
{
   private final int APPLET_WIDTH = 400;
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 40;
   Random generator = new Random();
   private StickFigure figure1,figure2, figure3, figure4;

   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public void init () //I generate different hights //constructor for an applet
   {
      int h1,h2,h3,h4;  // heights of stick figures
      Random generator = new Random();

      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      
      figure1 = new StickFigure (100, 150, Color.red, h1);
      figure2 = new StickFigure (150, 150, Color.green, h2);
      figure3 = new StickFigure (200, 150, Color.cyan, h3);
      figure4 = new StickFigure (250, 150, Color.yellow, h4);
      setBackground (Color.black);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
      /*
      Thread.sleeo(10);
      figure1 = new StickFigure (100, 150, Color.red, h1);
      figure2 = new StickFigure (150, 150, Color.green, h2);
      figure3 = new StickFigure (200, 150, Color.cyan, h3);
      figure4 = new StickFigure (250, 150, Color.yellow, h4);*/
   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

      figure1.draw (page);
      figure2.draw(page);
      figure3.draw(page);
      figure4.draw(page);
      
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      
     try
     {
         //pause program for quarter-sec(in milliseconds)
         Thread.sleep(150);
     }
     catch(InterruptedException e){} //if there's a sleep in the Thread.sleep(150), it will come here
     
     figure1.draw(page);
     repaint(); //IMPORTANT LINE
   }
}
