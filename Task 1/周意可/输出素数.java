import java.util.Scanner;

public class PrimeSieve
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		boolean[] all = new boolean [n];
		int i,j;
		for (i = 0 ; i < n ; i++)
			all[i] = true;
		for (i = 2 ; i <= ((int)Math.sqrt(n) + 1) ; i++)
			for (j = 2 ; j <= ((int)(n/i)) ; j++)
				if ((i * j - 1 ) < n)
					all[ i * j - 1] = false;//这样筛选中间有许多重复的乘积，造成了浪费
		i = 1;
		while (i < n)
		{
			if (all[i] == true)
				System.out.println(i+1);
			i++;
		}
		keyboard.close();
	}
	
}
