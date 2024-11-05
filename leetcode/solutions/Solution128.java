package solutions;

import java.util.HashSet;

// https://leetcode.com/problems/longest-consecutive-sequence/description/
public class Solution128 {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int count = 0;
        int i = 1;
        for (int num : set) {
            i = 1;
            if (set.contains(num - 1) == false) {
                while (set.contains(num + i)) {
                    i++;
                }
            }
            if (i > count) {
                count = i;
            }
        }

        return count;
    }
}
