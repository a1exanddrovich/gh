package org.w10.snakeinmatrix_3248;

import java.util.List;

public class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;

        for (String command : commands) {
            switch (command) {
                case "LEFT" -> j--;
                case "DOWN" -> i++;
                case "RIGHT" -> j++;
                default -> i--;
            }
        }

        return (i * n) + j;
    }
}
