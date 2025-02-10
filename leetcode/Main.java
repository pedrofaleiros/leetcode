import java.util.Arrays;
import java.util.List;
import solutions.Solution1249;
import solutions.Solution200;
import solutions.Solution994;

@SuppressWarnings("unused")
public class Main {

    static Solution solution = new Solution();

    public static void main(String[] args) {
        testOrangesRotting();
    }

    private static void testOrangesRotting(){
        Solution994 solution = new Solution994();

        // int[][] grid = {
        //     {2, 1, 1},
        //     {1, 1, 0},
        //     {0, 1, 1}
        // };
        // int[][] grid = {
        //     {2, 1, 1},
        //     {0, 1, 1},
        //     {1, 0, 1}
        // };
        int[][] grid = {
            {1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0},
            {1, 0, 2, 0, 0},
            {1, 0, 1, 0, 0},
            {1, 1, 1, 1, 1},
        };

        var result = solution.orangesRotting(grid);

        System.out.println(result);
    }

    private static void testNumIslands(){
        Solution200 solution = new Solution200();

        char[][] grid = {
                {'0', '1', '1', '0', '0'},
                {'0', '0', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        var result = solution.numIslands(grid);

        System.out.println(result);
    }

    private static void testMinRemoveToMakeValid() {
        // Input: s = "lee(t(c)o)de)" Output: "lee(t(c)o)de"
        // Input: s = "a)b(c)d" Output: "ab(c)d"
        Solution1249 solution = new Solution1249();

        System.out.println(solution.minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(solution.minRemoveToMakeValid("a)b(c)d"));
        System.out.println(solution.minRemoveToMakeValid("())()((("));
        System.out.println(solution.minRemoveToMakeValid("))(("));
    }

    private static void testCombinationSum() {
        /*
         * Input: candidates = [2,3,6,7], target = 7 Output: [[2,2,3],[7]]
         * 
         * Input: candidates = [2,3,5], target = 8 Output: [[2,2,2,2],[2,3,3],[3,5]]
         */
        List<List<Integer>> res = solution.combinationSum(new int[] {2, 3, 6, 7}, 7);
        // List<List<Integer>> res = solution.combinationSum(new int[] {2, 3, 5}, 8);

        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }

    private static void testSubsets() {
        /*
         * Input: nums = [1,2,3] Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
         */
        List<List<Integer>> res = solution.subsets(new int[] {1, 2, 3});

        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }

    private static void testMaxDepth() {
        /*
         * Input: s = "(1+(2*3)+((8)/4))+1" Output: 3
         */
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1")); // 3
        System.out.println(solution.maxDepth("(1)+((2))+((3))")); // 2
    }

    private static void testPermute() {
        List<List<Integer>> res = solution.permute(new int[] {1, 2, 3});

        for (List<Integer> l : res) {
            System.out.println(l);
        }
    }

    private static void testTwoSum() {
        /*
         * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
         * 
         * Input: nums = [3,2,4], target = 6 Output: [1,2]
         */
        int[] l1 = {2, 7, 11, 15};
        int t1 = 9;

        int[] l2 = {3, 2, 4};
        int t2 = 6;

        System.out.println(Arrays.toString(solution.twoSum(l1, t1)));

        System.out.println(Arrays.toString(solution.twoSum(l2, t2)));
    }

    private static void testProductExceptSelf() {
        /*
         * Input: nums = [ 1, 2, 3, 4] Output: [24,12, 8, 6]
         */
        int[] t1 = {1, 2, 3, 4};
        int[] res = solution.productExceptSelf(t1);
        System.out.println(Arrays.toString(res));
    }

    private static void testLongestConsecutive() {
        int[] t1 = {100, 4, 200, 1, 3, 2};
        int[] t2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};


        System.out.println(solution.longestConsecutive(t1));
        System.out.println(solution.longestConsecutive(t2));
    }

    private static void testIsValid() {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";

        System.out.println(solution.isValid(test1));
        System.out.println(solution.isValid(test2));
        System.out.println(solution.isValid(test3));
        System.out.println(solution.isValid("({)}"));
    }

    private static void testIsAnagram() {

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(solution.isAnagram(s1, t1));
        System.out.println(solution.isAnagram(s2, t2));

    }

    private static void testContainsDuplicate() {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        int[] test3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Teste 1: " + solution.containsDuplicate(test1));
        System.out.println("Teste 2: " + solution.containsDuplicate(test2));
        System.out.println("Teste 3: " + solution.containsDuplicate(test3));
    }
}
