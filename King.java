
/**
 * Class King - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
import kareltherobot.*;
import java.awt.Color;
public class King extends SuperRobot
{
    boolean team;
    int piece;
    boolean life;
    public King(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }

    public void backdiagonalR()
    {
        turnAround();
        move();
        turnLeft();
        move();
        turnRight();
    }

    public void backdiagonalL()
    {
        turnAround();
        move();
        turnRight();
        move();
        turnLeft();
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

    public String getCoordinate()
    {
        if(team)
            return "King at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
        else
            return "King at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }

    public int getPiece()
    {return piece;
    }

    public void setLife(boolean t)
    {
        life=t;
    }

    public boolean getLife()
    {return life;}
}
