import kareltherobot.*;
import java.awt.Color;
/**
 * Class Rook - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
public class Rook extends SuperRobot
{
    boolean team;
 int piece;
 boolean life;
 public Rook(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }
 public int getAvenue()
    {
        int x;
        String ts = this.toString();
        ts = ts.substring(ts.indexOf("u")+4,ts.indexOf(")",ts.indexOf("u")));
        x = Integer.parseInt(ts);
        return x;
    }
    public void moveLeft()
    {
        turnLeft();
        move();
        turnRight();
    }
    public void moveRight()
    {
        turnRight();
        move();
        turnLeft();
    }
    public void moveBackward()
    {
       turnAround();
       move();
       turnAround();
    }
    public int getStreet()
    {
        int y;
        String ts = this.toString();
        ts = ts.substring(ts.indexOf(":")+2,ts.indexOf(")"));
        y = Integer.parseInt(ts);
        return y;
    }
    public int getPiece()
    {return piece;
    }
 public String getCoordinate()
 {
     if(team&&!this.anyBeepersInBeeperBag())
     return "Rook at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
     else
     return "Rook at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }

}
