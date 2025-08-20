// Last updated: 8/20/2025, 10:07:25 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            res.append(str[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString();    
    }
}