package nuist.algorithms;

/**
 * Created by dy on 2017/8/3.
 */
public class SortTest {
    public static void main(String[] args){
        int array[] = {6,5,3,1,8,7,2,4,4,8,1};
        array = cocktailSort(array);

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
    插入排序
     */
    private static int[] insertSort(int[] array) {
        int n = array.length;
        int i,j,get;
        for (i = 1;i<n;i++) {
            get = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > get) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = get;
        }
        return array;
    }

    /*
    选择排序
     */
    private static int[] selectSort(int[] array) {
        int n = array.length;
        int min,j,i;
        for (i=0;i<n-1;i++){
            min = i;
            for (j=i+1;j<n;j++){
                if (array[min]>array[j])
                    min = j;
            }
            if (min != i){
                exchange(array,min,i);
            }
        }
        return array;
    }


    /*
    冒泡排序
     */
    private static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i=0;i<n;i++){
            for (int j=1; j<n-i-1;j++){
                if (array[j]<array[j+1])          //判断标准，改变排序方式
                    exchange(array,j,j+1);
            }
        }
        return array;
    }


    /*
    鸡尾酒排序
     */
    private static int[] cocktailSort(int[] array) {
        int n = array.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            for (int i=right;i>left;i--){
                if (array[i]>array[i-1])
                    exchange(array,i,i-1);
            }
            right--;
            for (int i=left;i<right;i++){
                if (array[i]<array[i+1])
                    exchange(array,i,i+1);
            }
            left++;
        }

        return array;
    }





}
