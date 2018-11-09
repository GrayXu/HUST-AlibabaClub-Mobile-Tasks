package zhengshupaixu;
import java.util.Scanner;

public class Zhengshupaixu {
//	将一组已知元素个数的整数数组由小到大排序
public static void main(String[] args)
{
	int n,j,x,y,i,k,number[];
	Scanner in=new Scanner(System.in);
	n=in.nextInt();                                     /*输入数组的元素个数*/
	number=new int[n];
	for(i=0;i<n;i++) {
		x=in.nextInt();
//	根据x的正负性来分类讨论	
		if(x>=0) {                                      /*x>=0时将x从数组的最后一个数向前依次比较*/
			for(j=n-1;j>=0;j--) {		
//	当有一项比x小时，把从这一项往前的所有非负数往前移一项并将x插入这里			
				if(x>=number[j]) {                       
					for(k=j;number[k]!=0;k--) {
						y=number[k];
						number[k]=x;
						x=y;
					}
					number[k]=x;
					break;
				}
			}
		}
		else {                                         /*x<0时将x从数组第一个数向后依次比较*/
			for(j=0;j<n;j++) {
//	当有一项比x大时，把从这一项往后的所有负数往后移一项并将x插入这里			
				if(x<=number[j]) {
					for(k=j;number[k]!=0;k++) {
						y=number[k];
						number[k]=x;
						x=y;
					}
					number[k]=x;
					break;
				}
			}
		}
	}
	for(i=0;i<n;i++)
	System.out.println(number[i]);
}
}
