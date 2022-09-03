import java.awt.Color;
import java.awt.Rectangle;

//A good example of abstraction and encapsulation. By keeping the coordinates 
//and velocity variables private, we ensure that the variables are 
//only modified within the class. The class provides the necessary methods 
//for other classes to access or modify these variables – as you've seen, 
//these methods are referred to as getter and setter methods.

public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;
	private int initialXPosition, initialYPosition;
	
	
	

	public int getXPosition () {
		return xPosition;
	}

	public int getYPosition () {
		return yPosition;
	}
	
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}

	public void resetToInitialPosition() {
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	public void setXPosition(int newX) {
		xPosition = newX;
	}
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	
	
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	//One of the challenges is finding the width and height of the playing field. 
	//Passing a parameter does this, as these methods will likely be called from 
	//PongPanel that has access to this information.
	

	
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
		if(xPosition < 0) {
			xPosition = 0;
		} else if(xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}
	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
		if(yPosition < 0) {
			yPosition = 0;
		} else if(yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}
	
	
	/// Get/Set X & Y Velocity
	//When we call the setXPosition() or setYPosition()method, 
	//we want to check if the new position is outside the screen. 
	//If it is, we want to change the position so that it will stay 
	//inside the screen boundary.

	 public int getXVelocity() {
         return xVelocity;
     }
	 
	 public void setXVelocity(int xVelocity) {
	         this.xVelocity = xVelocity;
	     }
	 
	 public int getYVelocity() {
	         return yVelocity;
	     }
	 public void setYVelocity(int yVelocity) {
	         this.yVelocity = yVelocity;
	     }
	 
	 
	 

	 
	/// Get/Set Width & Height

     public int getWidth() {
         return width;
     }
     public void setWidth(int width) {
         this.width = width;
     }
     public int getHeight() {
         return height;
     }
     public void setHeight(int height) {
         this.height = height;
     }
/// Get/Set Color
     

     public Color getColour() {
         return colour;
     }
     
     public void setColour(Color colour) {
         this.colour = colour;
     }
	
     public Rectangle getRectangle() {
         return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
     }
	
     
}
