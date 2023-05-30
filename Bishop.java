import kareltherobot.*;
import java.awt.Color;

/**
 * Class Bishop - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
public class Bishop extends SuperRobot
{
    boolean team;
    int piece;
    boolean life;
 public Bishop(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }
    public void DiagnoalR()
    {
        move();
        turnRight();
        move();
        faceNorth();

    }

    public void DiagnoalL()
    {
        move();
        turnLeft();
        move();
        faceNorth();

    }    
    public void BackdiagnoalR()
    {
        turnRight();
        turnRight();
        move();
        turnRight();
        moveUntilRobot();
        faceNorth();
    }
        public void BackdiagnoalL()
    {
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        moveUntilRobot();
        faceNorth();
    }
    public void moveUntilRobot()
    {
        if (!nextToARobot())
        {
            if (frontIsClear())
            {
               move();
                
            }
        }
    }
    public int getAvenue()
    {
        int x;
        String ts = this.toString();
        ts = ts.substring(ts.indexOf("u")+4,ts.indexOf(")",ts.indexOf("u")));
        x = Integer.parseInt(ts);
        return x;
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
     if(team)
     return "Bishop at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
     else
     return "Bishop at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }
}
