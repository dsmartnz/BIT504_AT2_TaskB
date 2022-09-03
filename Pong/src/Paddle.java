 import java.awt.Color;
 
 public class Paddle extends Sprite {
       private static final int PADDLE_WIDTH = 10;
       private static final int PADDLE_HEIGHT = 100;
       private static final Color PADDLE_COLOUR = Color.WHITE;
       private static final int DISTANCE_FROM_EDGE = 40;
       
       
       public Paddle(Player player, int panelWidth, int panelHeight) {
    	   
    	   setWidth(PADDLE_WIDTH);
    	   setHeight(PADDLE_HEIGHT);
    	   setColour(PADDLE_COLOUR);
    	   int xPos;
    	   if(player == Player.One) {
    		   	xPos = DISTANCE_FROM_EDGE;
    		   	
    	   } else {
    		   xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
    	   
    	   }
           setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
           resetToInitialPosition();
       }
       
       //We know how to find the centre of the panel, so we can figure out 
       //the y axis for both paddles easily enough by dividing the height 
       //of the screen by two and adjusting for the height of the paddle.
       
       //use a new variable DISTANCE_FROM_EDGE and use this to determine 
       //the x position of both paddles. The left paddle is simply equal 
       //to the DISTANCE_FROM_EDGE but the right paddle needs to consider 
       //the screen width and width of the paddle. Using a little math, 
       //we can find the correct position 
       //for the paddle: xPos = screen width – DISTANCE_FROM_EDGE – paddle width.
       
 }
 