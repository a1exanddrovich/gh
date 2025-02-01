package org.w10.reversestring_344;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] array = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(array);
        System.out.println(Arrays.toString(array));
    }
}
