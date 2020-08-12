package Sort;

import java.util.Arrays;
//时间复杂度最快0(n^1.3)  一般就是on方  空间复杂o1 是不稳定排序
public class ShellSort {
    public static void shellSort (int [] arr) {
        int gap = arr.length/2;
        while(gap>1) {
            insertSortGap(arr,gap) ;
            gap=gap/2;
        }
        insertSortGap(arr,1);
    }

    private static void insertSortGap(int[] arr,int gap) {
        for (int bound = gap;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound - gap;
            for (;cur>=0;cur-=gap) {
                if (arr[cur] >v) {
                    arr[cur+gap] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap] =v;
        }
     }
     public static  void xier(int[] arr) {
        int gap = arr.length/2;
        while(gap>1){
            xierSort(arr,gap);
            gap = gap/2;
        }
        xierSort(arr,gap);
     }

    private static void xierSort(int[] arr, int gap) {
        for (int bound = gap;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound-gap;
            for (;cur>=0;cur-=gap) {
                if (arr[cur] >v ) {
                    arr[cur+gap] = arr[cur];
                }else{
                    break;
                }
             }
            arr[cur+gap] = v;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,3,6,2,8,5,4,1,9};
        xier(arr);
        System.out.println(Arrays.toString(arr));
    }
}
