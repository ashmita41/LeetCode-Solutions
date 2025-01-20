/*
Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

Example 1:
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.

Example 2:
Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 
Constraints:
1 <= num <= 231 - 1
*/

//It is an easy binary search question but the catch here is = Handle Overflow: Multiplying two integers (mid * mid) can cause an integer overflow for large values of num. To prevent this, store the result of mid * mid in a long
// so take care of this
class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;

        while(start<=end){
            int mid = start + (end-start)/2;
            long square = (long) mid*mid;
            if(square == num){
                return true;
            }
            
            if(num < square){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
