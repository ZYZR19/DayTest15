package Sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-12
 * Time: 15:12
 */
public class haha {
    public  static  void maopao ( int [] arr) {
        for (int i =0;i<arr.length;i++) {
            for (int j = 0;j<arr.length-1-i;j++) {
                if (arr[j] >arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public  static  void xuanze( int [] arr) {
        for (int bound = 0;bound<arr.length;bound++) {
            for (int cur = bound +1;cur<arr.length;cur++) {
                if(arr[cur] < arr[bound]) {
                    int tmp = arr[bound];
                    arr[bound] = arr[cur];
                    arr[cur] = arr[bound];
                }
            }
        }
    }

    public  static  void charu ( int [] arr) {
        for (int bound = 1;bound<arr.length;bound++) {
            int v = arr[bound];
            int cur = bound -1;
            for (;cur>=0;cur--) {
                if (arr[cur] >v) {
                arr[cur+1] = arr[cur];
            }else{
                break;
            }
            }
            arr[cur+1] = v;
        }

    }
    public static void main(String[] args) {
        int [] arr = {44,6,7,3,5,3,12,8,9};
        //quickSort(arr);
        charu(arr);
        System.out.println(Arrays.toString(arr));

    }

}
