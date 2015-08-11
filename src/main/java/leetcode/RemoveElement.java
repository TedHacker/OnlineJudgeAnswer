package leetcode;

/**
 * Created by qinjuntao on 2015/8/11.
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            int first = 0;
            int last = nums.length - 1;
            int len = nums.length; //类似[2],1等数组不包含删除对象的情况，结果默认为原数组长度
            int tmp;
            for (; ; ) {
                for (; first < nums.length && nums[first] != val; ++first) ;
                for (; last >= 0 && nums[last] == val; --last) ;
                len = first; //类似[1],1等数组都是删除对象的情况，结果为开始值
                if (last <= first) break;
                tmp = nums[first];
                nums[first] = nums[last];
                nums[last] = tmp;
                ++first;
                --last;
                len = first;
            }
            return len;
        }
    }
}
