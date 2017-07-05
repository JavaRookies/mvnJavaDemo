package nuist.dymvn.PolymorphicTest;

/**
 * Created by dy on 2017/7/5.
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
public class ClassCast {
    public static void main(String[] args){
        孔子爹 kz = new 孔子();
        System.out.println(kz.age);
        kz.teach();

    }


}
