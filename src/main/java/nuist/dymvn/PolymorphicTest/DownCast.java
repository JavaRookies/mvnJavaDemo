package nuist.dymvn.PolymorphicTest;

/**
 * Created by dy on 2017/7/5.
 * （1）多态练习，对象的向上转型、向下转型，以及其继承关系
 */
class 孔子爹 {
    public int age = 40;

    public void teach(){
        System.out.println("j2EE课程");
    }
}

class 孔子 extends 孔子爹{
    public int age = 20;

    public void teach(){
        System.out.println("论语");
    }
    public void play(){
        System.out.println("王者荣耀");
    }
}
public class DownCast {
    public static void main(String[] args){
        孔子爹 kz = new 孔子();
        System.out.println(kz.age);//kz是孔子爹类型的引用型变量，本质是孔子爹类型的
        kz.teach();               //若方法被重写，则使用子类的方法，但是不可调用子类特有的方法

        孔子 kz1 = (孔子)kz;
        System.out.println(kz1.age);
        kz1.play();


    }


}
