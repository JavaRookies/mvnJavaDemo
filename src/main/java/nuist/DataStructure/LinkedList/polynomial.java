package nuist.DataStructure.LinkedList;

/**
 * Created by dy on 2017/7/20.
 * 使用链表进行多项式运算，
 * 在链表中加入头指针和当前指针项
 */
public class polynomial {
    /*
    **创建子节点类
     */
    static class PloyNode {

        double coef;
        int ex;
        PloyNode next;

        public PloyNode getNext() {
            return next;
        }

        public PloyNode setNext(PloyNode next) {
            this.next = next;
            return this;
        }


        public double getCoef() {
            return coef;
        }

        public PloyNode setCoef(double coef) {
            this.coef = coef;
            return this;
        }

        public int getEx() {
            return ex;
        }

        public PloyNode setEx(int ex) {
            this.ex = ex;
            return this;
        }

        public PloyNode(){
        }

        public PloyNode(double coef, int ex){
            this.coef = coef;
            this.ex = ex;
        }
    }

    /**
    *多项式的类（链表结构实现）
     * 头结点、当前节点、大小
    **/
    static class PloyList{
        PloyNode head;
        PloyNode current;
        int size;
        public PloyList(){
            this.head = new PloyNode();
            current = head;
            current.next = null;            //创建一个空链表，只有头指针
        }
        void addPloyNode (PloyNode node){
            this.current.next = node;
            this.current = this.current.next;    //添加完成后自动移位至新节点下
            size++;
        }

        void playList(){
            this.current = head.next;
            StringBuilder ployNormial = new StringBuilder();
            while(!(this.current==null))
            {
                ployNormial.append(this.current.getCoef() + "x^" +this.current.getEx() + "+");
                this.current = this.current.next;
            }
            ployNormial.delete(ployNormial.length()-1,ployNormial.length());
            System.out.println(ployNormial.toString());
        }
    }


    //实现多项式相加
    static PloyList sumPloyNorminal(PloyList ployNorm1,PloyList ployNorm2){
        PloyList sumPloyList = new PloyList();
        ployNorm1.current = ployNorm1.head;
        ployNorm2.current = ployNorm2.head;
        while(!(ployNorm1.current.next == null) && !(ployNorm2.current.next==null)){     //两个多项式都不为空时,若第一个为空时，即结束循环
            if(ployNorm1.current.next.ex < ployNorm2.current.next.ex){           //第一个多项式的幂小，则将第一个多项式的当前节点放在sum中
                PloyNode nodeTemp = new PloyNode(ployNorm1.current.next.coef,ployNorm1.current.next.ex);
                sumPloyList.addPloyNode(nodeTemp);
                ployNorm1.current = ployNorm1.current.next;
            }else if (ployNorm1.current.next.ex > ployNorm2.current.next.ex){
                PloyNode nodeTemp = new PloyNode(ployNorm2.current.next.coef,ployNorm2.current.next.ex);
                sumPloyList.addPloyNode(nodeTemp);
                ployNorm2.current = ployNorm2.current.next;
            }else {
                PloyNode nodeTemp = new PloyNode(ployNorm1.current.next.coef+ployNorm2.current.next.coef,ployNorm1.current.next.ex);
                sumPloyList.addPloyNode(nodeTemp);           //这一步已经把current指针移动到下一位了
                ployNorm1.current = ployNorm1.current.next;
                ployNorm2.current = ployNorm2.current.next;
            }
        }
        while(!(ployNorm1.current.next == null)){
            sumPloyList.addPloyNode(ployNorm1.current);
        }
        while(!(ployNorm2.current.next == null)){
            sumPloyList.addPloyNode(ployNorm2.current);
        }
        return sumPloyList;
    }
    public static void main(String[] args){
        PloyNode node11 = new PloyNode(2,2);
        PloyNode node12 = new PloyNode(100,3);
        PloyNode node13 = new PloyNode(45,5);
        PloyNode node14 = new PloyNode(3,20);

        PloyNode node21 = new PloyNode(8,2);
        PloyNode node22 = new PloyNode(7,3);
        PloyNode node23 = new PloyNode(4,4);
        PloyNode node24 = new PloyNode(6,18);
        PloyNode node25 = new PloyNode(7,20);

        PloyList list1 = new PloyList();
        PloyList list2 = new PloyList();

        list1.addPloyNode(node11);
        list1.addPloyNode(node12);
        list1.addPloyNode(node13);
        list1.addPloyNode(node14);

        list2.addPloyNode(node21);
        list2.addPloyNode(node22);
        list2.addPloyNode(node23);
        list2.addPloyNode(node24);
        list2.addPloyNode(node25);

        PloyList sumLis = sumPloyNorminal(list1,list2);
        sumLis.playList();


    }




}
