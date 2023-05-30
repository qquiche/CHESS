import kareltherobot.*;
import java.awt.Color;
public class Pawn extends SuperRobot
{
    int moveCount = 0;
    boolean team;
    int piece;
    boolean life;
    public Pawn(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }

    public int getMoves()
    {
        return moveCount;
    }

    public void move(int a)
    {
        if(moveCount<1)
            move();
        else
            for(int i = 0; i < a; i++)
                move();
    }

    public void attackLeft()
    {
        move();
        turnLeft();
        move();
        turnRight();
    }

    public void attackRight()
    {
        move();
        turnRight();
        move();
        turnLeft(); 
    }

    public boolean getTeam(){return team;}

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
        return "Pawn at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }
}
