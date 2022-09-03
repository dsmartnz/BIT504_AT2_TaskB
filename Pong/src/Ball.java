import java.awt.Color;

//Use extends to inherit from the Sprite4 Class
public class Ball extends Sprite {
	private static final int BALL_WIDTH = 25;
	private static final int BALL_HEIGHT = 25;
	private static final Color BALL_COLOUR = Color.WHITE;

	public Ball(int panelWidth, int panelHeight) {
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setColour(BALL_COLOUR);

		//Taking the width of the panel and dividing it in half, 
		//then subtracting half of the ball width
		//to make the middle of the ball in the middle of the x axis.
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		
		// Resets the position of the ball to the initial position provided in Sprite Class. 
		resetToInitialPosition();
	}
}
