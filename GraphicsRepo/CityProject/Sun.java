import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
import javax.imageio.*;
/**
 * 
 * draws a sun and moves it
 * 
 * Aaina Vanna
 * @version (a version number or a date)
 */
public class Sun implements Runnable
{
    private int x; 
    private int y;
    private int width;
    private int height;
    
    private int storage; //is for when you need to restart everything
    private int old_x; //is for getting old x coordinate
    
    Random generator = new Random();
    /**
     * Constructor - makes the coordinate for the sun
     * @param - the x-coor, y-coor, width, and height of the sun
     */
    public Sun(int pos1, int pos2, int w, int h)
    {
        x = pos1;
        y = pos2;
        width = w;
        height = h;
        storage = x;
        old_x = x;
    }
    
    /**
     * draws the sun on the page
     * @param - the page the sun is drawn on
     */
    public void draw(Graphics page)
    {
        if (x <= -80)
        {
            page.setColor(Color.white);
            page.drawOval(0,25,80,80);
            page.fillOval(0,25,80,80);
            /*
            for (int i = 0; i < 100; i++) //runs a loop to make a bunch of snow flakes
            {
                x = generator.nextInt(10) * 200; //x-coor of snow
                y = generator.nextInt(1000) - 400; //y-coor of snow
                
                //drawing the snowflakes
                page.setColor(Color.white);
                page.drawOval(x, y, 3, 3);
                page.fillOval(x, y, 3, 3);
            }*/
        }
        else
        {
            page.setColor(Color.yellow);
            page.drawOval(x, y, width, height);
            page.fillOval(x, y, width, height);
        }
        
    }
   
    /**
     * sets the new x-coor
     * @param - the new x-coor
     * 
     */
    public void setPos(int new_x)
    {
        x = new_x;
    }
    
      public void run()
    {
        while (true)
        {
            try {
                Thread.sleep(17);
            } catch (Exception e) {}
            x -= 1;
        }
    }
}
