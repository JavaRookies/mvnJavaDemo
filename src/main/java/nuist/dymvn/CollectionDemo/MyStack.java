package nuist.dymvn.CollectionDemo;

import java.util.LinkedList;

/**
 * Created by dy on 2017/7/25.
 * 使用LinkedList模拟栈的存储功能
 */
public class MyStack {
    private LinkedList linkedList;
    public MyStack(){
        linkedList = new LinkedList();
    }
    public void add(Object glist){
        linkedList.addFirst(glist);
    }
    public Object get(){
        return linkedList.removeFirst();
    }

    public static void main(String[] args){

    }
}
