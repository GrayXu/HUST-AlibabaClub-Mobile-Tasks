package Practice_second_time;
import java.util.Scanner;
public class findallprimes {
    public static void main(String[] argvs){
        int N;//用来存储输入的整数N
        Scanner temp=new  Scanner(System.in);
        System.out.println("请输入一个整数N,程序将输出所有0到该数的所有素数：:");
        N=temp.nextInt();
        for(int i=1;i<=N;i++)
        {
            int judge;/*用于判断*/
            judge=0;
            for(int j=1;j<=i;j++)
            {/*判断i是否有让其不是质数的因子*/
                if(i%j==0&&j>=2&&j<i)
                    judge=1;
            }
            if(judge==0&&i>=2)
                System.out.println(i+" ");
        }
    }
}
