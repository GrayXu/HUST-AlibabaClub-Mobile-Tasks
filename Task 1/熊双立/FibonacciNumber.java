package Practice_second_time;
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args){
        Scanner temp=new  Scanner(System.in);
        int N;
        System.out.println("请输入一个正整数N，该程序将输出斐波拉契数列前N项,输入非正数退出:");
        N = temp.nextInt();

        while(N>0)
        {
            if(N==1)
                System.out.println("1");
            else if(N==2)
                System.out.println("1"+"\n"+"1");
            else if(N>=3)
            {
                System.out.println("1"+"\n"+"1");
                for(int FormerNum=1,LatterNum=1,i=3;i<=N;i++)
                {/*输出斐波拉契数列，没用递归（还不太会使用自定义方法）*/
                    int j;
                    j=LatterNum;
                    LatterNum=FormerNum+LatterNum;
                    FormerNum=j;
                    System.out.println(LatterNum);
                }
            }
            System.out.println("输入一个新的正整数，输入非正数退出：");
            N=temp.nextInt();
        }
    }
}
