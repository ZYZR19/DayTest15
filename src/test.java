import java.util.Arrays;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-08-03
 * Time: 8:58
 */
public class test {
    //插入排序 升序排序
    public  static  void insertSort (int [] arr)  {
        //用bound划分区间
        //0--bound已排序 bound到size是待排序
        for (int bound =1 ;bound<arr.length;bound++) {
            int v = arr[bound];//把bound放到一个临时变量里面不会被覆盖
            int cur = bound-1;//已排序区间的最后一个元素下标
            for (;cur>=0;cur--) {
                if (arr[cur]>v) {//排好区间的最后一个元素和待排区间的第一个元素进行比较
                    //如果排好的大于没拍好的就进行搬运 cur-- 要和已排区间的每一个元素进行比较
                    //cur搬运到下一个位置
                    arr[cur+1] = arr[cur];
                }else{
                    //找到合适位置
                    break;
                }
            }
            arr[cur+1] =v;// 如果arr[cur] 没有大于5 ,5在v里面 赋值到对应的位置上
        }
    }





    //希尔排序
    public  static  void shellSort (int arr[] ) {
        int gap = arr.length / 2;
        while (gap > 1) {
            insertSortGap(arr, gap);//循环分组插排
            gap = gap / 2;
        }
        insertSortGap(arr, 1);
    }
        private static void insertSortGap(int[] arr, int gap) {
        //同组进行比较所以要换成gap 把1换成gap
            for (int bound =gap;bound<arr.length;bound++) {
                int v = arr[bound];//把bound放到一个临时变量里面不会被覆盖
                int cur = bound-gap;//这个操作是找同组的上一个元素
                for (;cur>=0;cur-=gap) {
                    if (arr[cur]>v) {//排好区间的最后一个元素和待排区间的第一个元素进行比较
                        //如果排好的大于没拍好的就进行搬运 cur-- 要和已排区间的每一个元素进行比较
                        //cur搬运到下一个位置
                        arr[cur+gap] = arr[cur];
                    }else{
                        //找到合适位置
                        break;
                    }
                }
                arr[cur+gap] =v;// 如果arr[cur] 没有大于5 ,5在v里面 赋值到对应的位置上
            }
        }




        //选择排序
    public  static  void selectSort (int [] arr) {
        for (int bound =0;bound <arr.length;bound++) {
            //进行打雷操作 以bound位置元素作为擂主从待排区间中取出元素与擂主比较
            //成功和擂主交换
            for (int cur = bound+1;cur<arr.length;cur++) {
                if (arr[cur] <arr[bound]) {
                    //打雷成功
                    int tmp = arr[cur];
                    arr[cur] = arr[bound];
                    arr[bound] = tmp;
                }
            }
        }
    }




