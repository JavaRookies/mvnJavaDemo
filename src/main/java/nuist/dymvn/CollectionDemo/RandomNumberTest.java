package nuist.dymvn.CollectionDemo;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dy on 2017/7/24.
 * 获取10个1-20之间的随机数，要求不能重复
 * 注意：1、random.nextInt(20)的取值范围；
 */
public class RandomNumberTest {
    public static void main(String[] args){
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        Random r = new Random();
        int count = 10;
        while(count>0){
            int randomNum = r.nextInt(20)+1;             //random.nextInt(20)，只产生0-19间的随机整数
            if (!randomArray.contains(randomNum)){
                randomArray.add(randomNum);
                count--;
            }
        }
        System.out.println("随机数个数："+randomArray.size());
        for (int array:randomArray){
            System.out.println("分别是："+array);
        }
    }
}
