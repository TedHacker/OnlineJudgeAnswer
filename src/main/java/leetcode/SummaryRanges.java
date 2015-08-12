package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinjuntao on 2015/8/12.
 * https://leetcode.com/problems/summary-ranges/
 */
public class SummaryRanges {
    public class Solution {
        private void insert(List<String> result,int a,int b){
            if(a==b){
                result.add(String.format("%s",a));
            }
            else{
                result.add(String.format("%s->%s",a,b));
            }
        }
        public List<String> summaryRanges(int[] nums) {
            List<String> result=new ArrayList<String>();
            if(nums==null) return result;
            if(nums.length<2){
                result.add(String.valueOf(nums[0]));
                return result;
            }
            int first=nums[0];
            for(int i=0;i<nums.length;++i){
                if(i==nums.length-1){
                    insert(result, first, nums[i]);
                }
                else if(nums[i+1]-nums[i]>1){
                    insert(result, first, nums[i]);
                    first=nums[i+1];
                }
            }
            return result;
        }
    }
}
