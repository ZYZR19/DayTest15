package Day01;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-20
 * Time: 17:00
 */
public class EveryDay43 {
    //输入n m 数列中生成1 --n的数 任取几个数使其和等于m 输出列出所有结果
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] num = new int[n];
            int j = 1;
            for(int i=0;i<n;i++) {
                num[i] =j++;
            }
            summation(num,m);
        }
    }
    public static void summation(int[]sum,int m) {
        int i = 0;
        int j = m-1-1;
        while(i<j) {
            System.out.println( sum[i]+ " " +sum[j]);
            i++;
            j--;
        }
        System.out.println("0" +" " +m);
    }
    //这种办法只能选取两个数 而忽略了其他可能 例如输m=10 就有2 3 5 这样的可能
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0; //用来计算最后的结果
            String res = " " ;//结果字符串
            int[] num = new int[n];
            int j = 1;
            for (int i=0;i<n;i++) {
                num[i] =j++;
            }
            summation1(num,m,res,sum,0);

        }
    }

    private static void summation1(int[] num, int m, String res, int sum, int i) {
        if (i==num.length) {
            if (sum==m){
                System.out.println(res.trim());
            }
            return;
        }

        //表示要num[i]
        summation1(num, m, res+num[i]+" ", sum+num[i], i+1);
        //表示不要num[i]
        summation1(num, m, res, sum, i+1);
    }
}
