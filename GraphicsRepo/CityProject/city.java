
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * Class city - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class city extends Applet
{
    // instance variables - replace the example below with your own
    private final int APPLET_WIDTH = 2000;
    private final int APPLET_HEIGHT = 1000;
    
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
        // simple text displayed on applet
        setBackground(new Color(31,190,214));
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
        Building building1 = new Building(200, 200, Color.black, 150, 500);
        building1.draw
        /*
        page.setColor(Color.black);
        page.drawRect(200,200,150,500);
        page.fillRect(200,200,150,500);
        
        page.setColor(Color.black);
        page.drawRect(400,400,100,600);
        page.fillRect(400,400,100,600);
        
        page.setColor(Color.black);
        page.drawRect(600,100,100,500);
        page.fillRect(600,100,100,500);
        
        page.setColor(Color.black);
        page.drawRect(800,600,300,200);
        page.fillRect(800,600,300,200);
        */
        //page.setColor(Color.black);
        page.drawRect(0,500, APPLET_WIDTH, 200);
        page.setColor(new Color(49, 121, 46));
        page.fillRect(0,500,APPLET_WIDTH, 200);
        
    }
}

