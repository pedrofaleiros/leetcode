package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> matriz = new ArrayList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            matriz.add(new ArrayList<>());
        }

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var el : map.entrySet()) {
            var key = el.getKey();
            var value = el.getValue();

            matriz.get(value).add(key);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = nums.length; i > 0 && count < k; i--) {
            var list = matriz.get(i);

            for (int el : list) {
                result[count++] = el;
                if (count == k)
                    return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var solution = new Solution347();

        var result = solution.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);

        System.out.println(Arrays.toString(result));
    }

}

/*
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2] Example 2:
 * 
 * Input: nums = [1], k = 1 Output: [1]
 * 
 */
