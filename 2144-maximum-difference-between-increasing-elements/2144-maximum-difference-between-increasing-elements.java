class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = 0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    diff = nums[j] - nums[i];
                    if (diff > ans) {
                        ans = diff;
                    }
                }
            }
        }


        return ans;

    }
}