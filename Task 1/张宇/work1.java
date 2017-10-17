package work1;
import java.util.Scanner;
    //输出斐波那契数列前n+1项
public class work1 {
        public static void main(String[] args){
            System.out.println("Please enter a number\n");
            Scanner in = new Scanner(System.in);
            int n =in.nextInt ();
            System.out.println("1\n");//最初的1
            int i =1;
            int a =0;
            int  b=1;
            int sum = 0;
            /*a第一个数，b第二个数，与sum在每轮循环进行更替*/
            for (i=1;i<=n;i++) {
                sum = a + b;
                System.out.println(sum+"\n");
                a = b;
                b = sum;
            }
        }
    }
