/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 
Follow up:
Could you solve this problem in less than O(n) complexity?
*/


// Solution 1 - I tried by binary search approach because it was given in question that the array is sorted although on leetcode better solution exist as coompared to this one - will update them
class Solution {
    public int findKthPositive(int[] arr, int k) {

        int target = 1;
        int count = 0;

        while (count < k) {
            boolean found = false;
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    found = true;
                    break;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (found == false) {
                count++;
            }
            target++;
        }
        return target - 1;
    }
}


// Better Approach using Binary Search and also used the pattern that array is sorted and the diff btw ith number and i+1 will be the total numbers missing till that index if missing no count is more than k then search is left otherwise right and when equal then return k+start (that missing number)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
            int mid = start + (end - start)/2;
            int missingNo = arr[mid] - (mid+1);
            if(missingNo < k){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }

        return k+start;

    }
}
