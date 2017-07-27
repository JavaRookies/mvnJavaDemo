package nuist.dymvn.ScannerDemo;

import java.util.Scanner;

/**
 * Created by dy on 2017/7/25.
 * next()、nextInt()....属于阻塞型输入，光标不会移动到下一行
 * 空格，Tab，Enter，会继续等待
 * nextLine()光标会移动到下一行
 */
public class ScannerNextTest {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("请输入一个整数");
        while(true){
            String tString = in.next();  //会把当前输入的值赋给tString
            int num = in.nextInt();      //会再一次阻塞输入，取得一个新输入赋给num
              System.out.println("请输入一个字符串");
              //String str = in.nextLine();
            System.out.println("num:"+num);
            String str = in.next();              //取分隔符的第一部分赋给str，游标不会换行，会移到分隔符处
            System.out.println("num="+num+",str="+str);
            String s3 = in.nextLine();              //输入的enter，会被赋给s3，，，
            System.out.println("s3:"+s3);
        }
    }
}
