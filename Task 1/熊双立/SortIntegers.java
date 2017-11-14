package Practice_second_time;

import java.util.Arrays;
public class SortIntegers {
    public static void main(String[] args)
    {
        int[] a={4,2,3,1,5,9,7,6,8};

        Arrays.sort(a);/*用Arrays类中的sort方法进行排序*/
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
