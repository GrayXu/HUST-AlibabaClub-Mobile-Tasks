import java.util.Scanner;

public class Sequence
{
	public static void main (String[] args)
	{
		System.out.println("Enter the length of Fibonacci sequence:");
		Scanner keyboard = new Scanner(System.in);
		int length = keyboard.nextInt();
		
		int prev = 1,current = 1;
		int next = prev + current;
		for (int i = 0;i<length;i++)
		{
			System.out.println(prev);
			prev = current;
			current = next;
			next = prev + current;
		}
		keyboard.close();
	}
}
