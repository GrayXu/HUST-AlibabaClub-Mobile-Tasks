package caishuyouxi;

import java.util.Random;
import java.util.Scanner;
public class caishuyouxi {
	public static int answer=new Random().nextInt(10000);
	public static void main(String[] args)
	{
		System.out.println("Input a number between 0 and 9999");
		int x=11000;                                                  /*��һ����Χ���xʹ����������ѭ��*/
		while(x!=answer)                                              /*������ֵ���ڴ�ʱ������ѭ��*/
		{
			Scanner in=new Scanner(System.in);
			x=in.nextInt();
			if((x>9999)||(x<0))                                       /*������������Χ���x����ִ�����ʾ*/
				System.out.println("error!Input a number between 0 and 9999!");
			else if(x>answer) {                                       /*��x����ȷ�𰸵�ֵ�Ƚϸ�����Ӧ��ʾ*/
				System.out.println("the answer is smaller than "+x);
			}
			else if(x<answer) {
				System.out.println("the answer is bigger than "+x);
			}
		}
		System.out.println("Yes,the answer is "+x);
	}
}
