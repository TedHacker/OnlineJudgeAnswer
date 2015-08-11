package leetcode;

/**
 * Created by TedHakcer on 2015/8/10 0010.
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public class Solution {
        public int climbStairs(int n) {
            if (n < 0) return 0;
            int[] dp = new int[n + 1 > 3 ? n + 1 : 3];
            dp[0] = 0;//0个台阶，0个方法
            dp[1] = 1;//1个台阶，1个方法
            dp[2] = 2;//2个台阶，2个方法
            for (int i = 3; i <= n; ++i) {
                dp[i] = dp[i - 1] + dp[i - 2];//i个台阶的方法数是i-2个台阶(走2个台阶到i)与i-1个台阶(走1个台阶到i)之和
            }
            return dp[n];
        }
    }
}
