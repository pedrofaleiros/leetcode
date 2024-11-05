package solutions;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/contains-duplicate/description/
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int aux = map.get(num);
                map.put(num, aux + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > 1) {
                return true;
            }
        }
        return false;
    }
}
