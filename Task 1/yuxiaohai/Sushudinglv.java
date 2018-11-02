package sushudinglv;

import java.util.Scanner;
public class Sushudinglv {
	public static void main(String[] args)
	{
		int n,k,i,j=0;
		System.out.println("Input a number:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] prime;    /*定义一个长度为n的数组来收集小于n的已被发现的素数*/
		prime=new int[n];    
		if(n<=1)        /*对n较小的情况手动输出*/
			System.out.println("There isn't any prime number smaller than "+n);
		else if(n<=2)      
			System.out.println("2\t");
		else if(n<=3)
			System.out.println("2\t3\t");
		else      /*n>=4时，先向数组prime中加入2,3两项*/
		{
			prime[0]=2;
			prime[1]=3;
			for(k=4;k<=n;k++)       /*对从4至n的数依次检验是否为素数*/
			{
				for(i=0;i<=n/2;i++)
				{
					if(prime[i]==0)       /*当数组中的素数都用来测试过一次时说明k不被任何一个小于他的素数整除，即k是素数*/
						break;
					if((k%prime[i])==0)   /*当k被某个小于它的素数整除时说明k为合数*/
						break;
				}
				if(prime[i]==0)    /*当k为素数时，把它收入prime数组中*/
					prime[i]=k;	
			}
			/*循环结束后将prime数组中的非零元素输出即不大于n全部素数*/
			while(prime[j]!=0)
				{
				System.out.println(prime[j]+"\t");
				j++;
				}	
		}
		in.close();
	}
}
