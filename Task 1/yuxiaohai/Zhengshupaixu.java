package zhengshupaixu;
import java.util.Scanner;

public class Zhengshupaixu {
//	��һ����֪Ԫ�ظ���������������С��������
public static void main(String[] args)
{
	int n,j,x,y,i,k,number[];
	Scanner in=new Scanner(System.in);
	n=in.nextInt();                                     /*���������Ԫ�ظ���*/
	number=new int[n];
	for(i=0;i<n;i++) {
		x=in.nextInt();
//	����x������������������	
		if(x>=0) {                                      /*x>=0ʱ��x����������һ������ǰ���αȽ�*/
			for(j=n-1;j>=0;j--) {		
//	����һ���xСʱ���Ѵ���һ����ǰ�����зǸ�����ǰ��һ���x��������			
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
		else {                                         /*x<0ʱ��x�������һ����������αȽ�*/
			for(j=0;j<n;j++) {
//	����һ���x��ʱ���Ѵ���һ����������и���������һ���x��������			
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
