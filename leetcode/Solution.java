import java.util.List;
import solutions.Solution1;
import solutions.Solution128;
import solutions.Solution1614;
import solutions.Solution20;
import solutions.Solution217;
import solutions.Solution238;
import solutions.Solution242;
import solutions.Solution39;
import solutions.Solution46;
import solutions.Solution78;
import solutions.Solution79;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        var solution = new Solution1();
        return solution.twoSum(nums, target);
    }

    public boolean isValid(String s) {
        var solution = new Solution20();
        return solution.isValid(s);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        var solution = new Solution39();
        return solution.combinationSum(candidates, target);
    }

    public List<List<Integer>> permute(int[] nums) {
        var solution = new Solution46();
        return solution.permute(nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        var solution = new Solution78();
        return solution.subsets(nums);
    }

    public boolean exist(char[][] board, String word) {
        var solution = new Solution79();
        return solution.exist(board, word);
    }

    public int longestConsecutive(int[] nums) {
        var solution = new Solution128();
        return solution.longestConsecutive(nums);
    }

    public boolean containsDuplicate(int[] nums) {
        var solution = new Solution217();
        return solution.containsDuplicate(nums);
    }

    public int[] productExceptSelf(int[] nums) {
        var solution = new Solution238();
        return solution.productExceptSelf(nums);
    }

    public boolean isAnagram(String s, String t) {
        var solution = new Solution242();
        return solution.isAnagram(s, t);
    }

    public int maxDepth(String s) {
        var solution = new Solution1614();
        return solution.maxDepth(s);
    }
}
