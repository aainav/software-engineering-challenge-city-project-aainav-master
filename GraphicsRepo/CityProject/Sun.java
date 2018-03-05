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
public class Sun
{
    private int x; 
    private int y;
    private int width;
    private int height;
    
    private int storage; //is for when you need to restart everything
    private int old_x; //is for getting old x coordinate
    
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
        page.setColor(Color.yellow);
        page.drawOval(x, y, width, height);
        page.fillOval(x, y, width, height);
        
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
}
