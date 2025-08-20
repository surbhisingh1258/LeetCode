// Last updated: 8/20/2025, 10:05:34 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0, n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) n++;
            else{
                count += (n*(n+1)/2);
                n=0;
            }
        }
        if(n>0){
            count +=(n*(n+1)/2);
        }
        return count;
    }
}