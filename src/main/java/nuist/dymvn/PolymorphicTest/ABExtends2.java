package nuist.dymvn.PolymorphicTest;

/**
 * Created by dy on 2017/7/4.
 * 多态练习，二次调用时方法的多态性
 */

class A1 {
    public void show(){
        show2();
    }
    public void show2(){
        System.out.print("我");
    }
}

class B1 extends A1{
    public void show2(){
        System.out.print("爱");
    }
}

class C1 extends B1{
    public void show(){
        super.show();
    }
    public void show2(){
        System.out.print("你");
    }
}

public class ABExtends2 {
    public static void main(String[] args){
        A1 a1 = new A1();
        a1.show();                 //调用A1中show --> A1中show2

        A1 a = new B1();
        a.show();                  //调用A1中show --> B1中show2（因为show2被重写）

        B1 b = new C1();
        b.show();                  //调用A1中show --> C1中show2（因为show2被重写）
    }
}
