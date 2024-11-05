package solutions;

// https://leetcode.com/problems/word-search/description/
public class Solution79 {
    private char[][] board;
    private int m;
    private int n;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.m = board.length;
        this.n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == word.charAt(0) && back(i, j, word, 0))
                    return true;
        return false;
    }

    private boolean back(int i, int j, String word, int index) {
        if (index >= word.length())
            return true;
        if (i < 0 || i >= m)
            return false;
        if (j < 0 || j >= n)
            return false;
        if (word.charAt(index) != board[i][j])
            return false;

        board[i][j] = '.';

        if (back(i, j + 1, word, index + 1))
            return true;
        if (back(i, j - 1, word, index + 1))
            return true;
        if (back(i + 1, j, word, index + 1))
            return true;
        if (back(i - 1, j, word, index + 1))
            return true;

        board[i][j] = word.charAt(index);
        return false;
    }
}
