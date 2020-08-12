package Sort;

import java.util.Arrays;
//时间复杂度o(n^2)
//空间复杂度 0(1)
public class insertSort {
    public static  void insertsort (int [] arr) {
        for (int bound=1;bound<arr.length;bound++) {
            int v = arr[bound];//无序区间的第一个数
            int cur = bound-1;
            for (;cur>=0;cur--) {//遍历已经排好的区间看是否有
                if (arr[cur]>v) {
                    arr[cur+1] = arr[cur];//如果后面一个cur+1=v小于cur
                    // cur+1就是bound里面的值
                    //cur就和cur+1交换把小的换到前面
                }else{
                    break;
                }
            }
            arr[cur+1] = v;//如果不小于的话 就把写回给cur+1
        }
    }
    public static  void inser (int [] arr) {
        for ( int bound =1;bound<arr.length;bound++) {
           int v = arr[bound];
           int cur = bound -1;
           for (;cur>=0;cur--) {
               if (arr[cur] > v) {
                   arr[cur+1] = arr[cur];
               }else{
                   break;
               }

           }
           arr[cur+1] =v;

        }

    }
    public  static void charu(int [] arr) {
        for (int bound = 1 ; bound <arr.length;bound++) {
            int v = arr[bound] ;//待排序区间的第一个元素
            int cur = bound -1;//排序区间的最后一个元素
            for (;cur>=0;cur--) {
                if (arr[cur] > v) {
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] = v;


        }
    }
    public static  void insert (int [] arr) {
        for (int bound =1;bound<arr.length;bound++){
            int v = arr[bound];
            int cur = bound -1;
            for (;cur>=0;cur--) {
                if (arr[cur] > v) {
                    arr[cur+1] = arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1] =v;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,8,5,4,1,9};
        charu(arr);
        System.out.println(Arrays.toString(arr));
    }
}
