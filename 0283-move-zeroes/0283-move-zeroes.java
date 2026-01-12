class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                ans[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; k<ans.length; k++) {
            ans[k] = 0;
        }

        for(int i = 0; i< nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}