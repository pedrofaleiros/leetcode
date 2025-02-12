package solutions;

// https://leetcode.com/problems/valid-palindrome/submissions/1540732625/
public class Solution125 {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();

        while(i < j){
            while (i < j && !isAlphaNum(s.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphaNum(s.charAt(j))) {
                j--;
            }

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
