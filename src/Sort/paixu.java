package Sort;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

import static Sort.HeapSort.shift;
import static Sort.HeapSort.swap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-12
 * Time: 2:13
 */
public class paixu {
    public static void maopao (int [] arr) {//相邻元素进行比较 交换
        for (int i =0; i<arr.length;i++) {
            for (int j =0;j <arr.length-1-i;j++) {
                if (arr[j] <arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static  void xuanze( int[] arr) {//选择排序就是打擂台
        for (int bound =0;bound<arr.length;bound++) {
            for (int cur = bound+1;cur<arr.length;cur++) {
                if (arr[cur]<arr[bound] ) {
                    swap(arr,cur,bound);
                }
            }
        }
    }
    public  static  void charu (int[] arr) {//在排好的区间选择合适的位置插入
        for (int bound =1;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound -1;
            for (;cur>=0;cur--) {
                if (v >arr[cur]) {
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] = v;
        }
    }

    public static  void maopao1(int [] arr) {
        for (int i =0;i<arr.length;i++) {
            for (int j =0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static  void xuanze1(int [] arr) {
        for (int bound =0;bound<arr.length;bound++) {
            for (int cur=bound+1;cur<arr.length;cur++) {
                if (arr[bound]>arr[cur]){
                    swap(arr,bound,cur);
                }
            }
        }
    }
    public  static  void charu1(int[] arr) {
        for (int bound =1;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound -1;
            for (;cur>=0;cur--) {
                if (v < arr[cur])  {
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] = v;
        }
    }

    public static  void  quickSort (int[] arr) {
        quickSortHelper(arr,0,arr.length-1);
    }

    private static void quickSortHelper(int[] arr, int left, int right) {
        if (left>=right) {
            return;
        }
        int index = partition(arr,left,right);
        quickSortHelper(arr,left,index-1);
        quickSortHelper(arr,index+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left ;
        int j = right;
        int base = arr[right];
        while(i<j) {
            while (i<j&&arr[i]<=base){
                i++;
            }
            while(i<j && arr[j] >=base) {
                j--;
            }
            swap(arr,i,j);
         }
        swap(arr,i,right);
        return i;
    }
    public static  void duipaixu(int[] arr) {
        createheap(arr);
        for (int i =0;i<arr.length-1;i++) {
            swap(arr,arr.length-1-i,0);
            shiftdown(arr,arr.length-i-1,0);
        }
    }

    private static void createheap(int[] arr) {
        for (int i  = (arr.length-1-1)/2;i>=0;i--) {
            shiftdown(arr,arr.length,i);
        }
    }

    private static void shiftdown(int[] arr, int length, int index) {
        int parent = index;
        int child = 2*parent+1;
        while (child<length) {
            if (child+1<length && arr[child+1] > arr[child]) {
                child = child+1;
            }
            if (arr[child] >arr[parent]) {
                swap(arr,child,parent);
            }else{
                break;
            }
            parent = child;
            child = 2*parent +1;
        }
    }

    public static  void xierpaixu(int [] arr) {
        int gap = arr.length/2;
        while (gap>1) {
            xiersort(arr,gap);
            gap = gap/2;
        }
        xiersort(arr,gap);
    }

    private static void xiersort(int[] arr, int gap) {
        for (int bound = gap;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound -gap;
            for (;cur>=0;cur-=gap) {
                if (arr[cur] > v) {
                    arr[cur+gap] = arr[cur];
                }else {
                    break;
                }
            }
            arr[cur+gap] = v;
        }
    }

    public static void main(String[] args) {
        int [] arr = {44,6,7,3,5,3,12,8,9};
       /* maopao1(arr);
        System.out.println(Arrays.toString(arr));
        xuanze1 (arr);
        System.out.println(Arrays.toString(arr));
        charu1(arr);
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));*/
       // duipaixu(arr);
        xierpaixu(arr);
        System.out.println(Arrays.toString(arr));





    }
}
