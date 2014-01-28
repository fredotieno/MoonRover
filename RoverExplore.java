import java.util.Scanner;


public class RoverExplore {
	public static void main(String args[]){
		int topX, topY;
		System.out.println("\t===========================================");
		System.out.println("\t  NASA MOON EXPLORATION BY ROBOTIC ROVERS");
		System.out.println("\t===========================================");
		//Input the top right coordinates of the moon plateau
		System.out.println("Enter the top right coordinates(INTEGERS) of the moon plateau with a SINGLE space between the " +
				"two coordinates (In such a manner:5 5)");
		Scanner input = new Scanner(System.in);
		String initialiseMoon = input.nextLine();
		topX = initialiseMoon.charAt(0)-'0';
		topY = initialiseMoon.charAt(2)-'0';
		Plateau moon = new Plateau(topX,topY);
		int x,y,numMoonRovers;
		int num = 0;
		char o;
		//Determine the number of moon rovers that are to be deployed on the moon
		System.out.println("How many moon rovers do you want to deploy(Enter INTEGER) ?");
		numMoonRovers = input.nextInt();
		input.nextLine();//Clears input stream
		MoonRover[] rover = new MoonRover[numMoonRovers];
		System.out.println("The Moon Rover's Position Comprises its X and Y coordinate(INTEGERS) " +
				"and a letter representing orientation which is a Cardinal Point");
		System.out.println("A Rover exploring the plateau may be given the following instructions:" +
				" spin left use letter L, spin right use letter R or move use M\n");
		do{
			//Input the initial coordinates and orientation of the moon rover
			System.out.println("Enter the start coordinates(INTEGERS) of the rover and its orientation(N/S/E/W)\n" +
					"Put a SINGLE SPACE between the inputs(In such a manner:1 3 N");
			String initialiseRover = input.nextLine();
			x = initialiseRover.charAt(0)-'0';
			y = initialiseRover.charAt(2)-'0';
			o = initialiseRover.charAt(4);
			rover[num] = new MoonRover(x, y, o);
			//Input the instructions of how the rover is to explore the moon plateau
			System.out.println("Enter the instruction(LETTERS) of how the rover is to explore\n " +
					"LEAVE NO SPACE between the instructions(In such a manner:LMLMLMR)");
			String explore = input.nextLine();
			for(int i=0; i<explore.length(); i++){
				if(explore.charAt(i)=='L')
					rover[num].spinLeft();
				else if(explore.charAt(i)=='R')
					rover[num].spinRight();
				else if(explore.charAt(i)=='M')
					rover[num].move();
				else
					//when invalid entries are input
					System.out.println("Error in explore command\n");
				
			}
			num++;
			//Execute one rover at a time
		}while(num < numMoonRovers);
		
		for(int i=0;i<numMoonRovers;i++){
			//Rovers are numbered from 0 to numMoonRovers-1
			//Output Rovers Location and orientation
			System.out.println("\t============================================");
			System.out.println("\tFinal Coordinates and Heading of Moon Rovers");
			System.out.println("\t============================================");
			System.out.println("\t         Rover " + i +" is at "+ rover[i].whereAreYou());
		}
	}
}

