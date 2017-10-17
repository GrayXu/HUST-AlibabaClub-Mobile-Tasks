package Practice_second_time;
import java.util.Scanner;
public class GuessNumGame {
    public  static void main(String[] argvs)
    {
        int judge;//用来判断是否猜对
        int guess;//用来存放输入的数
        int N ;
        Scanner temp=new  Scanner(System.in);
        /*生成一个1到100的随机数*/

        N=(int)(1+Math.random()*100);
        System.out.println("系统随机生成一个1到100的整数，猜对后结束运行：");
        judge=0;
        while(judge==0)
        {
            guess=temp.nextInt();
            if(guess>N)
                System.out.println("输入的数太大");
            else if(guess<N)
                System.out.println("输入的数太小");
            else
            {
                System.out.println("恭喜你，猜对了!");
                judge=1;
            }
        }
    }
}
