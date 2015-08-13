package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/majority-element-ii/
 * 摩尔投票法
 * 摩尔投票法的基本思想很简单，在每一轮投票过程中，从数组中找出一对不同的元素，将其从数组中删除。
 * 这样不断的删除直到无法再进行投票，如果数组为空，则没有任何元素出现的次数超过该数组长度的一半。
 * 如果只存在一种元素，那么这个元素则可能为目标元素。
 */
public class MajorityElementII {
    public class Solution {
        public List<Integer> majorityElement(int[] nums) {
            List<Integer> res = new ArrayList<Integer>();
            int a = 0;
            int countA = 0;
            int b = 0;
            int countB = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == a) ++countA;
                else if (nums[i] == b) ++countB;
                else if (countA <= 0) {
                    a = nums[i];
                    countA = 1;
                } else if (countB <= 0) {
                    b = nums[i];
                    countB = 1;
                } else {
                    --countA;
                    --countB;
                }
            }
            if (a == b) b = a - 1;//a=0,b=0的情况
            countA = 0;
            countB = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == a) ++countA;
                else if (nums[i] == b) ++countB;
            }
            if (countA > nums.length / 3) res.add(a);
            if (countB > nums.length / 3) res.add(b);
            return res;
        }
    }
}
