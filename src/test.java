import java.util.Arrays;

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


    public static void main(String[] args) {
        int[] arr= {9,5,3,6,7,8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] array = {9,2,7,4,3,7,12,9};
        shellSort(array);
        System.out.println(Arrays.toString(array));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
