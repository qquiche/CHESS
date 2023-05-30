
/**
 * Class test - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
import kareltherobot.*;
import java.awt.Color;
public class test implements Directions
{
    public static void main()
    {
        // Create the world
        World.readWorld("untitled.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);

        // Create and command robots here
        King k=new King(10,6,South,0,Color.RED,false,5);
        System.out.println(k.getCoordinate());
    }
}
