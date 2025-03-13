/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 
Constraints:
0 <= x <= 231 - 1
*/

//My 1st Solution (Jugaad) 
import java.util.*;
class Solution {
    public static int mySqrt(int x) {
int result=(int)Math.sqrt(x);
return result;
    }
public static void main(String args[]){
    System.out.println(mySqrt(16));
}
}

//My 2nd Solution - Optimised Binary Search
/* Complexity
Time complexity:
The time complexity of this approach is O(logN). It's very efficient because Binary Search reduces the search range by half in each iteration, making the search faster.
Space complexity:
The space complexity is O(1), which means the amount of extra memory used is constant, regardless of the input. We only use a few variables to store the search range and the middle value during the computation.
*/

class Solution {
    public int mySqrt(int num) {
        if(num == 1){
            return 1;
        }
        int start = 1,end = num;
        while(start<=end){
            double mid = start + (end-start)/2;
            if(mid*mid == num){
                return (int)mid;
            }
            else if(mid*mid>num){
                end = (int)mid-1;
            }
            else{
                start = (int)mid+1;
            }
        }
        return end;
    }
}

// Brute Force Approach is using linear search (for loop) - try to optimise your solution as much as you can
// Cheers, Happy Coding!
