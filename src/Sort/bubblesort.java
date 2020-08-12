package Sort;

import org.jcp.xml.dsig.internal.dom.DOMReference;

import java.util.Arrays;

import static Sort.HeapSort.swap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-11
 * Time: 23:38
 */
public class bubblesort {//比较相邻的元素 如果第一个比第二个大就交换
    public  static  void bubbleSort (int [] arr) {
      for (int i = 0;i<arr.length;i++) {
          for (int j =0;j<arr.length-1-i;j++) {
              if (arr[j] <arr[j+1] ) {
                  swap(arr,j,j+1);
              }
          }
      }
    }
    public static  void bubble (int [] arr) {
        for (int i =0;i<arr.length;i++) {
            for (int j =0;j<arr.length-i-1;j++) {
                if (arr[j] <arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public  static  void maopao (int [] arr) {
        for (int i =0 ;i<arr.length;i++) {
            for (int j =0; j<arr.length-1-i;j++) {//有序区间增长
                if (arr[j] >arr[j+1]){
                    swap(arr,j,j+1);
                }

            }
        }
    }
    public  static  void maopao1 ( int[] arr) {
        for (int i =0;i<arr.length;i++) {
            for (int j =0; j < arr.length-1-i;j++) {
                if (arr[j] > arr[j+1] ) {
                    int tmp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,1,9,6,5,8,3,3,77};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        maopao1(arr);
        System.out.println(Arrays.toString(arr));


    }

}
