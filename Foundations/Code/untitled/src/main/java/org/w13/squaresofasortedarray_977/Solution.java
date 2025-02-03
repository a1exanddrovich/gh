package org.w13.squaresofasortedarray_977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            int num1 = nums[i] * nums[i];
            int num2 = nums[j] * nums[j];

            if (num1 > num2) {
                result[k] = num1;
                i++;
            } else {
                result[k] = num2;
                j--;
            }
            k--;
        }

        return result;
    }
}
