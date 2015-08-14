package leetcode;

/**
 * Created by qinjuntao on 2015/8/14.
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductofArrayExceptSelf {
    public class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] answer = new int[nums.length];
            answer[nums.length - 1] = 1;
            for (int i = nums.length - 2; i >= 0; --i)
                answer[i] = nums[i + 1] * answer[i + 1];// answer[i]保存i+1~n的乘积
            for (int i = 0, tmp = 1; i < nums.length; ++i) {
                answer[i] *= tmp;
                tmp *= nums[i];// tmp保存0~i-1的乘积
            }
            return answer;
        }
    }
}
