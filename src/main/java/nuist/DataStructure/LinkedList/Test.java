package nuist.DataStructure.LinkedList;

/**
 * Created by dy on 2017/7/21.
 */
public class Test {
    public int getCoef() {
        return coef;
    }

    public Test setCoef(int coef) {
        this.coef = coef;
        return this;
    }

    int coef;
    int ex;
    public Test(int coef, int ex){
        this.coef = coef;
        this.ex = ex;
    }
    void play(){
        System.out.println("coef="+coef+",ex="+ex);
    }
    public static void main(String[] args) {
        Test test1 = new Test(1,2);
        Test test2 = test1;
        test2.setCoef(2);
        test1.play();

    }
}
