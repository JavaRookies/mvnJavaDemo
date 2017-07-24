package nuist.dymvn.CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dy on 2017/7/24.
 *要求：键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值。
 */
public class ListTest {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputList = new ArrayList<Integer>();

        while(true){
            System.out.println("请输入数据：");
            int num = scanner.nextInt();        // //重点看一下API
            if (num != 0)
                inputList.add(num);
            else
                break;
        }
        Integer[] listArray = new Integer[inputList.size()];
        inputList.toArray(listArray);          //重点看一下API
        Arrays.sort(listArray);
        System.out.println(listArray[inputList.size()-1]);
    }
    public static int maxNum(int... intList){
        int maxNum = 0;
        for (int list : intList){
            Math.max(maxNum , list);
        }
        return maxNum;
    }
}
