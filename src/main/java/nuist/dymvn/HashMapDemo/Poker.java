package nuist.dymvn.HashMapDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by dy on 2017/7/27.
 * 模拟斗地主练习： HashMap（装牌） , ArrayList（洗牌）, TreeSet(唯一排序,看牌) , Collections（list排序，洗牌）
 *
 */
public class Poker {
    public static void main(String[] args){
        HashMap<Integer,String> newPoker = new HashMap<Integer, String>();
        ArrayList<Integer> pokreIndex = new ArrayList<Integer>();
        String[] pokerNum = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] pokerColor = {"♠","♡","♢","♧"};

        //装牌
        int index = 0;
        for(String num : pokerNum){
            for(String color : pokerColor){
                if(newPoker.get(index) == null){
                    newPoker.put(index,color.concat(num));
                    pokreIndex.add(index);
                    index++;
                }else {

                }
            }
        }
        newPoker.put(52,"小王");
        pokreIndex.add(52);
        newPoker.put(53,"大王");
        pokreIndex.add(53);

        //洗牌
        Collections.shuffle(pokreIndex);

        //发牌
        TreeSet<Integer> p1 = new TreeSet<Integer>();
        TreeSet<Integer> p2 = new TreeSet<Integer>();
        TreeSet<Integer> p3 = new TreeSet<Integer>();
        TreeSet<Integer> px = new TreeSet<Integer>();

        for (int num : pokreIndex){
            if (num < 3 ){
                px.add(pokreIndex.get(num));
            } else if (num % 3 == 0){
                p1.add(pokreIndex.get(num));
            }else if (num % 3 ==1){
                p2.add(pokreIndex.get(num));
            }else if(num % 3 == 2){
                p3.add(pokreIndex.get(num));
            }
        }

        //看牌
        lookPoker("刘备",p1,newPoker);
        lookPoker("张飞",p2,newPoker);
        lookPoker("关羽",p3,newPoker);
        lookPoker("底牌",px,newPoker);


    }

    public static void lookPoker(String name, TreeSet<Integer> per, HashMap<Integer,String> poker){
        System.out.print(name+"的牌是：");
        for (int index : per){
            System.out.print(poker.get(index).toString());
        }
        System.out.println();
    }
}
