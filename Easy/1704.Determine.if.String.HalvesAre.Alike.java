/*
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.
*/

// Solution
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int vowelCount1 = 0, vowelCount2 = 0;
        
        String vowels = "aeiouAEIOU"; // Vowel characters
        
        // Count vowels in both halves
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) vowelCount1++;  // First half
            if (vowels.indexOf(s.charAt(i + mid)) != -1) vowelCount2++;  // Second half
        }
        
        return vowelCount1 == vowelCount2;
    }
}
