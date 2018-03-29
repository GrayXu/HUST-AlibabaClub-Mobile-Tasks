package task2;//查询sub是否是str的子串，返回一个整数，
import java.util.Scanner;
public class getSubStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first string\n");
        String one =in.nextLine() ;
        char[] sub = one.toCharArray();//字符串转数组sub
        System.out.println("Please enter the second string\n");
        String two =in.next() ;
        char [] str=two.toCharArray();//字符串转数组str
        System.out.println(SubStr.getSubStrIndex(sub,str));//输出整数
    }
}
class SubStr//自定义类
{
    private int len, lensub, lenstr;//实例域
    public int alength(char x[])//非静态方法：求字符串的长度-1
    {
        return x.length ;
    }
    public static int getSubStrIndex(char sub[], char str[]) {//静态方法：求初次出现位置
        int indexOf = 0, i=0,j=0;         //indexOf:初次出现位置，i：sub计位
        SubStr subStr = new SubStr();//实例化类
        int lensub = subStr.alength(sub);
        int lenstr = subStr.alength(str);//调用length方法
        for (j = 0; j <lenstr; j++)
            if (sub[i] == str[j]){
               indexOf=j;//确定初次重合位置
               break;}//跳出循环
       if(indexOf==j){//判断是否有重合
         for(j =indexOf; j <lenstr; j++)
            if(sub[i] == str[j])  i++;//寻找下一个重合的字符
         if ((indexOf >lenstr - lensub)||j>lenstr)//排除
                indexOf = -1;}//不符时返回-1
       else  indexOf=-1;
       return indexOf;
        }
    }
