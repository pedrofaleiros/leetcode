package solutions;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class Solution1614 {

    public int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                depth++;
            if (s.charAt(i) == ')')
                depth--;
            if (depth > max)
                max = depth;
        }
        return max;
    }
}
