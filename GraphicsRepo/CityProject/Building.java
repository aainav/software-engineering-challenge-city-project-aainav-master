
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * 
 * makes buildings
 * Aaina Vannan 
 * @version (a version number or a date)
 */
public class Building implements Runnable
{
    /** description of instance variable x (add comment for each instance variable) */
    private int value_x; //x-coor of building
    private int value_y; //y-coor of builing
    private Color color; //color of building
    private int height; //height of builing
    private int width; //width of building
    
    private Windows window,window1, window2,window3; //windows for each building
    //window number corresponds with arrays for those window coordinates
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
     * @param - the x coordinate of building, y coordinate of building, color of building, width
     * of building, height of building
     */
    public Building(int x, int y, Color shade, int w, int h)
    {
        value_x = x;
        value_y = y;
        color = shade;
        height = h;
        width = w;
        
        //y-coordinates stay the same for big buildings (goes in column1) & y-coordinates stay the
        //same for small buildings (goes in column)
        
        //all for window
        int x_count = 405; //smallest it goes
        for (int i = 0; i < row.length; i++)
        {
            row[i] = x_count;
            x_count += 30;
        }
        
        int y_count = 205; //smallest it goes
        for (int i = 0; i <column.length; i++)
        {
            column[i] = y_count;
            y_count += 50;
        }
        
        int y_count1 = 105; //smallest it goes for big building
        for(int i = 0;i < column1.length; i++)
        {
            column1[i] = y_count1;
            y_count1 += 60;
        }
        
        window = new Windows(row, column); //arrays go in to Window
        
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
   
    /**
     * draws the windows
     * @param - the graphic page it draws in 
     */
    public void draw(Graphics page)
    {
        //draws buildings
        page.setColor(color);
        page.drawRect(value_x, value_y, width, height);
        page.fillRect(value_x, value_y, width, height);

        //for windows
        int num = 0; //in each column, you have multiple rows
         while (num != 5)
        {
            for (int i = 0; i < column.length; i++ )
            {
                window.setX(column[i]); //row
                window.setY(row[num]); //column
                window.draw(page);
                
                window1.setY(row1[num]); //column
                window1.draw(page);
                
                window2.setY(row2[num]); //column
                window2.draw(page);
                
                window3.setY(row3[num]); //column
                window3.draw(page);
            }
            num++; //increases to a different column
        }
    }
    
    /**
     * catches exceptions?
     */
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
