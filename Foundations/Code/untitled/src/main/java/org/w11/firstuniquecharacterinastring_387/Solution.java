package org.w11.firstuniquecharacterinastring_387;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqueChar(String s) {
        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (counter.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
