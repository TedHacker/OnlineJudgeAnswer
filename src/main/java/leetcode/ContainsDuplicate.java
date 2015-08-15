package leetcode;

import java.util.HashSet;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> hs = new HashSet<Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hs.contains(nums[i]))
                    return true;
                else
                    hs.add(nums[i]);
            }
            return false;
        }
    }
}
