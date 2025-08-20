// Last updated: 8/20/2025, 10:05:44 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int pos=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(letters[mid]>target){
                pos=mid;
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return pos == -1 ? letters[0] : letters[pos];
    }

}