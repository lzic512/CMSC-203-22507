/*
 * Class: CMSC203 
 * Instructor: Dr.Farnaz Eivazi
 * Due: 9/28/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Luke Zic
*/
import java.util.Scanner;

public class MovieDriver {
	/*
	 * In this method I will gather information from the user, and uses objects to access and transfer information from Movie.java
	 * 
	 */
	public static void main(String [] args)
	{
		Movie movie = new Movie();
		Scanner keyboard = new Scanner(System.in);
		int i = 0, sold;
		while (i == 0)
		{
			/*
			 * This same idea is persisted throughout my code
			 * I ask for information from the user, and then use objects to input info.
			 */
			System.out.print("Enter the name of a movie:\n");
			String str = keyboard.nextLine();
			movie.setTitle(str);
			System.out.print("Enter the rating of a movie:\n");
			str = keyboard.nextLine();
			movie.setRating(str);
			System.out.print("Enter the tickets sold of a movie:\n");
			sold = keyboard.nextInt();
			movie.setSoldTickets(sold);
			System.out.println(movie.toString());
			System.out.println("Would you like to enter another? (y or n)");
			String next_buffer = keyboard.nextLine();
			String next = keyboard.nextLine();
			if(next.compareTo("y")==0)
				i = 0;
			else if(next.compareTo("n")==0)
			{
				System.out.println("Goodbye");
				i = 1;
			}
		}
	}
}
