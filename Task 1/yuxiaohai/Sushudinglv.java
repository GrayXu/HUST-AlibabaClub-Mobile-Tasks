package sushudinglv;

import java.util.Scanner;
public class Sushudinglv {
	public static void main(String[] args)
	{
		int n,k,i,j=0;
		System.out.println("Input a number:");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] prime;    /*����һ������Ϊn���������ռ�С��n���ѱ����ֵ�����*/
		prime=new int[n];    
		if(n<=1)        /*��n��С������ֶ����*/
			System.out.println("There isn't any prime number smaller than "+n);
		else if(n<=2)      
			System.out.println("2\t");
		else if(n<=3)
			System.out.println("2\t3\t");
		else      /*n>=4ʱ����������prime�м���2,3����*/
		{
			prime[0]=2;
			prime[1]=3;
			for(k=4;k<=n;k++)       /*�Դ�4��n�������μ����Ƿ�Ϊ����*/
			{
				for(i=0;i<=n/2;i++)
				{
					if(prime[i]==0)       /*�������е��������������Թ�һ��ʱ˵��k�����κ�һ��С������������������k������*/
						break;
					if((k%prime[i])==0)   /*��k��ĳ��С��������������ʱ˵��kΪ����*/
						break;
				}
				if(prime[i]==0)    /*��kΪ����ʱ����������prime������*/
					prime[i]=k;	
			}
			/*ѭ��������prime�����еķ���Ԫ�������������nȫ������*/
			while(prime[j]!=0)
				{
				System.out.println(prime[j]+"\t");
				j++;
				}	
		}
		in.close();
	}
}
