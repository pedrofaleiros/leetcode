package solutions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/description/
public class Solution78 {

    private List<List<Integer>> subs;

    public List<List<Integer>> subsets(int[] nums) {
        this.subs = new ArrayList<>();
        back(nums, new ArrayList<>(), 0);
        return subs;
    }

    private void back(int[] nums, List<Integer> list, int index) {
        if (index >= nums.length) {
            subs.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        back(nums, list, index + 1);

        list.remove(list.size() - 1);
        back(nums, list, index + 1);
    }
}
