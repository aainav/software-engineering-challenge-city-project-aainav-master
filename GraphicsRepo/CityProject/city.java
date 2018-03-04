
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
import javax.imageio.*;
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
    private Building building1, building2, building3, building4;
    private Sun sun;
    //private Windows window;
    private int[] column = new int[8]; 
    private int[] row = new int[5];
    public void init()
    {
        building1 = new Building(200, 100, Color.black, 150, 500);
        building2 = new Building(400,200, Color.black, 150, 500);
        building3 = new Building(600, 100,Color.black, 150, 500);
        building4 = new Building(800, 200, Color.black, 150, 500);
        sun = new Sun(1000, 50, 60, 60);
        Thread t1 = new Thread(building1);
        t1.start();
        Thread t2 = new Thread(building2);
        t2.start();
        Thread t3 = new Thread(building3);
        t3.start();
        Thread t4 = new Thread(building4);
        t4.start();
    }
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
        building1.draw(page);
        building2.draw(page);
        building3.draw(page);
        building4.draw(page);
        //building1.test();
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
        page.drawRect(0,600, APPLET_WIDTH, 200);
        page.setColor(new Color(49, 121, 46));
        page.fillRect(0,600,APPLET_WIDTH, 200);
        /*
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
            }
            num++;
        }*/
        /*
        try{
            Thread.sleep(250);
        }
        catch(InterruptedException e){}*/
        sun.draw(page);
        /*
        int num = 900;
        while(num >= 0)
        {
            sun.setPos(num);
            sun.draw(page);
            num -= 100;
            repaint();
        }*/
        repaint();
    }
}

