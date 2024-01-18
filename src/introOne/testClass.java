package introOne;
//import random function
import java.util.Random;

public class testClass {
	public static void main(String[] args) {
		//create new random instance
		Random rand = new Random();
		//create upper bounding variable for random function
		int upperBound = 3;
		int whileHolder = 2;
	
		//while loop to test randomness
		
		//while(whileHolder == 2) {
		//	int randInt = rand.nextInt(upperBound);
		//	System.out.println(randInt);
		//}
		
		//Print random number
		int randInt = rand.nextInt(upperBound);
		System.out.println(randInt);
	}	
	
}
