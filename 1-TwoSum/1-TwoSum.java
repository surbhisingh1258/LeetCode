// Last updated: 8/20/2025, 10:08:39 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            numToIndex.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}