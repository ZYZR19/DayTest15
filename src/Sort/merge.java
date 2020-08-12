package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-11
 * Time: 23:56
 */
public class merge {
    public static void merge(int[] arr, int low, int mid, int heigh) {
        int[] output = new int[heigh - low];
        int outputindex = 0;
        int cur1 = low;
        int cur2 = heigh;
        while (cur1 < mid && cur2 < heigh) {
            if (arr[cur1] <= arr[cur2]) {
                output[outputindex] = arr[cur1];
                outputindex++;
                cur1++;
            } else {
                output[outputindex] = arr[cur2];
                outputindex++;
                cur2++;
            }
        }
        while (cur1 < mid) {
            output[outputindex] = arr[cur1];
            outputindex++;
            cur1++;
        }
        while (cur2 < heigh) {
            output[outputindex] = arr[cur2];
            outputindex++;
            cur2++;
        }
        for (int i = 0; i < heigh - low; i++) {
            arr[low + i] = output[i];
        }
    }

    public static void mergeSort(int[] arr) {
        mergesortHelper(arr, 0, arr.length);
    }

    private static void mergesortHelper(int[] arr, int low, int high) {
        if (high - low <= 1) {
            return;
        }
        int mid = (low + high) / 2;
        mergesortHelper(arr, low, mid);
        mergesortHelper(arr, mid, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int [] arr = {2,1,9,6,5,8,3,3,77};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}




