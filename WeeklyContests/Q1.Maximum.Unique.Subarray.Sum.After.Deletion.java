/*
You are given an integer array nums.
You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:
All elements in the subarray are unique.
The sum of the elements in the subarray is maximized.
Return the maximum sum of such a subarray.

Example 1:
Input: nums = [1,2,3,4,5]
Output: 15
Explanation:
Select the entire array without deleting any element to obtain the maximum sum.

Example 2:
Input: nums = [1,1,0,1,1]
Output: 1
Explanation:
Delete the element nums[0] == 1, nums[1] == 1, nums[2] == 0, and nums[3] == 1. Select the entire array [1] to obtain the maximum sum.

Example 3:
Input: nums = [1,2,-1,-2,1,0,-1]
Output: 3
Explanation:
Delete the elements nums[2] == -1 and nums[3] == -2, and select the subarray [2, 1] from [1, 2, 1, 0, -1] to obtain the maximum sum.

Constraints:
1 <= nums.length <= 100
-100 <= nums[i] <= 100

Note: Please do not copy the description during the contest to maintain the integrity of your submissions.©leetcode
 */

 // Solution
 class Solution {
    public int maxSum(int[] nums) {
        int approach1 = findMaxSubarraySum(nums);
        
        Map<Integer, Integer> bestValues = new HashMap<>();
        
        for (int num : nums) {
            if (num > 0) {
                bestValues.put(num, num); 
            } else if (!bestValues.containsKey(num)) {
                bestValues.put(num, num); 
            }
        }
        
        int positiveSum = 0;
        for (int val : bestValues.values()) {
            if (val > 0) {
                positiveSum += val;
            }
        }
        
        int approach2 = positiveSum > 0 ? positiveSum : Collections.max(bestValues.values());
        
        return Math.max(approach1, approach2);
    }
    
    private int findMaxSubarraySum(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        
        for (int start = 0; start < n; start++) {
            Set<Integer> seen = new HashSet<>();
            int currentSum = 0;
            
            for (int end = start; end < n; end++) {
                if (seen.contains(nums[end])) {
                    break;
                }
                
                seen.add(nums[end]);
                currentSum += nums[end];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        return maxSum;
    }
}