
public class Ball 
{
	int ballHorizontalPosition;
	int ballVerticalPosition;
	int ballHorizontalDirection;
	int ballVerticalDirection;
	int maxHorizontalSpeed; 
	int maxVerticalSpeed;
	int horizontalScreenSize;
	int verticalScreenSize;
	
	public Ball(int newMaxHorizontalSpeed, int newMaxVerticalSpeed, int newHorizontalScreenSize, int newVerticalScreenSize)
	{ 
		horizontalScreenSize = newHorizontalScreenSize;
		verticalScreenSize = newVerticalScreenSize;
		maxHorizontalSpeed = newMaxHorizontalSpeed;
		maxVerticalSpeed = newMaxVerticalSpeed;
		ballHorizontalDirection = maxHorizontalSpeed;
		ballVerticalDirection = maxVerticalSpeed;
		
		positionBall(320, 240);
	}

	public void positionBall(int newBallHorizontalPosition, int newBallVerticalPosition)
	{
		ballHorizontalPosition = newBallHorizontalPosition;
		ballVerticalPosition = newBallVerticalPosition;
	}

	public void moveBall()
	{
		calculateNewBallPosition();
		checkHorizontalScreenLimits();
		checkVerticalScreenLimits();
	}
	

	private void calculateNewBallPosition() {
		ballHorizontalPosition = ballHorizontalPosition + ballHorizontalDirection;
		ballVerticalPosition = ballVerticalPosition + ballVerticalDirection;
	}

	private void checkHorizontalScreenLimits() {
		if (ballHorizontalPosition > horizontalScreenSize){
			ballHorizontalDirection = -maxHorizontalSpeed;
		}
		
		if (ballHorizontalPosition < 0){
			ballHorizontalDirection = maxHorizontalSpeed;
		}
	}

	private void checkVerticalScreenLimits() {
		if (ballVerticalPosition > verticalScreenSize){
			ballVerticalDirection = -maxVerticalSpeed;
		}
		
		if (ballVerticalPosition < 80){
			ballVerticalDirection = maxVerticalSpeed;
		}
	}

	public void setSpeed(int newSpeed)
	{
		maxHorizontalSpeed = newSpeed;
		maxVerticalSpeed = newSpeed;
	}
}
