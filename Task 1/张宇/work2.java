package work1;
import java.util.Scanner;
//猜数游戏
public class work2 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*100);//产生0-99的随机数num
        System.out.println(num);
        System.out.println("Please enter a number\n");
        Scanner input = new Scanner(System.in);
        int n;//用户猜的数字n
        n = input.nextInt();
        do {
            if (n < num) {
                    System.out.println("Please guess larger\n");
                } else {
                    System.out.println("Please guess smaller\n");
                }
                n = input.nextInt();
            } while (num != n);
        System.out.println("Congratulations!");
    }
}
