package workthree;

import java.util.Scanner;

public class workthree 
{
  @SuppressWarnings("resource")
public static void main(String[] args)
  {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number:");
	int n = input.nextInt();
    int i = 1;
    
    if(n<6)
    {
      while(i<=n)
      {
    	if(i!=4)
    	{
    	 System.out.println(i);
    	}
    	i++;
      }
    }
    
    else if(n>=6)
    {
      System.out.println(1);
      System.out.println(2);
      System.out.println(3);
      System.out.println(5);
      int b=6;
      while(b<=n)
      {
       int k=b%6;
       if(k==1|k==5)
       {
         System.out.println(b);
       }
       b++;
      }
     }
    
   
  }
}
