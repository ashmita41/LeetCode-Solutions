/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 
Constraints:
1 <= n <= 231 - 1
*/

class Solution {
    public int arrangeCoins(int n) {
        long start = 0, end = n; // Use long to avoid overflow
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2; // Sum of the first `mid` rows
            
            if (sum == n) {
                return (int) mid; // Exact match
            } else if (sum < n) {
                start = mid + 1; // Move right to find a larger k
            } else {
                end = mid - 1; // Move left to find a smaller k
            }
        }
        return (int) end; // The largest k where sum ≤ n
    }
}
