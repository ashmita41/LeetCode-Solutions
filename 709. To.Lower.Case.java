/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"
*/

// Solution
class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            // Convert uppercase to lowercase
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32)); // Convert to lowercase using ASCII
            } else {
                result.append(c); // Append character as it is
            }
        }
        
        return result.toString();
    }
}

