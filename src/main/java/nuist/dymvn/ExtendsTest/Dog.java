package nuist.dymvn.ExtendsTest;

/**
 * Created by dy on 2017/6/29.
 */
public class Dog extends Animal{
    public Dog(){

    }
    public Dog(String name, int age, String color){
        setName(name);
        setAge(age);
        setColor(color);
    }

    public void watchDoor(){
        System.out.println("I am " +super.getName()+",i can watch doors. ");
    }

    public static void main(String args[]){
        Dog dog = new Dog("Boby",2,"black");
        dog.eat();
        dog.watchDoor();
    }
}
