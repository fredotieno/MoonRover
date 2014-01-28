import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class MoonRoverTest {
	
	//Test Input One
	@Test
	public void testMoonRover1() {
		int topX, topY;
		String initialiseMoon = "5 5";
		topX = initialiseMoon.charAt(0)-'0';
		topY = initialiseMoon.charAt(2)-'0';
		Plateau moon = new Plateau(topX,topY);
		int x,y;
		char o;
		String initialise = "1 2 N";
		x = initialise.charAt(0)-'0';
		y = initialise.charAt(2)-'0';
		o = initialise.charAt(4);
		MoonRover rover1 = new MoonRover(x, y, o);
		String explore = "LMLMLMLMM";
		for(int i=0; i<explore.length(); i++){
			if(explore.charAt(i)=='L')
				rover1.spinLeft();
			else if(explore.charAt(i)=='R')
				rover1.spinRight();
			else if(explore.charAt(i)=='M')
				rover1.move();
			else
				System.out.println("Error in explore command\n");
			
		}
		assertEquals("1 3 N", rover1.whereAreYou());
	}

	//Test Input Two
	@Test
	public void testMoonRover2() {
		int topX, topY;
		String initialiseMoon = "5 5";
		topX = initialiseMoon.charAt(0)-'0';
		topY = initialiseMoon.charAt(2)-'0';
		Plateau moon = new Plateau(topX,topY);
		int x,y;
		char o;
		String initialise = "3 3 E";
		x = initialise.charAt(0)-'0';
		y = initialise.charAt(2)-'0';
		o = initialise.charAt(4);
		MoonRover rover2 = new MoonRover(x, y, o);
		String explore = "MMRMMRMRRM";
		for(int i=0; i<explore.length(); i++){
			if(explore.charAt(i)=='L')
				rover2.spinLeft();
			else if(explore.charAt(i)=='R')
				rover2.spinRight();
			else if(explore.charAt(i)=='M')
				rover2.move();
			else
				System.out.println("Error in explore command\n");
		}
		assertEquals("5 1 E", rover2.whereAreYou());
	}

}

