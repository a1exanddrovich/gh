package org.w11.convert1darrayinto2darray_2022;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        System.out.println(Arrays.deepToString(solution.construct2DArray(original, m, n)));
    }
}
