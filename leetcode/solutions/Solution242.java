package solutions;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/valid-anagram/description/
public class Solution242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int aux = map.get(c);
                map.put(c, aux + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != 0)
                return false;
        }

        return true;
    }
}
