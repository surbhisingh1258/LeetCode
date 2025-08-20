// Last updated: 8/20/2025, 10:06:36 PM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
}