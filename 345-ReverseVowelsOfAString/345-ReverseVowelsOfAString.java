// Last updated: 8/20/2025, 10:06:23 PM
class Solution {
    public String reverseVowels(String s) {
        String vow = "aeiouAEIOU"; 
        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray(); 

        while (l < r) {
            // Move left pointer to the next vowel
            while (l < r && vow.indexOf(arr[l]) == -1) {
                l++;
            }

            // Move right pointer to the previous vowel
            while (l < r && vow.indexOf(arr[r]) == -1) {
                r--;
            }

            // Swap vowels at the left and right pointers
            if (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

        return new String(arr); 
    }
}