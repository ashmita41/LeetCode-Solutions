/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
*/

// Solution
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()]; // Create a character array for the result
        
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i); // Place characters in the correct position
        }
        
        return new String(result); // Convert character array to string and return
    }
}
