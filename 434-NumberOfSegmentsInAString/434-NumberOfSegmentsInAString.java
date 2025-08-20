// Last updated: 8/20/2025, 10:06:04 PM
class Solution {
    public int countSegments(String s) {
        
        String[] arr=s.split(" ");
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isBlank()){
                c++;
            }
        }
        return c;
    }
}