package worktwo;

import java.util.Scanner;

public class worktwo
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	  int a = (int)(1+Math.random()*(3-1+1));
	
	do
	  {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a:");
		int b = input.nextInt();
		
		if(a<b)  
		{
	      System.out.println("It's too big.");
		}
		else if(a>b)
		{
		  System.out.println("It's too small.");
		}
		else if(a==b)
		{
			System.out.println("Well down!");
			return;
		}
	  } while (a>0);
	}
}




