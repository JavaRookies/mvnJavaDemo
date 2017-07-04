package nuist.dymvn.ExtendsTest;

/**
 * Created by dy on 2017/6/29.
 * 子类继承父类，使用“向上转型”时，Animal cat1 = new Cat();  cat1只能不可调用子类Cat中的新方法（只能调用子类中重写的方法）；
 * 不可以 Cat cat1 = new Animal();
 *
 */
public class Cat extends Animal {
    public Cat(){

    }
    public Cat(String name, int age, String color){
        setName(name);
        setAge(age);
        setColor(color);
    }
    public void eat(){
        System.out.println("I am a cat, " + super.getName() + ",i can eat.");
    }

    public void playGame(){
        System.out.println("I am " +super.getName()+",i can play games. ");
    }

    public static void main(String args[]){
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setColor("white");
        cat.setAge(1);
        cat.eat();
        cat.playGame();
        Animal cat1 = new Cat();
        cat1.eat();
    }
}
