package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

import static Sort.HeapSort.shift;
import static Sort.HeapSort.swap;
import static jdk.nashorn.internal.runtime.ListAdapter.create;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-12
 * Time: 13:51
 */
public class paixu1 {
    public  static  void quickSort (int [] arr) {
        quickSortHelp(arr,0,arr.length-1);
    }

    private static void quickSortHelp(int[] arr, int left, int right) {
        if (left>= right) {
            return;
        }
        int index = partition(arr,left,right);
        quickSortHelp(arr,left,index-1);
        quickSortHelp(arr,index+1,right);

    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int base = arr[right];
        while(i<j) {
            while(i<j && arr[i] <=base ) {
                i++;
            }
            while (i<j && arr[j] >= base) {
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,i,right);
        return  i;
    }


    public  static  void heap ( int [] arr) {
        create1(arr);
        for (int i =0;i<arr.length-1;i++) {
            swap(arr,0,arr.length-i-1);
            shift1(arr,arr.length-1-i,0);
        }
    }

    private static void create1(int[] arr) {
        for (int i = (arr.length-1-1)/2;i>=0;i--) {
            shift1(arr,arr.length,i);
        }
    }

    private static void shift1(int[] arr, int length, int index) {
        int parent = index;
        int child = 2*parent +1;
        while (child<length) {
            while (child+1<length && arr[child+1] > arr[child]) {
                child = child+1;
            }
            if (arr[child] > arr[parent]) {
                swap(arr,child,parent);
            }else{
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }

    }

    public static void main(String[] args) {
        int [] arr = {44,6,7,3,5,3,12,8,9};
        //quickSort(arr);
        heap(arr);
        System.out.println(Arrays.toString(arr));

}
}
