// Last updated: 8/20/2025, 10:06:13 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;

        // Sum ASCII values of both strings
        for (char c : s.toCharArray()) {
            sumS += c;
        }

        for (char c : t.toCharArray()) {
            sumT += c;
        }

        // The difference is the extra character
        return (char)(sumT - sumS);
    }
}