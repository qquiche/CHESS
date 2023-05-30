import kareltherobot.*;
import java.awt.Color;
public class Queen extends SuperRobot
{
    boolean team;
    int piece;
    boolean life;
 public Queen(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }
    
    public void moveUp(int a)
    {
        for(int i = 0; i < a; i++)
        {move();}  
    }
    
    public void moveRight(int a)
    {
        turnRight();
        for(int i = 0; i < a; i++)
        {move();}
        turnLeft();
    }
    
    public void moveLeft(int a)
    {
        turnLeft();
        for(int i = 0; i < a; i++)
        {move();}
        turnRight();
    }
    
    public void moveDown(int a)
    {
        turnAround();
        for(int i = 0; i < a; i++)
        {move();}
        turnAround();
    }
    
    public void upLeft(int a)
    {
        for(int i = 0; i<a;i++)
        {
            move();
            turnLeft();
            move();
            turnRight();
        }
    }
    public int getPiece()
    {return piece;
    }
    public void upRight(int a)
    {
        for(int i = 0; i<a;i++)
        {
            move();
            turnRight();
            move();
            turnLeft();
        }
    }
    
    public void downLeft(int a)
    {
        turnAround();
        for(int i = 0; i<a;i++)
        {
            move();
            turnRight();
            move();
            turnLeft();
        }
        turnAround();
    }
    
    public void downRight(int a)
    {
        turnAround();
        for(int i = 0; i<a;i++)
        {
            move();
            turnLeft();
            move();
            turnRight();
        }
        turnAround();
    }
    
    public int getAvenue()
    {
        int x;
        String ts = this.toString();
        ts = ts.substring(ts.indexOf("u")+4,ts.indexOf("u")+5);
        x = Integer.parseInt(ts);
        return x;
    }
    
    public int getStreet()
    {
        int y;
        String ts = this.toString();
        ts = ts.substring(ts.indexOf(":")+2,ts.indexOf(":")+3);
        y = Integer.parseInt(ts);
        return y;
    }
    
    public String getCoordinate()
    {
        if(team)
            return "Queen at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
        else
            return "Queen at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }
}
