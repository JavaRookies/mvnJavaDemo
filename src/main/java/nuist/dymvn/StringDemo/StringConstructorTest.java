package nuist.dymvn.StringDemo;

import java.nio.charset.Charset;

/**
 * Created by dy on 2017/7/10.
 * String类的构造和初始化
 */
public class StringConstructorTest {
    public static void main(String[] args){
        byte[] bytes = { 48 ,98 , 99, 100};
        char[] chars = {'0','b','c','d'};
        //String(byte[] bytes, Charset charset)
        String str1 = new String(bytes,Charset.defaultCharset());
        //String(byte[] bytes, int offset, int length)
        String str2 = new String(bytes,1,2);
        //String(char[] value)

        //String(char[] value, int offset, int count)

        System.out.println(str2);
    }
}
