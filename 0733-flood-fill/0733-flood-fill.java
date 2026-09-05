class Solution {
    private void dfs(int[][] image, int r, int c, int color, int targetColor){
        if(image[r][c] != targetColor) return;
        image[r][c] = color;

        if(r-1 >= 0) {
            dfs(image, r-1, c, color, targetColor);
        }
        if(r+1 < image.length) {
            dfs(image, r+1, c, color, targetColor);
        }
        if(c-1 >= 0) {
            dfs(image, r, c-1, color, targetColor);
        }
        if(c+1 < image[r].length) {
            dfs(image, r, c+1, color, targetColor);
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}