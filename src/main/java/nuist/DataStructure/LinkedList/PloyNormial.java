package nuist.DataStructure.LinkedList;

/**
 * Created by dy on 2017/7/21.
 * 使用基础链表进行多项式的相加运算
 * 注意：1、链表操作要注意当前指针的移动，否则如果添加子节点时，会将原链表中后面的节点都删掉；
 *      2、链表的next，是下一个结点对象的地址
 */
public class PloyNormial {
    static class ListNode{
        double coef;
        int ex;
        ListNode next;

        public ListNode(){
            this(0,0);
        }

        public ListNode(double coef, int ex){
            this.coef = coef;
            this.ex = ex;
            next = null;
        }
        public double getCoef() {
            return coef;
        }

        public ListNode setCoef(double coef) {
            this.coef = coef;
            return this;
        }

        public int getEx() {
            return ex;
        }

        public ListNode setEx(int ex) {
            this.ex = ex;
            return this;
        }

        public ListNode setNext(ListNode next) {
            this.next = next;
            return this;
        }

        public void appendNode(ListNode node){
            ListNode listNodeTemp = this;
            while (listNodeTemp.next !=null){
                listNodeTemp = listNodeTemp.next;
            }
            listNodeTemp.next = node;
        }

        void playList(){
            StringBuilder ployNormial = new StringBuilder();
            ListNode node = this;
            while(node != null)
            {
                ployNormial.append(node.getCoef() + "x^" +node.getEx() + "+");
                node = node.next;
            }
            ployNormial.delete(ployNormial.length()-1,ployNormial.length());
            System.out.println(ployNormial.toString());
        }
    }

    public int compareEx(int ex1, int ex2){
        if(ex1<ex2) return -1;
        else if (ex1==ex2) return 0;
        else return 1;
    }

    public ListNode sumPloy(ListNode ploy1, ListNode ploy2){
        ListNode sumPloy = new ListNode();
        while(ploy1 !=null && ploy2 !=null){
            switch (compareEx(ploy1.ex,ploy2.ex)){
                case -1:
                    sumPloy.appendNode(new ListNode(ploy1.coef,ploy1.ex));
                    ploy1 = ploy1.next;
                    break;
                case 0:
                    sumPloy.appendNode(new ListNode(ploy1.coef+ploy2.coef,ploy1.ex));
                    ploy1 = ploy1.next;
                    ploy2 = ploy2.next;
                    break;
                case 1:
                    sumPloy.appendNode(new ListNode(ploy2.coef,ploy2.ex));
                    ploy2 = ploy2.next;
                    break;
            }
        }
        while(ploy1 != null){
            sumPloy.appendNode(new ListNode(ploy1.coef,ploy1.ex));
            ploy1 = ploy1.next;
        }
        while (ploy2 != null){
            sumPloy.appendNode(new ListNode(ploy2.coef,ploy2.ex));
            ploy2 = ploy2.next;
        }
        return sumPloy;
    }

    public static void main(String[] args) {
        ListNode node11 = new ListNode(2, 2);
        ListNode node12 = new ListNode(100, 3);
        ListNode node13 = new ListNode(45, 5);
        ListNode node14 = new ListNode(3, 20);

        ListNode node21 = new ListNode(8, 2);
        ListNode node22 = new ListNode(7, 3);
        ListNode node23 = new ListNode(4, 4);
        ListNode node24 = new ListNode(6, 18);
        ListNode node25 = new ListNode(7, 20);

        node11.appendNode(node12);
        node11.appendNode(node13);
       // node11.appendNode(node14);

        node21.appendNode(node22);
        node21.appendNode(node23);
        node21.appendNode(node24);
        node21.appendNode(node25);

        PloyNormial sumLis = new PloyNormial();
        ListNode sumNode = sumLis.sumPloy(node11, node21);
        sumNode.playList();
    }
}
