package nuist.dymvn.ObjectDemo;

/**
 * Created by dy on 2017/7/8.
 * Object类联系
 * 1、直接输出的实例化对象，和实例化的toString()一样，重写后，按照重写后的输出；
 * 2、Object类的原始方法是比较两个对象的地址值（类似“==”号）；
 * 3、引用类型地址值相同，其对应的对象也相同，一变俱变（不同于clone）
 */
public class ToStringTest {
    public static void main(String[] args){
        int age = 18;
        String name = "菜鸟";
        StudentObject stu = new StudentObject(age,name);
        // System.out.println(stu.toString());                     //Student{age=18, name='菜鸟'}
        System.out.println(stu.hashCode());                     //1625635731
        //System.out.println(stu.getClass());                      //class nuist.dymvn.ObjectDemo.StudentObject
        //System.out.println(stu);                                //Student{age=18, name='菜鸟'}
        StudentObject stu1 = new StudentObject(age,name);
        System.out.println(stu.equals(stu1));                   //
        System.out.println(stu == stu1);
        StudentObject stu3 = stu;
        System.out.println(stu.equals(stu3));
        stu3.setAge(17);
        System.out.println(stu.equals(stu3));
        System.out.println(stu.age == stu3.age);                    //引用类型地址值相同，其对应的对象也相同，一变俱变（不同于clone）

        StudentObject stu2 = stu.clone();
        stu2.setAge(16);
        System.out.println(stu2.age + stu.age);                    //clone方法，不同于地址值赋值，自身改变不会影响原有的对象

        Object obj = stu.clone();
        StudentObject stu4 = (StudentObject)obj;
        System.out.println(stu4.age);


    }
}
class StudentObject{
    public int age;
    public String name;
    public StudentObject(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public StudentObject setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentObject setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
//    public boolean equals(Object obj){
//        if (obj == null)
//            return false;
//        if (obj == this)
//            return true;
//        if (! (obj instanceof StudentObject))
//            return false;
//
//        StudentObject studentObject = (StudentObject) obj;
//        return studentObject.age == this.age && studentObject.name == this.name;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentObject)) return false;

        StudentObject that = (StudentObject) o;

        if (age != that.age) return false;
        return name.equals(that.name);

    }
    public StudentObject clone(){
        int age = this.age;
        String name = this.name;
        StudentObject studentObject = new StudentObject(age,name);
        return studentObject;
    }


//    @Override
//    public int hashCode() {
//        int result = age;
//        result = 31 * result + name.hashCode();
//        return result;
//    }
}