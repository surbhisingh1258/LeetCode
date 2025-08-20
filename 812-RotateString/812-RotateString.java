// Last updated: 8/20/2025, 10:05:39 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String n=s+s;
        return n.contains(goal);
        
    }
}