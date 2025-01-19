/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
 
Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
*/
 
// Solution - 
class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            // pivot not found apply normal binary search to find target element
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target, 0, pivot-1);
        }
        else{
            return binarySearch(nums,target, pivot+1, nums.length-1);
        }
    }
  
    int findPivot(int[] nums){
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                // 4 possible cases to find pivot
                if(mid<end && nums[mid]>nums[mid+1]){
                    return mid;
                }
                if(mid>start && nums[mid] < nums[mid-1]){
                    return mid-1;
                }
                // Decide which half to search
                if(nums[mid]<=nums[start]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            return -1;   // pivot not found
        }

             
    int binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]< target){
                start = mid+1;
            }
            else if(nums[mid]> target){
                end = mid-1;
            }
            // ans found
            else return mid;
        }
        return -1;
    }
}


