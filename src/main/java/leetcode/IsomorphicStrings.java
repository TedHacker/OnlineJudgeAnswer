package leetcode;

import java.util.*;

/**
 * Created by qinjuntao on 2015/8/13.
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings {
    public class Solution {
        Map<Character, Character> hashx = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();

        public boolean isIsomorphic(String s, String t) {
            for (int i = 0; i < s.length() && i < t.length(); ++i) {
                if (hashx.containsKey(s.charAt(i))) {
                    if (hashx.get(s.charAt(i)) != t.charAt(i)) //出现s中的字符映射到t中不同的字符
                        return false;
                } else {
                    hashx.put(s.charAt(i), t.charAt(i));
                    if (set.contains(t.charAt(i))) return false; //出现t中的字符映射到s中不同的字符
                    set.add(t.charAt(i));
                }
            }
            return true;
        }
    }
}
