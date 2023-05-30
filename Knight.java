import java.awt.Color;
/**
 * Class Knigth - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
public class Knight extends SuperRobot
{
 int x,y; 
 boolean team;
 int piece;
 boolean life;
 public Knight(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        team=t;
        piece=p;
        life=true;
    }
 public void upRight()
 {
  move(2);
  turnRight();
  move();
  faceNorth();
 }
 public int getPiece()
    {return piece;
    }
 public void upLeft()
 {
  move(2);
  turnLeft();
  move();
  faceNorth();
 }
 public void rightUp()
 {
  turnRight();
  move(2);
  turnLeft();
  move();
  faceNorth();
 }
 public void rightDown()
 {
  turnRight();
  move(2);
  turnRight();
  move();
  faceNorth();
 }
 public void LeftUp()
 {
  turnLeft();
  move(2);
  turnRight();
  move();
  faceNorth();
 }
 public void LeftDown()
 {
  turnLeft();
  move(2);
  turnLeft();
  move();
  faceNorth();
 }
  public void downRigth()
 {
  turnAround();
  move(2);
  turnLeft();
  move();
  faceNorth();
 }
 public void downLeft()
 {
  turnAround();
  move(2);
  turnRight();
  move();
  faceNorth();
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
     return "Knight at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
     else
     return "Knight at "+(char)(this.getAvenue()+62)+(this.getStreet()-2);
    }
}
