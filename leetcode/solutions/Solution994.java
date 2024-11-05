package solutions;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/rotting-oranges/description/
public class Solution994 {

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int seconds = 0;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) fresh++;
                if (grid[i][j] == 2) queue.add(new int[] {i, j});
            }
        }

        while (!queue.isEmpty() && fresh > 0 ) {
            int size = queue.size();
            
            for (int q = 0; q < size; q++) {
                int[] aux = queue.remove();
                int i = aux[0], j = aux[1];

                int top = i - 1;
                if (top >= 0 && grid[top][j] == 1) {
                    grid[top][j] = 2;
                    fresh--;
                    queue.add(new int[] {top, j});
                }

                int right = j + 1;
                if (right < cols && grid[i][right] == 1) {
                    grid[i][right] = 2;
                    fresh--;
                    queue.add(new int[] {i, right});
                }

                int bottom = i + 1;
                if (bottom < rows && grid[bottom][j] == 1) {
                    grid[bottom][j] = 2;
                    fresh--;
                    queue.add(new int[] {bottom, j});
                }

                int left = j - 1;
                if (left >= 0 && grid[i][left] == 1) {
                    grid[i][left] = 2;
                    fresh--;
                    queue.add(new int[] {i, left});
                }
            }

            seconds++;
        }

        if (fresh != 0) return -1;
        return seconds;
    }

}
