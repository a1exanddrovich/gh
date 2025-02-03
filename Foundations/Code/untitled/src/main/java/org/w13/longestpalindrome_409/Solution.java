package org.w13.longestpalindrome_409;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();

        int result = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                result += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            result++;
        }

        return result;
    }

    // alternative with map
//    public int longestPalindrome(String s) {
//        Map<Character, Integer> counter = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            counter.put(c, counter.getOrDefault(c, 0) + 1);
//        }
//
//        int result = 0;
//        boolean isOddPresent = false;
//
//        for (var entry : counter.entrySet()) {
//            int val = entry.getValue();
//            // add up the most possible count from the current count
//            result += ((val / 2) * 2);
//            // if an odd was found, we count it as +1 then
//            if (val % 2 != 0) {
//                isOddPresent = true;
//            }
//        }
//
//        return isOddPresent ? result + 1 : result;
//    }
}
