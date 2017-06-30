package nuist.dymvn.ExtendsTest;

/**
 * Created by dy on 2017/6/29.
 */
public class Animal {
    private String  name;
    private int age;
    private String color;

    public Animal(){

    }
    public Animal(String name,int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void eat(){
        System.out.println("I am " + name + ",i can eat.");
    }

    public int getAge() {
        return age;
    }

    public Animal setAge(int age) {
        this.age = age;
        return this;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Animal setColor(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return color;
    }
}
