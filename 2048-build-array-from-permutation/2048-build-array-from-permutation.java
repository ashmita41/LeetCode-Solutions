class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int oldValue = nums[i] % n;
            int newValue = nums[oldValue] % n;
            nums[i] = oldValue + newValue * n;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }

        return nums;

    }
}