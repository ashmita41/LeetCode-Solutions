class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            char[] ch = sentences[i].trim().toCharArray();
            int cnt = 0;
            for(char c : ch) {
                if (c == ' ') {
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }
        return max+1;
    }
}