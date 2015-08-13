package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings {
    public class Solution {
        Map<Character,Character> hashx=new HashMap<Character,Character>();
        public boolean isIsomorphic(String s, String t) {
            for(int i=0;i<s.length()&&i<t.length();++i){
                if(hashx.containsKey(s.charAt(i))){
                    if(hashx.get(s.charAt(i))!=t.charAt(i))
                        return false;
                }else{
                    hashx.put(s.charAt(i),t.charAt(i));
                }
            }
            return true;
        }
    }
}
