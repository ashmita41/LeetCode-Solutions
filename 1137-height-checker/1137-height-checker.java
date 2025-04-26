class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone(); // copy the array
        Arrays.sort(expected); // sort the copy
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}