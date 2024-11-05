package solutions;

// https://leetcode.com/problems/product-of-array-except-self/description/
public class Solution238 {

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int right = 1;
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = right;
            right *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= left;
            left *= nums[i];
        }
        return answer;
    }
}
