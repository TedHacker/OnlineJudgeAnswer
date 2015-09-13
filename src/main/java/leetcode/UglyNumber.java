package leetcode;

/**
 * Created by ted on 15/9/13.
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumber {
    public class Solution {
        public boolean isUgly(int num) {
            if(num<=0) return false;
            for(;num%2==0;num/=2);
            for(;num%3==0;num/=3);
            for(;num%5==0;num/=5);
            return num>1?false:true;
        }
    }
}
