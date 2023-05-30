
/**
 * SuperRobot.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 */ 
import kareltherobot.*;
import java.awt.Color;

public class SuperRobot extends Robot
{
    public SuperRobot(int street, int avenue, Direction dir, int beepers)
    {
        super(street, avenue, dir, beepers);
    }

    public SuperRobot(int street, int avenue, Direction dir, int beepers,

    Color col)

    {
        super(street, avenue, dir, beepers, col);  
    }

    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }

    public void turnRight()
    {
        turnLeft();
        turnAround();
    }

    public void move(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            move();
        }
    }

    public void diagonalL()
    {
        move();
        turnLeft();
        move();
        turnRight();
    }

    public void diagonalR()
    {
        move();
        turnRight();
        move();
        turnLeft();
    }

    public void moveIfClear()
    {
        if(frontIsClear())
        {
            move();
        }
    }

    public void pickIfBeeper()
    {
        if(nextToABeeper())
        {
            pickBeeper();
        }
    }

    public void putIfBeeper()
    {
        if(anyBeepersInBeeperBag())
        {
            putBeeper();
        }

    }
    public void faceNorth()
    {
        while(!facingNorth())
        {
            turnLeft();

        }
    }

    public void faceEast()
    {
        while(!facingEast())
        {
            turnLeft();

        }
    }

    public void faceSouth()
    {
        while(!facingSouth())
        {
            turnLeft();

        }
    }

    public void faceWest()
    {
        while(!facingWest())
        {
            turnLeft();

        }
    }

    public void fixColumn()
    {
        turnLeft();

        while(frontIsClear())
        {

            if(!nextToABeeper())
            {  
                putBeeper();
                move();
            }
            else if(nextToABeeper())
            {
                move();
            }

        }
        if(!nextToABeeper())
        {  
            putBeeper();
        }
        turnAround();
        while(frontIsClear())
        {
            move();
        }
        faceEast();
    }

    public void fixChurch()
    {
        while(frontIsClear())
        {
            fixColumn();

            if(frontIsClear())
            {
                move(4);
            }
        }
        fixColumn();
    }
    public void die()
    {
        World.removeNSWall(10,2);
        World.removeNSWall(3,10);
        turnLeft();
        while(frontIsClear())
        {
            move();
        }
        turnRight();
        while(frontIsClear())
        {
            move();
        }
        turnLeft();
        move();
        turnOff();
        World.placeNSWall(10,2,1);
        World.placeNSWall(3,10,1);
    }
    public int getPiece()
    {return 0;
    }
    public String getCoordinate()
 {
     return"";
    }
    public boolean getLife()
    {
        return true;
    }
    public void setLife(boolean t)
    {
        
    }
}
