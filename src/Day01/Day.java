package Day01;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-20
 * Time: 10:27
 */
public class Day {
    //遍历二维数组 找到结果就返回true 找不到返回false(效率低)
    //没有使用递增的特性
    //查找的过程 本质是排除 一次排除一批的效率的更高
    //比较目标值和数组中右上角的值(左下角的值)
    //如果比右上角的小 查找的值不会出现在那一列 剩下前三列
    //和右上角再次比较 比右上角大 把右上角那一行排除
    //比右上角小就排除右上角那一列,大就排除排除那一行
    //临界条件 1.找到了 2.没找到  i和j在矩阵的合法范围内
    //对下标书写 i是行 j是右上角
    //杨氏矩阵
   // public  boolean Find (int target,int[][] arr) {
    // if(arr==null) {
    //return false;
     //   }

   // }





    //数组遍历 定义一个第一个 比较然后找最小的 ()
    //旋转分成两部分 都是非递减的
    //旋转的深度决定最小值是否靠近1/2






    //重新定义一个空间 给两个指针 从头和从尾遍历
    //左指针遇到奇数 就移动到下一个  右指针如果遇到偶数就 移动到下一个
    //左指针遇到偶数 右指针遇到奇数 此时左右指针位置的元素进行交换
    //此方法交换会使相对位置发生变化
    //插入排序的思想 位置不变化
    //

}
