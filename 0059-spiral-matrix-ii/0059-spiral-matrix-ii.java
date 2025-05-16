class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        if( n == 1 ) {
            ans[0][0] = 1;
            return ans;
        }
        int count = 1;
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;

        while ( top <= bottom && left <= right ) {
            //right
            for ( int i = left; i <= right; i++ ) {
                ans[top][i] = count;
                count++;
            }
            top++;
            //down
            for ( int i = top; i <= bottom; i++ ) {
                ans[i][right] = count;
                count++;
            }
            right--;
            //left
            if( top <= bottom ) {
                for ( int i = right; i >= left; i-- ) {
                    ans[bottom][i] = count;
                    count++;
                }
                bottom--;
            }
            //up
            if( left <= right ) {
                for ( int i = bottom; i >= top; i-- ) {
                    ans[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}