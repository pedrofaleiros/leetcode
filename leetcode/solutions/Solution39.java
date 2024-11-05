package solutions;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/description/
public class Solution39 {

    private List<List<Integer>> combinations;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.combinations = new ArrayList<>();
        back(candidates, target, 0, new ArrayList<>(), 0);
        return this.combinations;
    }

    private void back(int[] candidates, int target, int sum, List<Integer> list, int index) {
        if (sum == target) {
            this.combinations.add(new ArrayList<>(list));
            return;
        }

        if (index >= candidates.length || sum > target) return;

        int num = candidates[index];

        list.add(num);
        back(candidates, target, sum + num, list, index);

        list.remove(list.size() - 1);
        back(candidates, target, sum, list, index + 1);
    }
}
