import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
	Random rand= new Random();
	Scanner sc =new Scanner(System.in);
	
	int randomNumber = rand.nextInt(100) + 1;
	//System.out.println("Random number is "+randomNumber); //To know the actual random number
	
	while(true) {
	System.out.println("Enter your Guess(1-100):");
	
	int playerGuess =sc.nextInt();

	if (playerGuess == randomNumber) {
		System.out.println("Correct Answer");
		break;
	}
	  else if(randomNumber > playerGuess) {
		System.out.println("Nope ! The number is higher.Guess Again");
	}
	  else {
		System.out.println("Nope ! The number is lower.Guess Again");

    	}
	
	  }
	
	}
}
