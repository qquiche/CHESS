import java.util.Scanner;
import kareltherobot.*;
import java.awt.Color;
public class LocFind extends SuperRobot
{
    public LocFind(int street, int avenue, Direction dir, int beepers,

    Color col, boolean t,int p)

    {
        super(street, avenue, dir, beepers, col); 
        
    }
    public static String checkf()
    {
        Scanner scan = new Scanner(System.in);
        
        boolean useable = false;
        String input="";
        while(!useable)
        {
        
            try{
            System.out.println("Enter a piece's location in A1 format");
            input = scan.nextLine();
        
            if(!(input.charAt(0)<65||input.charAt(0)>75))
            {
                if(input.charAt(1)<1|| input.charAt(1)>8)
                    useable = true;
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception: Exception "+e);
        }
        
        }
        return input;
    }
    public static String checkg()
    {
        Scanner scan = new Scanner(System.in);
        
        boolean useable = false;
        String input="";
        while(!useable)
        {
            System.out.println("Enter the selected pieces's next move in A1 format");
            input = scan.nextLine();
            if(!(input.charAt(0)<65||input.charAt(0)>75))
            {
                if(input.charAt(1)<1|| input.charAt(1)>8)
                    useable = true;
            }
        }
        return input;
    }
    public static int find(SuperRobot w[],SuperRobot b[],boolean t,String input)
    {
        SuperRobot[] white = w;
        SuperRobot[] black = b;
        
        boolean turn = t;
        if(turn)
        {
            for(int i = 0; i < white.length;i++)
            {
                if(white[i].getCoordinate().substring(white[i].getCoordinate().indexOf("at")+3).equals(input))
                {
                return i;
                }
            }
        }
        else
        {
            for(int i = 0; i < black.length;i++)
            {
                if(black[i].getCoordinate().substring(black[i].getCoordinate().indexOf("at")+3).equals(input))
                {
                return i;
                }
            }
        }
        return 17;
    }
    public static String getXY(String input)
    {
        return ""+((int)input.charAt(0)-62)+","+(input.charAt(1)-48+2);
    }
}
