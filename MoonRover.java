
public class MoonRover {
	//Possible Cardinal Points the Rover can be facing
	public static final int NORTH = 0;
	public static final int EAST = 90;
	public static final int SOUTH = 180;
	public static final int WEST = 270;
	
		
	//Rover's Coordinates on the plateau
	private int xCoordinate;
	private int yCoordinate;
	
	//Store the orientation of the MoonRover
	private int orientation;
	private char heading;
	
	//Initialize the MoonRover Coordinates on the Rectangular plateau	
	public MoonRover(int x, int y, char o){
		xCoordinate = x;
		//If x coordinate is outside plateau start x = 0
		if(x>Plateau.giveXPlateau())
			xCoordinate = 0;
		
		yCoordinate = y;
		//If x coordinate is outside plateau start y = 0
		if(y>Plateau.giveYPlateau())
			yCoordinate = 0;

		if(o == 'N'){
			orientation = NORTH;
		}
		else if(o == 'S'){
			orientation = SOUTH;
		}
		else if(o == 'E'){
			orientation = EAST;
		}
		else if(o == 'W'){
			orientation = WEST;
		}
		else//If o is an invalid input set to default North orientation
			orientation = NORTH;
	}
	
	//The orientation at 360 is the same as the orientation at 0
	private void rectifyOrientation(){
		if(orientation == 360)
			orientation = NORTH;
		else if(orientation == -90)
			orientation = WEST;
	}
	
	//Rover spins 90 degrees to the left
	public void spinLeft(){
		orientation -= 90;
		rectifyOrientation();
	}
	
	//Rover spins 90 degrees to the right
	public void spinRight(){
		orientation += 90;
		rectifyOrientation();
	}
	
	//Move the rover one step in the direction of orientation
	public void move(){
		if(orientation == NORTH){
			if(yCoordinate != Plateau.giveYPlateau())
				yCoordinate += 1;
		}
		else if(orientation == SOUTH){
			if(yCoordinate != 0)
				yCoordinate -= 1;
		}
		else if(orientation == EAST){
			if(xCoordinate != Plateau.giveXPlateau())
				xCoordinate += 1;
		}
		else
			if(xCoordinate != 0)
				xCoordinate -= 1;
	}
	
	//Returns the location of the rover
	public String whereAreYou(){
		if(orientation == NORTH){
			heading = 'N';
		}
		else if(orientation == SOUTH){
			heading = 'S';
		}
		else if(orientation == EAST){
			heading = 'E';
		}
		else
			heading = 'W';
		return xCoordinate+" "+yCoordinate+" "+heading;
	}
}

