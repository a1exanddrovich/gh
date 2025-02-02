package org.w12.partitionarrayaccordingtogivenpivot_2161;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivotCount = 0;
        int elementsGreaterThanPivotCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                pivotCount++;
            }
            if (nums[i] > pivot) {
                elementsGreaterThanPivotCount++;
            }
        }

        int[] result = new int[nums.length];
        int lessIndex = 0;
        int greaterIndex = nums.length - elementsGreaterThanPivotCount;

        // arrange the < and > than pivot elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result[lessIndex] = nums[i];
                lessIndex++;
            }
            if (nums[i] > pivot) {
                result[greaterIndex] = nums[i];
                greaterIndex++;
            }
        }

        // fill in the pivots starting from lessIndex
        for (int i = 0; i < pivotCount; i++) {
            result[lessIndex] = pivot;
            lessIndex++;
        }

        return result;
    }
}
