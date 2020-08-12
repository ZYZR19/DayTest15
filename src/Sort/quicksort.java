package Sort;

import java.util.Arrays;

import static Sort.HeapSort.swap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-11
 * Time: 23:21
 */
public class quicksort {
   /* public static  void quickSort(int [] arr) {
        quickSorthelper (arr,0,arr.length-1);
        
    }

    private static void quickSorthelper(int[] arr, int left, int right) {
        if (left>=right) {
            return;
        }
        int index = partition(arr,left,right);
        quickSorthelper(arr,left,index-1);
        quickSorthelper(arr,index+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j  = right;
        int base = arr[right];
        while(i<j) {
            while (i<j &&arr[j]>=base) {
                j--;
            }
            while (i<j&& arr[i] <= base) {
                i++;
            }
            swap(arr,i,j);

        }
        swap(arr,i,right);
        return i;
    }*/

    public static void main(String[] args) {
        int [] arr = {2,1,9,6,5,8,3,3,77};
        quicksort1(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] array) {
        quickSortInternal(array, 0, array.length - 1); }

// [left, right] 为待排序区间
private static void quickSortInternal(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        if (left > right) {
            return;     }
        // 最简单的选择基准值的方式，选择 array[left] 作为基准值
    // pivotIndex 代表基准值最终停留的下标
    int pivotIndex = partition(array, left, right);
        // [left, pivotIndex - 1] 都是小于等于基准值的
    // [pivotIndex + 1, right] 都是大于等于基准值的
    quickSortInternal(array, left, pivotIndex - 1);
    quickSortInternal(array, pivotIndex + 1, right);
    }
    private static int partition(int[] array, int left, int right) {
        int i = left;     int j = right;
        int pivot = array[right];
        while (i < j) {
            while (i < j && array[i] >= pivot) {
            i++;
        }
            while (i < j && array[j] <= pivot) {
                j--;
            }

            swap(array, i, j);
        }
        swap(array, i, right);
        return i;
    }




    public static void kuaisu(int[] arr) {
        kuaisuhelp(arr,0,arr.length-1);
    }

    private static void kuaisuhelp(int[] arr, int left, int right) {
        if (left>=right) {
            return;
        }
        int index = patition(arr,left,right);
        kuaisuhelp(arr,left,index-1);
        kuaisuhelp(arr,index+1,right);
    }

    private static int patition(int[] arr, int left, int right) {
            int i = left;
            int j = right;
            int base = arr[right];
            while(i<j) {
                while(i<j&&arr[i]<=base) {
                    i++;
                }
                while(i<j && arr[j] >=base) {
                    j--;
                }
                swap(arr,i,j);
            }
            swap(arr,i,right);
            return  i;
    }


    public static  void kuaisu1 (int[] arr) {
        kuaisu1help(arr,0,arr.length-1);
    }

    private static void kuaisu1help(int[] arr, int left, int right) {
        if (left >=right) {
            return;
        }
        int index = patition1(arr,left,right);
        kuaisu1help(arr,left,index-1);
        kuaisu1help(arr,index+1,right);
    }

    private static int patition1(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int base = arr[right];
        while(i<j) {
            while(i<j && arr[i]<=base) {
                i++;
            }
            while(i<j && arr[j]>=base) {
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,i,right);
        return i;
    }




    public static  void quicksort1(int [] arr) {
        quickSorthelp(arr,0,arr.length-1);
    }

    private static void quickSorthelp(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int index = partiton(arr,left,right);
        quickSorthelp(arr,left,index-1);
        quickSorthelp(arr,index+1,right);
    }

    private static int partiton(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int base = arr[right];
        while(i<j) {
            while(i<j&&arr[i]<=base) {
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


}
