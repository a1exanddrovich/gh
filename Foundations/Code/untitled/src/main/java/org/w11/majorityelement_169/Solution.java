package org.w11.majorityelement_169;

public class Solution {
    public int majorityElement(int[] nums) {
        int curMajorityElement = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                curMajorityElement = n;
            }

            if (n == curMajorityElement) {
                count++;
            } else {
                count--;
            }
        }

        return curMajorityElement;
    }
}
