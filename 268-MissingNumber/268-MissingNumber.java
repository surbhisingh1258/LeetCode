// Last updated: 8/20/2025, 10:06:42 PM
class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        
        int n = nums.length;

        for(int i = 0;i<n;i++){

            if(nums[i]!=i) return i;
        }

        return n;
    }
}
