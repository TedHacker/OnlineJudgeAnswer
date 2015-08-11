package leetcode;

/**
 * Created by qinjuntao on 2015/8/10.
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumberII {
    public class Solution {
        public int singleNumber(int[] nums) {
            int one = 0;//存储出现1次的bit位
            int two = 0;//存储出现2次的bit位
            int three = 0;//存储出现3次的bit位
            for (int i = 0; i < nums.length; ++i) {
                two |= (one & nums[i]);//当前数据和上轮模后出现1次的共有bit位就是新的出现2次的bit位
                one ^= nums[i];//当前数据和上轮模后出现1次的不同的bit位即本轮之后出现1次的bit位
                three = (one & two);//得出出现3次的bit位
                one &= (~three);//类似对3取模的操作
                two &= (~three);//类似对3取模的操作
            }
            return one | two;//唯一的数可能出现1次或者2次
        }
    }
}
