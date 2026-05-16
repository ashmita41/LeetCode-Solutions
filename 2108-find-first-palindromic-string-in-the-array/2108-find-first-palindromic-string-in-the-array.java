class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(String str : words) {
            ans = isPalindrome(str);
            if(!ans.isEmpty()) {
                return ans;
            }
        }
        return "";
    }

    public static String isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return "";
            }
            i++;
            j--;
        }
        return str;
    }
}