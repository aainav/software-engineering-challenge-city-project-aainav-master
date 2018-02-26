//********************************************************************
//  StickFigure.java       Author: Lewis/Loftus/Cocking
//
//  Represents a graphical stick figure.
//********************************************************************

import java.awt.*;

public class StickFigure
{
   private int baseX;     // center of figure
   private int baseY;     // floor (bottom of feet)
   private Color color;   // color of stick figure
   private int height;    // height of stick figure

   //-----------------------------------------------------------------
   //  Sets up the stick figure's primary attributes.
   //-----------------------------------------------------------------
   public StickFigure (int center, int bottom, Color shade, int size)
   {
      baseX = center;
      baseY = bottom;
      color = shade;
      height = size;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int top = baseY - height;  // top of head

      page.setColor (color);
      //                x       y       height       width
      //height and width is in relation to x and y
      page.drawOval (baseX-10, top, 20,20); //head
      page.drawLine(baseX, top+20, baseX, baseY - 30); //trunk
                //remember, increase y actually moves closer to bottom

      

      page.drawLine (baseX, baseY-30, baseX-15, baseY);  // legs
      page.drawLine (baseX, baseY-30, baseX+18, baseY);

      page.drawLine (baseX, baseY-70, baseX-25, baseY-70);  // arms
      page.drawLine (baseX, baseY-70, baseX-25, baseY-85);

   }
   
   public void setHeight(int size)
   {
       height = size;
    }
}
