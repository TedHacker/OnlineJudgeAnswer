package CodingInterviews;

/**
 * ÌøÌ¨½×
 * Created by qinjuntao on 2015/8/26.
 */
public class JumpFloor {
    public class Solution {
        public int JumpFloor(int target) {
            if(target<=0) return 0;
            int a=1;
            int b=1;
            int res=1;
            for(int i=1;i<target;++i){
                res=a+b;
                a=b;
                b=res;
            }
            return res;
        }
    }
}
