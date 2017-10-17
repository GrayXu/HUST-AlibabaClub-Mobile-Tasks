import java.util.Scanner;

public class Main{
 
    public static void main(String[] args) {
        System.out.println("请输入正整数n:");
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) 
        {
            int j = 2;
            while (i % j != 0) 
            {    
            		j++; 
            }
            if (j == i)
            {
                System.out.println(i    ); 
            }
        }
    }
 
}