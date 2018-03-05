
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
import javax.imageio.*;
//WATCH ALL THE WAY THRU
/**
 * Class city - makes 4 buildings that have flashing windows and at NIGHT, SNOW FALLS
 * 
 * Aaina Vannan
 * 3.1.7
 */
public class city extends Applet
{
    // instance variables - replace the example below with your own
    private final int APPLET_WIDTH = 2000;
    private final int APPLET_HEIGHT = 1000;
    private Building building1, building2, building3, building4;
    private Sun sun;
    //private Windows window;
    private int num = 1000; //x-coordinate for moving sun
    private int x; //snows x-coordinate
    private int y; //snows y-coordinate
    Random generator = new Random();
    
    /**
     * Constructor ~ makes 4 buildings, a sun, a background, and an applet with a certain size
     */
    public void init()
    {
        building1 = new Building(200, 100, Color.black, 150, 500);
        building2 = new Building(400,200, Color.black, 150, 500);
        building3 = new Building(600, 100,Color.black, 150, 500);
        building4 = new Building(800, 200, Color.black, 150, 500);
        sun = new Sun(1000, 30, 60, 60);
        
        Thread t1 = new Thread(building1);
        t1.start();
        Thread t2 = new Thread(building2);
        t2.start();
        Thread t3 = new Thread(building3);
        t3.start();
        Thread t4 = new Thread(building4);
        t4.start();
        
        setBackground(new Color(25,132,213)); 
        setSize(APPLET_WIDTH, APPLET_HEIGHT);
    }
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics page)
    {
        //draws 4 buildings
        
        building1.draw(page);
        building2.draw(page);
        building3.draw(page);
        building4.draw(page);
        
        //draws the grass
        page.drawRect(0,600, APPLET_WIDTH, 200);
        page.setColor(new Color(49, 121, 46));
        page.fillRect(0,600,APPLET_WIDTH, 200);
        
        //SUN STUFF
        sun.setPos(num); //this changes the position of the sun's x-coor 
        sun.draw(page); //draws the sun
        num -= 20; //changes x-coor so it can move
        //doesn't need to be in a while loop because repaint calls everything again
        
        if (num< -80) //when sun is off of screen, draw moon
        {
            page.setColor(Color.white);
            page.drawOval(0,25,80,80);
            page.fillOval(0,25,80,80);
            setBackground(new Color(23,56,81)); //changes the background to a darker color
            for (int i = 0; i < 100; i++) //runs a loop to make a bunch of snow flakes
            {
                x = generator.nextInt(10) * 200; //x-coor of snow
                y = generator.nextInt(1000) - 400; //y-coor of snow
                
                //drawing the snowflakes
                page.setColor(Color.white);
                page.drawOval(x, y, 3, 3);
                page.fillOval(x, y, 3, 3);
            }
        }
        
        repaint(); //runs everything through the paint again
    }
}

