package nuist.DataStructure.LinkedList;

/**
 * Created by dy on 2017/7/20.
 */
public class polynomial {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PloyNode)) return false;

            PloyNode ployNode = (PloyNode) o;

            if (Double.compare(ployNode.coef, coef) != 0) return false;
            if (ex != ployNode.ex) return false;
            return next.equals(ployNode.next);
        }

        public PloyNode(){
        }

        public PloyNode(double coef, int ex){
            this.coef = coef;
            this.ex = ex;
        }
        void playNode(){
            System.out.println(this.coef + "x^" + ex);
        }
        PloyNode addNode(PloyNode node){
            if (this.ex == node.ex ){
                this.coef = this.coef + node.coef;
            }
            return this;
        }
    }

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
           // this.current.next = null;
            this.current = this.current.next;
            size++;
        }
        void addPloyList (PloyList list){    //将list的当前指针开始的所有子节点依此加在最后面
            this.current.next = list.current;
            this.size = this.size + list.size;
        }

        int getSize(){
            return size;
        }
        void playList(){
            this.current = head.next;
            while(!(this.current==null))
            {
                System.out.print(this.current.getCoef() + "x^" +this.current.getEx() + "+");
                this.current = this.current.next;
            }
            System.out.println();
        }
    }

    static PloyNode addNode(PloyNode node1 ,PloyNode node2){
        if (node1.ex == node2.ex ){
            node1.coef = node1.coef + node2.coef;
        }
        return node1;
    }

    //多项式
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
           // sumPloyList.current = sumPloyList.current.next;               //sum多想是的指针指向下一个空位
        }
        while(!(ployNorm1.current.next == null)){
            PloyList listTemp = new PloyList();
            listTemp.current.next = ployNorm1.current;
            sumPloyList.addPloyList(listTemp);
        }
        while(!(ployNorm2.current.next == null)){
            PloyList listTemp = new PloyList();
            listTemp.current.next = ployNorm2.current;
            sumPloyList.addPloyList(listTemp);
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
