package CodingInterviews;

/**
 * Created by qinjuntao on 2015/8/26.
 */
public class JumpFloorII {
    public class Solution {
        public int JumpFloorII(int target) {
            if(target<=0) return 0;
            int a=0;
            int b=0;
            int res=0;
            int sum=0;
            for(int i=1;i<target;++i){
                res=a+b+1;
                a=sum;
                b=res;
                sum+=res;
            }
            return sum+1;
        }
    }
}
