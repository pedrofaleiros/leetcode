package solutions;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/description/
public class Solution1 {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.containsKey(dif)) {
                int value = map.get(dif);
                if (value != i) {
                    return new int[] {i, value};
                }
            }
        }
        return new int[2];
    }
}
