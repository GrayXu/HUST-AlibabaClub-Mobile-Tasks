package fibonacci;
import java.util.Scanner;
//���쳲���������ǰn��
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
//	ʹx1��Ϊ��һ�������x1��x2��ֵ	  
		  x1+=x2;
		  t=x2;
		  x2=x1;
		  x1=t;
	  }
	  in.close();
  }
}
