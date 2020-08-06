package Sort;

import java.util.Arrays;
//时间复杂度o(n^2)
//空间复杂度 0(1)
public class insertSort {
    public static  void insertsort (int [] arr) {
        for (int bound=1;bound<arr.length;bound++) {
            int v = arr[bound];//
            int cur = bound-1;
            for (;cur>=0;cur--) {
                if (arr[cur]>v) {
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] = v;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,8,5,4,1,9};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
