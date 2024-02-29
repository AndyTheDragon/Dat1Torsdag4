import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;
	private static int attempts = 0; //Tak Mathias for ideen

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		this.attempts++;
		// Create a Scanner object   	 
		Scanner scan = new Scanner(System.in);
    	// Read user input
		
		
    	
        //use hasNextDouble to check if input is numeric, 
		if (scan.hasNextInt()) {
			// if so...
			int guess = scan.nextInt();
			scan.nextLine();
			//   Compare it with the random number
			if (rnd_number == guess) {
				//   Let the user know the result of the comparison
				System.out.println("Congratulations, you guessed correct :)");
				System.out.println("It took only " + attempts + " tries.");
			} else {
				System.out.println("Sorry, "+ guess + " was not the correct number");
				//   Help the user by revealing wether the guess was lower or higher than the target number
				System.out.println("The number is " + ((rnd_number<guess) ? "less" : "higher") + " than " + guess);
				//   Let the user try again by calling this method recursively
				makeAGuess();
			}
		} else {
			// if input was not numeric show an error message and call this method recursively
			System.out.println("Input has to be numeric");
			makeAGuess();
		}

    }
   

}