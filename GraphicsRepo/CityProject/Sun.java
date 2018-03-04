import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
import javax.imageio.*;
/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    private int x;
    private int y;
    private int width;
    private int height;
    private int storage;
    public Sun(int pos1, int pos2, int w, int h)
    {
        x = pos1;
        y = pos2;
        width = w;
        height = h;
        storage = x;
    }
    
    public void draw(Graphics page)
    {
        while(true)
        {
            page.setColor(Color.yellow);
            page.drawOval(x, y, width, height);
            page.fillOval(x, y, width, height);
            x -= 100;
            if (x == 100)
            {
                x = storage;
            }
            try{
                Thread.sleep(17);
            }catch (Exception e){}
        }
    }
    
    public void setPos(int new_x)
    {
        x = new_x;
    }
}
