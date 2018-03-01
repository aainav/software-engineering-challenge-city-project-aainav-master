
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
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int value_x;
    private int value_y;
    private Color color;
    private int height;
    private int width;
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
    }
    
    public void draw(Graphics page)
    {
        page.setColor(color);
        page.drawRect(value_x, value_y, width, height);
        page.fillRect(value_x, value_y, width, height);
    }
}
