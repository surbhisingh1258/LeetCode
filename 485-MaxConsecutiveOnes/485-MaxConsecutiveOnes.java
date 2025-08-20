// Last updated: 8/20/2025, 10:05:58 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int num:nums){
            if(num == 1){
                count++;
                max=Math.max(count,max);
            }else{
                count=0;
            }
        }
        return max;
    }
}