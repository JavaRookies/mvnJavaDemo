package nuist.dymvn.AbstractDemo;

/**
 * Created by dy on 2017/7/7.
 * 抽象类练习
 * ######抽象类中可以不含抽象方法，此时和普通类的继承效果类似
 * &&&&&&抽象类不能直接实例化，必须靠具体子类实例化，但是其有构造方法---为了子类访问父类数据的初始化
 */

abstract class AbstractAnimal{   //抽象类中可以不含抽象方法，但是有抽象方法的类一定是抽象类
    int age;
    public abstract void eat();

    public AbstractAnimal(){}

    public AbstractAnimal(int age){}     //若重载（？）了抽象类的构造方法,且没有AbstractAnimal()，子类中必须继承相同类型的构造方法
                                            //抽象类的构造方法默认类型为abstract
    public void sleep(){
        System.out.println("动物睡觉");
    }
}
class DogOnAbtract extends AbstractAnimal{
    public void eat(){
        System.out.println("狗狗吃饭！！！");
    }
    public void sleep(){
        System.out.println("狗狗睡觉！！！");
    }
}
class CatOnAbstract extends AbstractAnimal{

    @Override
    public void eat() {
        System.out.println("猫猫吃饭！！！");
    }
}
public class AbstractTest1 {
    public static void main(String[] args){
        AbstractAnimal animal = new DogOnAbtract();
        animal.age = 2;
        System.out.println(animal.age);
        animal.eat();
        animal.sleep();
        DogOnAbtract dog = new DogOnAbtract();
        dog.age = 3;
        System.out.println(dog.age);
        dog.eat();
        dog.sleep();
        AbstractAnimal cat = new CatOnAbstract();
        cat.age = 4;
        System.out.println(cat.age);
        cat.eat();
        cat.sleep();

    }

}
