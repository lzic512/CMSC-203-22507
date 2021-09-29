import java.util.Scanner;
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

public class WiFiDiagnosis {
	/*
	 * This method will ask a series of questions to the user, in which the user will answer 'yes' or 'no'
	 * After asking if the problem is fixed, the code will determine if the next step is needed to the user
	 * After determining if the next step is needed, it will once again ask a question, starting the cycle over again
	 * There is a limit in what the code can do though, and once it has no more advice to give, it will tell the user to contact their ISP
	 */
	public static void main(String[] args) 
	{
		String answer;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you having problems with your internet connectivity? This Diagnosis might help.");
		System.out.println("First step: reboot your computer\nAre you able to connect to the internet? (yes or no)");
		answer = keyboard.nextLine();
		if(answer.compareTo("yes") == 0)
			System.out.println("Rebooting your computer seemed to work");
		else
		{
			System.out.println("Second step: reboot your router\nNow are you able to connect with the internet? (yes or no)");
			answer = keyboard.nextLine();
			if (answer.compareTo("yes") == 0)
				System.out.println("Rebooting your router seemed to work");
			else
			{
				System.out.println("Third step make sure the cables to your router are plugged in firmly and your router is getting power\nNow are you able to connect with the internet? (yes or no)");
				answer = keyboard.nextLine();
				if (answer.compareTo("yes") == 0)
					System.out.println("Checking your cables seemed to work");
				else 
				{
					System.out.println("Fourth step: Move your computer closer to the router\nNow are you able to connect with the internet? (yes or no)");
					answer = keyboard.nextLine();
					if (answer.compareTo("yes") == 0)
						System.out.println("Checking your cables seemed to work");
					else
					System.out.print("Fifth step: contact your ISP\nmake sure your ISP is hooked up to your router.");
				}
			}
		}
		System.out.println("\nLuke Zic");
		
	}
}
