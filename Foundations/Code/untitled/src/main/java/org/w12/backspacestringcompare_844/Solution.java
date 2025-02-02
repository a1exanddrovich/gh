package org.w12.backspacestringcompare_844;

public class Solution {
    // can be solved with stacks
    public boolean backspaceCompare(String s, String t) {
        return buildProcessString(s).equals(buildProcessString(t));
    }

    private static String buildProcessString(String str) {
        StringBuilder sb = new StringBuilder();

        int poundCount = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char curChar = str.charAt(i);
            if (curChar == '#') {
                poundCount++;
            } else {
                if (poundCount == 0) {
                    sb.append(curChar);
                } else {
                    poundCount--;
                }
            }
        }

        return sb.toString();
    }
}
