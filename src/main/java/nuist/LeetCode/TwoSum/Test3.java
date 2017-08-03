package nuist.LeetCode.TwoSum;

import java.util.Scanner;

/**
 * Created by dy on 2017/8/1.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length ;
        int[] arrayH ;
        int[] arrayW;
        int maxValue;

        //输入数据
        length = in.nextInt();
        in.hasNextLine();
        arrayH = new int[length];
        for(int i=0;i<length;i++){
            arrayH[i] = in.nextInt();
        }
        in.hasNextLine();
        length = in.nextInt();
        in.hasNextLine();
        arrayW = new int[length];
        for(int i=0;i<length;i++){
            arrayW[i] = in.nextInt();
        }
        int num = getNum(arrayH,arrayW);

    }
    public static int getNum(int[] arrayH, int[] arrayW){
        return 0;
    }
}
