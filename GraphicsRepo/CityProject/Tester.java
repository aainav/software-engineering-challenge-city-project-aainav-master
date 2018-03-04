
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.applet.Applet;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String[] args)
    {
        Building building = new Building(1,2, Color.black, 3, 4);
        building.test();
        
        //Windows win = new Windows(1,2);
        //win.test1();
        //win.setX(2);
        //win.setY(3);
        //win.test1();
    }
}
