class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        char[] arr = s.trim().toCharArray();
        int i = arr.length - 1;
        while(i>=0) {
            //skip spaces 
            while(i >= 0 && arr[i] == ' ') i--;

            if(i<0) break;

            int j = i;
            while(j >= 0 && arr[j] != ' ') j--;

            //append word
            result.append(arr, j+1, i-j);
            result.append(' ');

            i = j-1;
        }

        return result.toString().trim();
    }
}