package solutions;

// https://leetcode.com/problems/max-area-of-island/description/
public class Solution695 {
    
    int max = 0;
    int rows;
    int cols;

    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j, 1));
                    // max = Math.max(max, dfs2(grid, i, j));
                }
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int i, int j, int size) {
        grid[i][j] = 0;

        int top = i - 1;
        if (top >= 0 && grid[top][j] == 1) {
            grid[top][j] = 0;
            size += dfs(grid, top, j, 1);
        }

        int right = j + 1;
        if (right < cols && grid[i][right] == 1) {
            grid[i][right] = 0;
            size += dfs(grid, i, right, 1);
        }

        int bottom = i + 1;
        if (bottom < rows && grid[bottom][j] == 1) {
            grid[bottom][j] = 0;
            size += dfs(grid, bottom, j, 1);
        }

        int left = j - 1;
        if (left >= 0 && grid[i][left] == 1) {
            grid[i][left] = 0;
            size += dfs(grid, i, left, 1);
        }

        return size;
    }

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    @SuppressWarnings("unused")
    private int dfs2(int[][] grid, int i, int j) {
        if(i >= rows || i < 0 || j >= cols || j < 0) return 0;
        if(grid[i][j] == 0) return 0;

        grid[i][j] = 0;

        int size = 1;
        for(int[] dir : directions){
            size += dfs2(grid, i + dir[0], j + dir[1]);
        }
        return size;
    }

}
