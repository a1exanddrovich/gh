package org.w10.snakeinmatrix_3248;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 2;
        List<String> commands = List.of("RIGHT", "DOWN");
        System.out.println(solution.finalPositionOfSnake(n, commands));
    }
}
