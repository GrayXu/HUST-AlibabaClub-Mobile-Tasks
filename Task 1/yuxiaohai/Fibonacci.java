package fibonacci;
import java.util.Scanner;
//输出斐波那契数列前n项
public class Fibonacci{
  public static void main(String[] args)
  {
	  int n;
	  long x1=1;
	  long x2=1;
	  int i;
	  long t;
	  System.out.println("please enter the number of items:");
	  Scanner in=new Scanner(System.in);
	  n=in.nextInt();
	  for(i=1;i<=n;i++)
	  {
		  System.out.println(x1);
//	使x1成为下一项，并交换x1，x2的值	  
		  x1+=x2;
		  t=x2;
		  x2=x1;
		  x1=t;
	  }
	  in.close();
  }
}
