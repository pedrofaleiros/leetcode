package solutions;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {

    //TODO: O(1) space
    
    public int findDuplicate(int[] nums) {
        Set<Integer> hash = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(hash.contains(nums[i])){
                return nums[i];
            }

            hash.add(nums[i]);
        }

        return 0;
    }
}
