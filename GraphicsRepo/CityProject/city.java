
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
public class city extends Applet implements Runnable
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
    private Graphics bufferGraphics;
    public Image image;
    private int snow_h; //amount of snow being changed ~ height
    
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
        Thread t5 = new Thread(sun);
        t5.start();
        
        Thread thread = new Thread(this);
        thread.start();
        
        image = createImage(APPLET_WIDTH, APPLET_HEIGHT); //all for bufferGraphics
        bufferGraphics = image.getGraphics();
        
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
        bufferGraphics.setColor(new Color(25,132,213)); //bufferGraphics
        bufferGraphics.fillRect(0,0,APPLET_WIDTH, 600);
        //draws 4 buildings
        
        building1.draw(bufferGraphics);
        building2.draw(bufferGraphics);
        building3.draw(bufferGraphics);
        building4.draw(bufferGraphics);
        
        //draws the grass
        bufferGraphics.drawRect(0,600, APPLET_WIDTH, 200);
        bufferGraphics.setColor(new Color(49, 121, 46));
        bufferGraphics.fillRect(0,600,APPLET_WIDTH, 200);
        
        //SUN STUFF
        
        sun.draw(bufferGraphics); //draws the sun
        snow_h = 0;
        if(sun.getX() <= -80)
        {
            //bufferGraphics.setColor(new Color(250,250,250));
            //bufferGraphics.drawRect(0,,APPLET_WIDTH, APPLET_HEIGHT);
            //bufferGraphics.fillRect(0,0,APPLET_WIDTH, APPLET_HEIGHT);
            snow_h += 1;
            for (int i = 0; i < 50; i++) //runs a loop to make a bunch of snow flakes
            {
                x = generator.nextInt(2000); //x-coor of snow
                y = generator.nextInt(1000) - 400; //y-coor of snow
                
                //drawing the snowflakes
                bufferGraphics.setColor(Color.white);
                bufferGraphics.drawOval(x, y, 3, 3);
                bufferGraphics.fillOval(x, y, 3, 3);
                

                bufferGraphics.drawRect(0,600, APPLET_WIDTH, snow_h );
                bufferGraphics.fillRect(0,600, APPLET_WIDTH, snow_h);
            }
        }
        
        page.drawImage(image,0,0,this); //bufferGraphics give image with buffers
    }
    
    /**
     * this is a bufferGraphic method
     */
    public void update(Graphics page)
    {
        paint(page);
    }
    
    /**
     * catches exceptions and handles threads
     */
    public void run()
    {
        while (true)
        {
            try {
                Thread.sleep(17);
            } catch (Exception e) {}
            repaint();//runs everything through the paint again
        }
    }
}