    //堆排序
    private static  void swap(int[] arr,int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static  void heapSort (int[] arr) {
        //先建立堆
        createHeap(arr);
        //循环把堆顶元素交换到最后 并进行调整堆
        for (int i=0;i<arr.length-1;i++) {//调整到length-1次
            // 还剩下一个数的时候就不用调整了 就是最小的 堆已经有序了
            //交换当前堆顶元素和堆的最后一个元素
           //长度是length-i 堆顶是0  最后一个元素是谁???
            // 因为每次都发生变化 堆在不断缩小
            swap(arr,0,arr.length-1-i);
            //交换完成 堆的长度进一步缩水 现在对的长度 arr.length-i-1
            //数组中[0,arr.length-i-1) 是待排区间
            //[arr.length-i-1,arr.length)是已排序区间\
            //
            //进行向下调整堆
            shiftDown(arr,arr.length-i-1,0);
        }
    }
    private static void createHeap(int[] arr) {
        //从最后一个非叶子节点出发 循环往前找一次进行向下调整
        for (int i = (arr.length-1-1)/2;i>=0;i--) {// 为啥-两次1 length-1是最后一个节点下标
            //再减一除以2 就是最后一个节点的父节点
            shiftDown(arr,arr.length,i);

        }
    }
    private static void shiftDown(int[] arr, int heapLength, int index) {
        //升序排序将建立大堆 找出左右子树中的大值 和根节点比较 如果大然后交换
              int parent = index;
              int child = 2*parent+1;
              while(child<heapLength) {
                  if (child+1<heapLength&&arr[child+1]>arr[child]) {
                      child = child+1;
                  }
                  //条件结束以为着child 已经是左右子树比较大的值的下标
                  if (arr[child] >arr[parent]) {
                      //需要交换两个元素
                      swap(arr,child,parent);
                  }else{
                      break;
                  }
                  parent=child;//递归
                  child=2*parent+1;
              }

    }


    //冒泡排序 每次找最小 从后往前比较交换
  public static void  bubbleSort (int[] array) {
        //按照每次找到最小的方式来进行排序(从后往前比较交换)
      for (int bound=0;bound<array.length;bound++) {
          //[0-bound)已经排序 [bound,size)待排序
      for (int cur = array.length-1;cur>bound;cur--) {
          if (array[cur-1]<array[cur] ) {
              swap(array,cur-1,cur);
          }
      }

      }
  }




  //快速排序
    public static  void  quickSort (int [] arr) {
        quickSortHelper(arr,0,arr.length-1) ;
    }

    private static void quickSortHelper(int[] arr, int left,int right) {
        if (left >= right)  {
            return;//数组为空
        }
        int index = partition(arr,left,right) ;
        quickSortHelper(arr,left,index-1);
        quickSortHelper(arr,index+1,right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i= left;
        int j = right;
        int base = arr[right];
        while (i<j) {
            while (i<j&&arr[i]<=base) {
                i++;
            }
            while(i<j&&arr[j]>base) {
                j--;
            }
            swap(arr,i,j);

        }
        swap(arr,i,right);
        return i;
    }





    //非递归快排序
    public static  void quickSort2 (int[ ] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length-1);
        stack.push(0);
        while (!stack.isEmpty()) {
            int left = stack.pop();
            int right = stack.pop();//取和入的顺序要相反
            if (left>=right) {
                continue;
            }
            int index = partition(arr,left,right);
            stack.push(right);
            stack.push(index+1);
            stack.push(index-1);
            stack.push(left);
        }
    }



    //归并排序
    public  static  void  merge(int[] arr,int low ,int mid, int high) {//把两个有序区间合并成一个
        int output[] =new int[high-low];//创建空间
        int outputindex = 0;//记录数组放了多少个元素
        int cur1 = low;
        int cur2 = mid;
        while (cur1<mid&& cur2<high) {
             if (arr[cur1] <= arr[cur2]) {
                 output[outputindex] = arr[cur1];//如果两个有序区间的对应位置比较 把小的拿出来 放在第一个
                 outputindex++;
                 cur1++;
             }else {
                 output[outputindex] = arr[cur2];
                 outputindex++;
                 cur2++;
             }
        }
        //循环结束 一定有一个先到达空间的末尾 另一个剩下的就全部拷贝到空间中
        //是左边数组的cur1没有先到最后
        while (cur1<mid) {
            output[outputindex] = arr[cur1];
            outputindex++;
            cur1++;
        }
        //右边数组有剩下
        while (cur2<high) {
            output[outputindex] = arr[cur2];
            outputindex++;
            cur2++;
        }
        //再把output中的拷贝到原来数组
        for (int i =0;i<high-low;i++) {
            arr[low+i] = output[i];
        }

    }
    public static void mergeSort (int[] arr) {
        mergeHelper(arr,0,arr.length); //这是个前闭后开的区间
    }

    private static void mergeHelper(int[] arr, int low, int high) {
        if (high-low<=1) {
            //区间只有一个或者0个元素 不用排序
            return;
        }
        int mid = (low+high) /2;
        mergeHelper(arr, low, mid);
        mergeHelper(arr,mid,high);
        //此时左右区间已经有序
        merge(arr,low,mid,high);//进行区间合并
    }





    //非递归版本的归并
    public static  void mergeSort2 (int[] arr) {
        for (int gap = 1; gap<arr.length; gap*=2) {
            for ( int i = 0;i<arr.length;i=i+2*gap) {
                int beg = i;
                int mid =i+gap;
                int end = i+2*gap;
                if (mid>=arr.length) {
                    mid = arr.length;
                }
                if (end>arr.length) {
                    end = arr.length;
                }
                merge(arr,beg,mid,end);
            }
        }
    }




    public static void main(String[] args) {
     /*   int[] arr= {9,5,3,6,7,8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));*/
        int[] array = {9,2,7,4,3,7,12,9};
        /*shellSort(array);
        System.out.println(Arrays.toString(array));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));*/
        mergeSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
