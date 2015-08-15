package leetcode;

import java.util.HashMap;

/**
 * Created by TedHakcer on 2015/8/15 0015.
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomantoInteger {
    public class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            s = s.toUpperCase();
            hm.put('I', 1);
            hm.put('V', 5);
            hm.put('X', 10);
            hm.put('L', 50);
            hm.put('C', 100);
            hm.put('D', 500);
            hm.put('M', 1000);
            int sum = 0, len = s.length();
            for (int i = 0, j; i < len; ++i) {
                j = i + 1;
                if (j < len && hm.get(s.charAt(i)) < hm.get(s.charAt(j))) {
                    sum += hm.get(s.charAt(j)) - hm.get(s.charAt(i));
                    i = j;
                } else {
                    sum += hm.get(s.charAt(i));
                }
            }
            return sum;
        }
    }
}
