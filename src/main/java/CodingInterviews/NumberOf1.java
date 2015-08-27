package CodingInterviews;

/**
 * 二进制中1的个数
 * Created by qinjuntao on 2015/8/27.
 */
public class NumberOf1 {
    public class Solution {
        public int NumberOf1(int n) {
            int countx=0;
            for(int i=0;i<32;++i)
                if(((n>>i)&1)==1)
                    ++countx;
            return countx;
        }
    }
}
