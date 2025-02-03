package org.w13.sortcolors_75;

public class Solution {
    public void sortColors(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                swap(i, index, nums);
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 1) {
                swap(i, index, nums);
                index++;
            }
        }
    }

    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
