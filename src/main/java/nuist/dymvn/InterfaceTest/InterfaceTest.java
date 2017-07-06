package nuist.dymvn.InterfaceTest;

/**
 * Created by dy on 2017/7/6.
 * 抽象类和接口的练习
 *    接口中的方法只能是abstract的，所以实现类中必须实现接口中的方法；
 *    接口中的成员变量默认必须是，public static final ,常量
 *    所有类默认是继承object类的
 */
interface InterTest{
    public static final int age = 10;

    public  abstract  void interTest();     //接口中的方法只能是abstract的，所以实现类中必须实现接口中的方法；
}

class InterImpl implements InterTest{
    public void interTest(){
        System.out.println("这是一个接口测试！！");
    }
}
public class InterfaceTest {
    public static void main(String[] args){
        InterImpl interImpl = new InterImpl();
        System.out.println(interImpl.age);       //接口中的成员变量默认必须是，public static final ,常量
        interImpl.interTest();


        System.out.println("----------------------");
        InterTest inter = new InterImpl();
        System.out.println(inter.age);
        inter.interTest();
    }
}
