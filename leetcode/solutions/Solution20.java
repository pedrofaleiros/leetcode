package solutions;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class Solution20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (c == ')') {
                    if (pop != '(')
                        return false;
                }
                if (c == '}') {
                    if (pop != '{')
                        return false;
                }
                if (c == ']') {
                    if (pop != '[')
                        return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
