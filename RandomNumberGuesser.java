/*
 * Class: CMSC203 
 * Instructor: Dr.Farnaz Eivazi
 * Due: 10/5/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Luke Zic
*/
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGuesser 
{
	/*
	 * In this method I will be making a random number
	 * I will be making a high and low variable to being the limits of what the user can input
	 * I will have a counter for how many tries have been attempted
	 * I will have two sentinal values to end the program, or restart the program
	 * I will have certain statements be printed out depending on what the values put into by the user are
	 */
		public static void main(String[] args) 
		{
			int k = 1;
			/*
			 * This while loop is used to restart the game, upon finishing, the person will decided if they want to try again
			 * If they select yes, k will remain as 1, but if not k will be 2, thus ending the program
			 */
			while (k == 1) 
		{
			Random RNG = new Random();
			Scanner keyboard = new Scanner(System.in);
			int j = 1;
			int low = 0;
			int high = 100;
			int counter = 1;
			int start = 1;
			int randomNum = RNG.nextInt(100);
			/*
			 * This next loop is used for each time the user makes a new guess
			 */
			while (j == 1)
			{
				int value;
				/*
				 * This if statement is used to as the user for their first guess, after this first guess, start will no longer be 1
				 * Thus this statement will not occur unless the game is restarted, or tried again
				 */
				if(start == 1)
				{
					System.out.println("Input your first guess");
					value = keyboard.nextInt();
					start = 2;
					System.out.println("You have made 1 guess");
					/*
					 * These loops are made to validate the data put in by the user
					 * And to make sure that what the user has put in is within the parameters of the program
					 * Then, the program will ask for a new value until the user puts in a valid number
					 * This will also be used later
					 */
					while (value < low)
					{
						System.out.println("Your input is too low. It must be between " + low + " and " + high + "; please input a new value");
						value = keyboard.nextInt();
					}
					while (value > high)
					{
						System.out.println("Your input is too high. It must be between " + low + " and " + high + "; please input a new value");
						value = keyboard.nextInt();
					}
					/*
					 * These if statements will be shown later as well
					 * But they are used to tell the user if their number is too high
					 * And changes the boundaries of where they can guess
					 */
					if(value > randomNum)
					{
						high = value;
						System.out.println("Your number is too high");
					}
					if(value < randomNum)
					{
						low = value;
						System.out.println("Your number is too low");
					}
				}
				else
				{
					/*
					 * This is where it is repeated for the user to have many tries
					 * The program will specify what parameters there are for where the user to guess
					 */
					System.out.println("Input your next guess  between " + low + " and "+ high);
					value = keyboard.nextInt();
					while (value < low)
					{
						System.out.println("Your input is too low. It must be between " + low + " and " + high + "; please input a new value");
						value = keyboard.nextInt();
					}
					while (value > high)
					{
						System.out.println("Your input is too high. It must be between " + low + " and " + high + "; please input a new value");
						value = keyboard.nextInt();
					}
					/*
					 * Here, once again, the program will be telling the user whether their input is too high, or too low
					 * There is also an increase to the variable counter, which counts the number of inputs the user has put in
					 */
					counter++;
					if(value > randomNum)
					{
						high = value;
						System.out.println("Your number is too high");
					}
					if(value < randomNum)
					{
						low = value;
						System.out.println("Your number is too low");
					}
					System.out.println("You have made " + counter + " guesses");
					/*
					 * After the user has won, they will be given the option to play again
					 * If the user says no, both sentinal values will be changed, thus terminating the program, and thanks the user for playing
					 * If the user says yes, only the sentinal value for this specific game will be changed, but not for the program
					 * Thus the program will run again and start a new game
					 */
					if(value == randomNum)
					{
						System.out.println("Congrats! You found the right answer!");
						System.out.println("Would you like to try again? (yes or no)");
						String answer = keyboard.nextLine();
						String answer1 = keyboard.nextLine();
						if(answer1.compareTo("no") == 0)
						{
							System.out.println("Thanks for playing!");
							j = 2;
							k = 2;
						}
						else if (answer1.compareTo("yes") == 0)
						{
							j = 2;
							k = 1;
						}
					}
				}
			}
		}
	}
}
