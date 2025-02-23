/*  
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109
*/

// My Solution - This is a best approach to solve this question - as it is valid for both square and rectangle matrix
// just one mistake i have done - 
// You are swapping i and j incorrectly.
// matrix[j][i] may go out of bounds if j exceeds matrix.length before i does.
// You should iterate based on the dimensions of the original matrix, not ans.
  
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;

    }
}
