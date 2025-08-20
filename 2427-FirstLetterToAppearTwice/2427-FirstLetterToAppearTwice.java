// Last updated: 8/20/2025, 10:05:32 PM
class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '0'; 
    }
}