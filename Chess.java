import java.util.Scanner;
/**
 * Class Chess - write a description of the class here
 *
 * @author (your name here)
 * @date (date here)
 */
import kareltherobot.*;
import java.awt.Color;
public class Chess implements Directions
{
    private static int n,b;
    private static String xy,in,en;
    private static boolean turn=true;
    public static void instructions()
    {
        System.out.println("\t***Welcome to CHESS***");
        System.out.println();
        System.out.println("CHESS is chess except really inefficient\nbecause it was made by high schoolers who have literally know idea what\nthey're doing.But since we made this so poorely we'll help you out with this key\n\n");
        System.out.println("Pawn--->Red");
        System.out.println("Rook--->Orange");
        System.out.println("Knight--->Green");
        System.out.println("Bishop--->Blue");
        System.out.println("Queen--->White");
        System.out.println("King--->Black");
        System.out.println("ps. we were lazy so you can take your own pieces");
    }

    public static void main()
    {
        // Create the world
        World.readWorld("ChessBoard.kwld");
        World.setVisible(true);
        World.setDelay(30);
        World.showSpeedControl(true);

        // Create and command robots here
        Pawn pawn1=new Pawn(4,3,North,0,Color.RED,true,0);
        Pawn pawn2=new Pawn(4,4,North,0,Color.RED,true,0);
        Pawn pawn3=new Pawn(4,5,North,0,Color.RED,true,0);
        Pawn pawn4=new Pawn(4,6,North,0,Color.RED,true,0);
        Pawn pawn5=new Pawn(4,7,North,0,Color.RED,true,0);
        Pawn pawn6=new Pawn(4,8,North,0,Color.RED,true,0);
        Pawn pawn7=new Pawn(4,9,North,0,Color.RED,true,0);
        Pawn pawn8=new Pawn(4,10,North,0,Color.RED,true,0);
        Rook rook1=new Rook(3,3,North,0,Color.ORANGE,true,1);
        Knight knight1=new Knight(3,4,North,0,Color.GREEN,true,2);
        Bishop bishop1=new Bishop(3,5,North,0,Color.BLUE,true,3);
        Queen queen=new Queen(3,6,North,0,Color.WHITE,true,4);
        King king=new King(3,7,North,0,Color.BLACK,true,5);
        Bishop bishop2=new Bishop(3,8,North,0,Color.BLUE,true,3);
        Knight knight2=new Knight(3,9,North,0,Color.GREEN,true,2);
        Rook rook2=new Rook(3,10,North,0,Color.ORANGE,true,1);
        Pawn pawnb1=new Pawn(9,3,South,0,Color.RED,false,0);
        Pawn pawnb2=new Pawn(9,4,South,0,Color.RED,false,0);
        Pawn pawnb3=new Pawn(9,5,South,0,Color.RED,false,0);
        Pawn pawnb4=new Pawn(9,6,South,0,Color.RED,false,0);
        Pawn pawnb5=new Pawn(9,7,South,0,Color.RED,false,0);
        Pawn pawnb6=new Pawn(9,8,South,0,Color.RED,false,0);
        Pawn pawnb7=new Pawn(9,9,South,0,Color.RED,false,0);
        Pawn pawnb8=new Pawn(9,10,South,0,Color.RED,false,0);
        Rook rookb1=new Rook(10,3,South,0,Color.ORANGE,false,1);
        Knight knightb1=new Knight(10,4,South,0,Color.GREEN,false,2);
        Bishop bishopb1=new Bishop(10,5,South,0,Color.BLUE,false,3);
        Queen queenb=new Queen(10,6,South,0,Color.WHITE,false,4);
        King kingb=new King(10,7,South,0,Color.BLACK,false,5);
        Bishop bishopb2=new Bishop(10,8,South,0,Color.BLUE,false,3);
        Knight knightb2=new Knight(10,9,South,0,Color.GREEN,false,2);
        Rook rookb2=new Rook(10,10,South,0,Color.ORANGE,false,1);
        SuperRobot[] white= new SuperRobot[]{pawn1,pawn2,pawn3,pawn4,pawn5,pawn6,pawn7,pawn8,rook1,knight1,bishop1,queen,king,bishop2,knight2,rook2};
        SuperRobot[] black= new SuperRobot[]{pawnb1,pawnb2,pawnb3,pawnb4,pawnb5,pawnb6,pawnb7,pawnb8,rookb1,knightb1,bishopb1,queenb,kingb,bishopb2,knightb2,rookb2};

        while(black[12].getLife()&&white[12].getLife())
        {
            if(turn)
            {
                instructions();

                do
                 {in=LocFind.checkf();
                    if(n==17)
                         System.out.println("Invalid input");}
                while(n==17);
                en=LocFind.checkg();
                n=LocFind.find(white,black,turn,in);
                b=LocFind.find(white,black,!turn,en);
                System.out.println(b);
                if(b!=17)
                {
                    if(black[b].getPiece()==5)
                    black[b].setLife(false);
                    black[b].die();
                }
                if(white[n].getPiece()==0)
                {  white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new Pawn(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.RED,true,0);
                }
                else if(white[n].getPiece()==1)
                {white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new Rook(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.ORANGE,true,1);
                }
                else if(white[n].getPiece()==2)
                {white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new Knight(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.GREEN,true,2);
                }
                else if(white[n].getPiece()==3)
                {white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new Bishop (Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.BLUE,true,3);
                }
                else if(white[n].getPiece()==4)
                {white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new Queen (Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.WHITE,true,4);
                }
                else if(white[n].getPiece()==5)
                {white[n].die();
                    xy=LocFind.getXY(en);
                    white[n]=new King ((Integer.parseInt(xy.substring(xy.indexOf(",")+1))),Integer.parseInt(xy.substring(0,xy.indexOf(","))),North,0,Color.BLACK,true,5);
                }
                turn=!turn;

            }
            else
            {
                do
                {in=LocFind.checkf();
                    if(n==17)
                        System.out.println("Invalid input");}
                while(n==17);
                en=LocFind.checkg();
                n=LocFind.find(white,black,turn,in);
                b=LocFind.find(white,black,!turn,en);
                System.out.println(b);
                if(b!=17)
                {
                if(white[b].getPiece()==5)
                  white[b].setLife(false);
                    white[b].die();}
                if(black[n].getPiece()==0)
                {  black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new Pawn(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.RED,false,0);
                }
                else if(black[n].getPiece()==1)
                {black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new Rook(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.ORANGE,false,1);
                }
                else if(black[n].getPiece()==2)
                {black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new Knight(Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.GREEN,false,2);
                }
                else if(black[n].getPiece()==3)
                {black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new Bishop (Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.BLUE,false,3);
                }
                else if(black[n].getPiece()==4)
                {black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new Queen (Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.WHITE,false,4);
                }
                else if(black[n].getPiece()==5)
                {black[n].die();
                    xy=LocFind.getXY(en);
                    black[n]=new King (Integer.parseInt(xy.substring(xy.indexOf(",")+1)),Integer.parseInt(xy.substring(0,xy.indexOf(","))),South,0,Color.BLACK,false,5);
                }
                turn=!turn;

            }
        }
    }

}