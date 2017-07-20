package nuist.LeetCode.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dy on 2017/7/15.
 */
public class TwoSumTest {
    public static void main(String[] args){
        int target = 6;
        int[] array = {3,2,4};
        int[] index = twoSum(target,array);
        System.out.println(Arrays.toString(index));


    }
    public static int[] twoSum(int target, int[] array){
        int length = array.length;
        Arrays.sort(array);
        int maxValue = array[length-2]+array[length-1];
        int minValue = array[0]+array[1];
        System.out.println(Arrays.toString(array));
        if ((target<minValue)||(target>maxValue))
            System.out.println("Target error!!");
        ArrayList<Integer> twoSum = new ArrayList<Integer>();
        int[] index = new int[2];
        int flag = 0;
        for (int i =0;i<length-1;i++) {
            for (int j = i+1; j < length; j++) {
                twoSum.add(array[i] + array[j]);
                if (twoSum.get(flag) == target) {
                    index[0] = i;
                    index[1] = j;
                }
                flag++;
            }
        }
        return index;
    }
    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
