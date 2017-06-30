package nuist.dymvn.ExtendsTest;

/**
 * Created by dy on 2017/6/29.
 */
public class Cat extends Animal {
    public Cat(){

    }
    public Cat(String name, int age, String color){
        setName(name);
        setAge(age);
        setColor(color);
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
    }
}
