import java.util.Scanner;
import java.util.Random;

public class Guess
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		int answer = randomGenerator.nextInt(100) + 1;
		System.out.println("I've chosen a number between 1 and 100.");
		System.out.println("Please enter a number:");
		int n = keyboard.nextInt();
		while (n != answer)
		{
			if (n > answer)
			{
				System.out.println("Too big!\nYou can guess again:");
				n = keyboard.nextInt();
				continue;
			}
			else
			{
				System.out.println("Too small!\nYou can guess again:");
				n = keyboard.nextInt();
				continue;
			}
		}
		System.out.println("You are right!It's " + answer + "!");
		keyboard.close();
	}
}
