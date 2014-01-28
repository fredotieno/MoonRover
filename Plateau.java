
public class Plateau {
	
	//Upper Right Coordinates of the rectangular plateau
	private static int plateauXMax;
	private static int plateauYMax;
	
	//Initialize the coordinates of the top right of the rectangular plateau
	public Plateau(int x, int y){
		plateauXMax = x;
		plateauYMax = y;
	}
	
	//Returns the Upper right x coordinate of the rectangular plateau
	public static int giveXPlateau(){
		return plateauXMax;
	}
	
	//Returns the Upper right y coordinate of the rectangular plateau
	public static int giveYPlateau(){
		return plateauYMax;
	}
}

