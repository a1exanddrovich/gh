package org.w13.addbinary_67;

public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (carry != 0 || i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
            int total = digitA + digitB + carry;

            result.append(total % 2);
            carry = total / 2;
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
