package caishuyouxi;

import java.util.Random;
import java.util.Scanner;
public class caishuyouxi {
	public static int answer=new Random().nextInt(10000);
	public static void main(String[] args)
	{
		System.out.println("Input a number between 0 and 9999");
		int x=11000;                                                  /*给一个范围外的x使程序进入猜数循环*/
		while(x!=answer)                                              /*当输入值等于答案时才跳出循环*/
		{
			Scanner in=new Scanner(System.in);
			x=in.nextInt();
			if((x>9999)||(x<0))                                       /*如果输入给定范围外的x则出现错误提示*/
				System.out.println("error!Input a number between 0 and 9999!");
			else if(x>answer) {                                       /*对x与正确答案的值比较给出相应提示*/
				System.out.println("the answer is smaller than "+x);
			}
			else if(x<answer) {
				System.out.println("the answer is bigger than "+x);
			}
		}
		System.out.println("Yes,the answer is "+x);
	}
}
