import java.util.Random;
import java.util.Scanner;

public class Caishuzi {

	public static void main(String[] args) {
	Random random= new Random();
	int x=0;
	
	x =random.nextInt(100)+1;
	
	int num=0;
	
		Scanner in =new Scanner(System.in);
		System.out.println("请输入1~100的数字：");
		num=in.nextInt();
		while(x!=num) {
		
			if(num>x) {
			System.out.println("你猜大了！");
			num=in.nextInt();
		}
		else  {
			System.out.println("你猜小了！");
			num=in.nextInt();
	}
		}
			System.out.println("恭喜你，猜对了！");
		
		
}
}