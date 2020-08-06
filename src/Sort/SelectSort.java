package Sort;

import java.util.Arrays;
//选择排序的
public class SelectSort {
    public static void slectSort (int [] arr) {
        for (int bound = 0; bound<arr.length;bound++) {
            for (int cur = bound+1;cur<arr.length;cur++) {
                if (arr[cur]<arr[bound]) {
                    int tmp = arr[cur];
                    arr[cur] = arr[bound];
                    arr[bound] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,8,5,4,1,9};
        slectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
