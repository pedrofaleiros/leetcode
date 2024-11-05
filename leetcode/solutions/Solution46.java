package solutions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/description/
public class Solution46 {
    private List<List<Integer>> permutations;

    public List<List<Integer>> permute(int[] nums) {
        this.permutations = new ArrayList<>();
        permutate(nums, new ArrayList<>());
        return permutations;
    }

    private void permutate(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            this.permutations.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                permutate(nums, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
