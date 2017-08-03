package nuist.algorithms;

/**
 * Created by dy on 2017/8/2.
 */
public class Sort {
    public static void main(String[] args){
        int array[] = {6,5,3,1,8,7,2,4,4,8,1};
        array = bubbleSort(array);

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    /*
    交换数组元素
     */
   static void exchange(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /*
    冒泡排序    时间O(n^2)    空间O(1)  稳定
      */
    static int[] bubbleSort(int[] originArray){

        int n = originArray.length;
        for (int j=0;j<n;j++){                       //一共运行n次，每次大的元素浮到后面
            for(int i=0;i<n-1-j;i++){
                if (originArray[i]>originArray[i+1]){       //比较两个邻近元素，将大的元素放在后面
                    exchange(originArray,i,i+1);
                }
            }
        }
        return originArray;
    }
    /*
    鸡尾酒排序（冒泡改进）   时间O(n^2)    空间O(1)  稳定
     */
    static int[] cocktailSort(int[] originArray){
        int n = originArray.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            for (int i=left;i<right;i++){              //前半轮，将最大元素放在后面
                if (originArray[i]>originArray[i+1])
                    exchange(originArray,i,i+1);
            }
            right--;
            for (int i=right;i>left;i--){               //后半轮，将最小元素放在前面
                if (originArray[i]<originArray[i-1])
                    exchange(originArray,i,i-1);
            }
            left++;
        }
        return originArray;
    }

    /*
    选择排序  时间O（n^2）  空间O(1)   不稳定
     */
    static int[] selectSort(int[] originArray){
        int n = originArray.length;
        int min;
        for (int i = 0;i<n-1;i++)          //从已排序号的下一位开始
        {
            min = i;                        //计开始的序号为最小值（未排序的第一位）
            for (int j = i+1;j<n;j++){              //依次找出未排序的最小值
                if (originArray[j]<originArray[min])
                    min = j;
            }
            if (min != i)                            //如果最小值序号不是未排序号的第一位，就替换两个序号的值
                exchange(originArray,min,i);
        }
        return originArray;
    }

    /*
    插入排序   时间O（n^2）  空间O(1)    稳定
     */
    static int[] insertSort(int[] originArray){
        int n = originArray.length;
        int i,j,get;
        for (i = 1;i < n;i++){
            get = originArray[i];
            j = i-1;                                     //j是排好序的手牌的最后一张
            while(j>=0 && originArray[j]>get){
                originArray[j+1] = originArray[j];        //如果该手牌比抓到的牌大，就将其右移
                j--;
            }
            originArray[j+1] = get;          //知道该手牌比抓到的牌小（等于），把抓到牌查到其右边
        }
        return originArray;
    }
}
