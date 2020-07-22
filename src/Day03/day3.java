package Day03;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-22
 * Time: 20:56
 */
public class day3 {
    public int RectCover(int target) {
        if (target<2) {
            return target;
        }
        int[] dp = new int[target+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3;i<=target;i++) {
            dp[i] = dp[i-1] +dp[i-2];
        }
        return dp[target];
    }
}
