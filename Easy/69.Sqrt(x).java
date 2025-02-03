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

//My 2nd Solution - Binary Search (Returned the Floor of the Number)
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 0;
        int end = x;
        // int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Use long to prevent overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Exact square root found
            } 
            else if (square < x) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return end;  // Return the floor of the square root
    }
}


// ALso we can return like this while using binary search
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 0;
        int end = x;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Use long to prevent overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid; // Exact square root found
            } 
            else if (square < x) {
                result = mid;  // Store potential result
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return result;  // Return the floor of the square root
    }
}

// Worst Approach is using linear search (for loop) - dont use it, that is a brute force approach and try to optimise your solution as much as you can
// Cheers, Happy Coding!
