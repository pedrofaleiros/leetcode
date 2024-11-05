package solutions;

// https://leetcode.com/problems/number-of-islands/description/
public class Solution200 {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    sink(grid, i, j);
                    grid[i][j] = '0';
                }
            }
        }

        return islands;
    }

    private void sink(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        int top = i - 1;
        if(top >= 0 && grid[top][j] == '1'){
            grid[top][j] = '0';
            sink(grid, top, j);
        }

        int right = j + 1;
        if (right < cols && grid[i][right] == '1') {
            grid[i][right] = '0';
            sink(grid, i, right);
        }

        int bottom = i + 1;
        if (bottom < rows && grid[bottom][j] == '1') {
            grid[bottom][j] = '0';
            sink(grid, bottom, j);
        }

        int left = j - 1;
        if (left >= 0 && grid[i][left] == '1') {
            grid[i][left] = '0';
            sink(grid, i, left);
        }
    }
}
