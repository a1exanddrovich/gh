package org.w12.movezeroes_283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        // move all non-zeros to the left
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }

        // nullify all the left elements
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
