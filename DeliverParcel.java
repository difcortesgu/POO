package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {   int x=10,y=3;
     // Set up the initial situation
      City prague = new City();
   
      Wall blockAve = new Wall(prague, 3, 8, Direction.WEST);
      Wall w2 = new Wall(prague, 2, 8, Direction.NORTH);
      Wall w3 = new Wall(prague, 2, 6, Direction.WEST);
      Wall w4 = new Wall(prague, 2, 4, Direction.WEST);
      Wall w5 = new Wall(prague, 1, 6, Direction.NORTH);
      
      Thing ball = new Thing(prague, y, x);
    
      Robot easy = new Robot(prague,y,x, Direction.WEST,1);
      move recorrido = new move (easy);
      jugar j1 = new jugar (recorrido,easy,ball) ;
      j1.futbol();
      System.out.println(easy.countThingsInBackpack());
      
      /*
      // Direct the robot to the final situation
      karel.move();
      karel.move();
      karel.pickThing();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();	// finished turning right
      karel.move();
     // karel.putThing();
      karel.move();
      //System.out.println(karel.countThingsInBackpack());
        */
   }
}
