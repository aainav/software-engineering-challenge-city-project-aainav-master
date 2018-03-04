

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * Write a description of class Windows here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Windows
{
    private int[] x = new int[5];
    private int[] y = new int[8];
    private int x_coor;
    private int y_coor;
    private int height = 20;
    private int width = 20;
    private int light = 0;
    Random generator = new Random();
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
    /*
    public void array()
    {
        for (int c = 0; c < positions[0].length - 1; c++)
        {
            for (int r = 0; r < positions.length - 1; r++)
            {
                
            }
        }
    }
    */
    public void draw(Graphics page)
    {
        int num = 0;
        //page.setColor(Color.white);
         while (num != 5)
        {
            for (int i = 0; i < y.length; i++ )
            {
                light = generator.nextInt(10);
                if(light % 2 == 0)
                {
                    page.setColor(Color.white);
                }
                else
                {
                    page.setColor(Color.yellow);
                }
                page.drawRect(x[num],y[i],width,height);
                page.fillRect(x[num], y[i], width,height);
            }
            num++;
        }
        //page.setColor(Color.white);
        //page.drawRect(x_coor, y_coor, width, height);
        //page.fillRect(x_coor, y_coor, width, height);
        //array();
    }
    public void setX(int x)
    {
        x_coor = x;
    }
    public void setY(int y)
    {
        y_coor = y;
    }
    
    public void test1()
    {
        System.out.println(x_coor);
        System.out.println(y_coor);
    }
}
