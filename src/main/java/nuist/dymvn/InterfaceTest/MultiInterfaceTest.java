package nuist.dymvn.InterfaceTest;

/**
 * Created by dy on 2017/7/6.
 * 接口是可以多层实现的，且支持接口的多层继承
 */
interface Father{
    int age = 40;
    public void showFather();

}
interface Mather{
    int age = 35;
    public void showMather();

}
interface Sister extends Father,Mather{
    int age = Father.age;
    //public void showSister();
}
class Son implements Sister{
    public void showFather(){
        System.out.println("这是父亲接口的实现方法！");
    }
    public void showMather(){
        System.out.println("这是母亲方法的实现方法！");
    }
    public void showSister(){
        System.out.println("这是母亲方法的实现方法！");
    }
}
public class MultiInterfaceTest {
    public static void main(String[]  args){
        Son son = new Son();
        son.showFather();
        Father son1 = new Son();
        System.out.println(son1.age);
        son1.showFather();
        Mather son2 = new Son();
        System.out.println(son2.age);
        son2.showMather();
        Sister son3 = new Son();
        System.out.println(son3.age);
        son3.showFather();
    }
}
