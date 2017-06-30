package nuist.dymvn.ThreadDemo.ThreadDispatch;

/**
 * Created by dy on 2017/6/27.
 * thread obj.wait()方法的使用
 */
public class PrintThread implements Runnable{
    private String name;
    private Object prev;
    private Object self;

    public PrintThread(String name, Object prev, Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    public void run() {
        int count = 10;
        while(count>0){
            synchronized(prev){
                synchronized (self){
                    System.out.println(name);
                    count--;
                    self.notify();       //notify必须在sychronized内部进行
                }
                try{
                    prev.wait();         //wait()必须在sychronized内部进行，且在等待过程中，释放锁
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String args[]){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        PrintThread printThreadA = new PrintThread("a",c,a);
        PrintThread printThreadB = new PrintThread("b",a,b);
        PrintThread printThreadC = new PrintThread("c",b,c);

        new Thread(printThreadA).start();
        new Thread(printThreadB).start();
        new Thread(printThreadC).start();
    }
}
