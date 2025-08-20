// Last updated: 8/20/2025, 10:08:32 PM
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0, target=x;
        while(x>0){
            int temp=x%10;
            x=x/10;
            sum=sum*10+temp;
        }
        return sum==target;
        
    }
}