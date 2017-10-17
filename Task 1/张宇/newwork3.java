package work1;
import java.util.Scanner;//输出从0到某数字n范围内的所有素数
public class newwork3 {
    public static void main(String[] args) {
        System.out.println("Please enter a number\n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j = 0;         //数组计数
        int[] A = new int[79000];         //素数数组A
        A[0] = 2;             //初始化
        int count = 0;        //素数计数
        int m;                //2-n的数字
        System.out.println("2\n");
        for (m = 3; m <= n; m += 2) {
            boolean is = true;
            double root = Math.sqrt(m);//m的平方根
            for (i = 0; i <= j; i++) {
                if (m % A[i] == 0) is = false;
            }
            if (A[j] <= root) j++;
            if (is) {
                System.out.println(m + "\n");    //输出素数
                count++;
                A[count] = m;
            }
        }
    }
}