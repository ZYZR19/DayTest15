package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

//堆排序
public class HeapSort {
 //1.把数组建立成一个小堆 取最小值放到另一个数组 尾插到新的数组中 需要额外的空间
    //2.建立大堆 把堆顶元素和堆的最后一个元素互换 并在堆中删除这个元素,再从堆顶进行向下调整
    //堆是由数组的形式体现出来 如果是大堆排序完就是一个从小到大的数组 堆顶元素和堆的最后一个元素互换 就是为了把大的排序好
    //保证大的元素就一直在堆的末尾
    public static  void HeapSort (int [] arr) {
        CreateHeap (arr);//用数组去建立一个大堆
        for(int i =0;i<arr.length-1;i++) {
            swap(arr,0,arr.length-i-1);//交换堆顶 和堆的最后一个元素
            shiftdown(arr,arr.length-i-1,0);//向下调整
        }
    }
    public  static  void heap(int[] arr) {
        createheap(arr) ;
        for (int i =0; i<arr.length-1;i++) {
            swap(arr,0,arr.length-1-i);
            shiftdown(arr,arr.length-1-i,0);
        }
    }

    private static void shiftdown(int[] arr, int heaplength, int index) {
         int parent = index;
         int child = 2*parent +1;
         while (child < heaplength){
             if (child + 1 < heaplength && arr[child+1]>arr[child]) {
                 child = child +1;
             }
             if (arr[child] > arr[parent]) {
                 swap(arr,child,parent);
             }else{
                 break;
             }
             parent = child;
             child = 2*parent+1;

    }
    }
    public static  void shift(int[] arr,int heaplength,int index) {
        int parent = index;
        int child = 2*parent +1;
        while (child<heaplength) {
            if (child + 1<heaplength&&arr[child+1] > arr[child]) {
                child = child+1;
            }
            if (arr[child] > arr[parent]) {
                swap(arr,child,parent);
            }else{
                break;
            }
            parent = child;
            child = 2* parent+1;
        }
    }


    public static void swap(int[] arr, int child, int parent) {
        int tmp = arr[child];
        arr[child] = arr[parent];
        arr[parent] = tmp;
    }


    private static void CreateHeap(int[] arr) {
         for (int i =(arr.length-1-1)/2;i>=0;i--) {
             shiftdown(arr,arr.length,i);
         }
    }
    private static  void createheap(int[] arr) {
        for (int i = (arr.length-1-1)/2;i>=0;i++) {
            shiftdown(arr,arr.length,i);
        }
     }

    public static void main(String[] args){
        int [] arr = {2,1,9,6,5,8,3,3,77};
        heapsort1(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static  void heapsort1 (int [] arr) {
        createheap1(arr);
        for (int i =0;i<arr.length-1;i++) {
            swap(arr,arr.length-i-1,0);
            shiftdown(arr,arr.length-i-1,0);
        }

    }

    private static void createheap1(int[] arr) {
        for (int i = (arr.length-1-1)/2;i>=0;i--) {
            shiftdown1(arr,arr.length,i);
        }
    }

    private static void shiftdown1(int[] arr, int length, int index) {
        int parent = index;
        int child = 2*parent+1;
        while (child<length) {
            if (child+1 <length && arr[child+1]>arr[child]) {
                child =child+1;
            }
            if (arr[child]>arr[parent]) {
                swap(arr,child,parent);
            }else{
                break;
            }
            parent = child;
            child = 2*parent+1;
        }

    }

}
