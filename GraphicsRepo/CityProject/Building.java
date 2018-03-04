
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building implements Runnable
{
    /** description of instance variable x (add comment for each instance variable) */
    private int value_x;
    private int value_y;
    private Color color;
    private int height;
    private int width;
    
    private Windows window,window1, window2,window3;
    private int[] column = new int[8];//y coordinate - vertical 
    private int[] row = new int[5]; //x coordinate - horizontal 
    
    //private int[] column1 = new int[8];//y coordinate - vertical
    private int[] row1 = new int[5]; //x coordinate - horizontal
    
    //private int[] column2 = new int[8];//y coordinate - vertical
    private int[] row2 = new int[5]; //x coordinate - horizontal
    
    private int[] row3 = new int[5]; //x coordinate - horizontal
    private int[] column1 = new int[8]; //for bigger column
    
    
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y, Color shade, int w, int h)
    {
        value_x = x;
        value_y = y;
        color = shade;
        height = h;
        width = w;
        //all for window
        int x_count = 405;
        for (int i = 0; i < row.length; i++)
        {
            row[i] = x_count;
            x_count += 30;
        }
        
        int y_count = 205;
        for (int i = 0; i <column.length; i++)
        {
            column[i] = y_count;
            y_count += 50;
        }
        
        int y_count1 = 105;
        for(int i = 0;i < column1.length; i++)
        {
            column1[i] = y_count1;
            y_count1 += 60;
        }
        
        window = new Windows(row, column);
        
        //all for window1
        int x_count1 = 205;
        for (int i = 0; i < row.length; i++)
        {
            row1[i] = x_count1;
            x_count1 += 30;
        }
        
        window1 = new Windows(row1, column1);
        
        //all for window2
        int x_count2 = 605;
        for (int i = 0; i < row2.length; i++)
        {
            row2[i] = x_count2;
            x_count2 += 30;
        }
        
        window2 = new Windows(row2, column1);
        
        //all for window3
        int x_count3 = 805;
        for (int i = 0; i < row3.length; i++)
        {
            row3[i] = x_count3;
            x_count3 += 30;
        }
        
        window3 = new Windows(row3, column);
    }
    
    public void test()
    {
        int num = 0;
        /*
        for (int i =0 ; i < row.length; i++)
        {
            System.out.println(row[i]);
        }
        System.out.println("bah");
        for (int i =0; i < column.length; i++)
        {
            System.out.println(column[i]);
        }*/
        while (num != 5)
        {
            for (int i = 0; i < column.length; i++)
            {
                System.out.println(column[i]);
                System.out.println(row[num]);
            }
            num++;
        }
    }
    
    public void draw(Graphics page)
    {
        page.setColor(color);
        page.drawRect(value_x, value_y, width, height);
        page.fillRect(value_x, value_y, width, height);
        //window.draw(page);
        
        int num = 0;
         while (num != 5)
        {
            for (int i = 0; i < column.length; i++ )
            {
                //System.out.println(column[i]);
                //System.out.println(row[num]);
                window.setX(column[i]);
                window.setY(row[num]);
                window.draw(page);
                
                window1.setY(row1[num]);
                window1.draw(page);
                
                window2.setY(row2[num]);
                window2.draw(page);
                
                window3.setY(row3[num]);
                window3.draw(page);
            }
            num++;
        }
    }
    
       public void run()
    {
        while (true)
        {
            try {
                Thread.sleep(17);
            } catch (Exception e) {}
            
        }
    }
}
