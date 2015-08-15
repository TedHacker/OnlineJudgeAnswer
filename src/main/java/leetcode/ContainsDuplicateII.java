package leetcode;

import java.util.HashMap;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {
    public class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            boolean flag = false;
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hm.containsKey(nums[i])) {
                    if (i - hm.get(nums[i]) <= k)
                        return true;
                    hm.put(nums[i], i);
                } else
                    hm.put(nums[i], i);
            }
            return flag;
        }
    }
}
