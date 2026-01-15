class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(nums, true, target);
        if (ans[0] != -1) {
            ans[1] = binarySearch(nums, false, target);
        }
        return ans;
    }

    public int binarySearch(int[] nums, boolean findFirstIndex, int target) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] > target) {
                e = m - 1;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                ans = m;
                if (findFirstIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}