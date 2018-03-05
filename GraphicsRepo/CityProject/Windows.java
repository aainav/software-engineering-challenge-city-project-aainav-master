

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * makes windows
 * 
 * Aaina Vannan
 * @version (a version number or a date)
 */
public class Windows
{
    private int[] x = new int[5]; //array
    private int[] y = new int[8];
    private int x_coor; 
    private int y_coor;
    private int height = 20;
    private int width = 20;
    private int light = 0; //color of window (flashing)
    Random generator = new Random();
    
    /**
     * Constructor - makes the 2 arrays for each building's windows
     * @param the x-coordinates of the building's windows and the y-coordinates
     */
    public Windows(int[] array1, int[] array2)
    {
       for (int i = 0; i < array1.length; i++)
       {
          x[i] = array1[i];
       }
       for (int i = 0; i < array2.length; i++)
       {
           y[i] = array2[i];
       }
    } 
    
    /**
     * draws the windows on the page
     * @param - the page it has to draw the windows on
     */
    public void draw(Graphics page)
    {
        int num = 0;
         while (num != 5) //when it hasn't reached the end of the y-coor
        {
            for (int i = 0; i < y.length; i++ )
            {
                light = generator.nextInt(10); //creates a random num, and if even, light = on
                if(light % 2 == 0)
                {
                    page.setColor(Color.white);
                }
                else
                {
                    page.setColor(Color.yellow);
                }
                page.drawRect(x[num],y[i],width,height); //drawing the windows
                page.fillRect(x[num], y[i], width,height); //filling them in with the right color
            }
            num++;
        }
    }
    
    /**
     * changes the x-coordinate of window
     * @param - the new x-coordinate
     */
    public void setX(int x)
    {
        x_coor = x;
    }
    
    /**
     * changes the y-coordinate of window
     * @param - the new y-coordinate
     */
    public void setY(int y)
    {
        y_coor = y;
    }
}
