/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 
Constraints:
n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
*/

// there are better approaches to solve this question - this is not the best one, will update the better solution to this problem later
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        // finding the missing number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
          return ans;       
    }

     void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        }
}
