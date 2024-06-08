import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;
	        int totalScore = 0;
	        while (playAgain) {
	            int numberToGuess = random.nextInt(100) + 1;
	            int numberOfAttempts = 10;
	            boolean GuessedCorrectly = false;

	            System.out.println("Generated a number between 1 and 100. Try to guess it!");

	            for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
	                System.out.print("Attempt " + attempt + ": Enter your guess: ");
	                int Guess = scanner.nextInt();

	                if (Guess == numberToGuess) {
	                    System.out.println("Congratulations! You guessed the correct number.");
	                    totalScore += (numberOfAttempts - attempt + 1);
	                    GuessedCorrectly = true;
	                    break;
	                } else if (Guess > numberToGuess) {
	                    System.out.println("Your guess is too high.");
	                } else {
	                    System.out.println("Your guess is too low.");
	                }
	            }

	            if (!GuessedCorrectly) {
	                System.out.println("Sorry, you have used all attempts. The correct number was " + numberToGuess + ".");
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String response = scanner.next();
	            playAgain = response.equalsIgnoreCase("yes");
	        }

	        System.out.println("Thank you for playing! Your total score is: " + totalScore);

	}

}
