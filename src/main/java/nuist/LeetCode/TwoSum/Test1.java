package nuist.LeetCode.TwoSum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dy on 2017/8/1.
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int length ;
        int[] array ;
        int maxValue;

        //输入数据
        length = in.nextInt();
        in.hasNextLine();
        array = new int[length];
        for(int i=0;i<length;i++){
            array[i] = in.nextInt();
        }

        Arrays.sort(array);
        if (array[length-1] <= 0 || array[0]>0){
            maxValue =array[length-1] * array[length-2] * array[length-3];
        }else{
            int value1 = array[length-1] * array[length-2] * array[length-3];
            int value2 = array[0] * array[1] * array[length-1];
            maxValue = Math.max(value1,value2);
        }
        System.out.println(maxValue);
    }
}
