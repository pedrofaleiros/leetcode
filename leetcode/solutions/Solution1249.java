package solutions;

import java.util.Stack;

public class Solution1249 {

    public String minRemoveToMakeValid(String s) {
        StringBuilder string = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add(string.length());
                string.append('(');
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    string.append(')');
                }
            } else {
                string.append(s.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            string.setCharAt(stack.pop(), '0');
        }

        String ret = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != '0') {
                ret += string.charAt(i);
            }
        }
        return ret;
    }
}
