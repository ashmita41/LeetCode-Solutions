class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;

        // already sorted (not rotated)
        if (nums[s] <= nums[e]) {
            return nums[s];
        }

        while (s <= e) {
            int m = s + (e - s) / 2;

            // check right neighbor safely
            if (m < e && nums[m] > nums[m + 1]) {
                return nums[m + 1];
            }

            // check left neighbor safely
            if (m > s && nums[m - 1] > nums[m]) {
                return nums[m];
            }

            // left side is sorted, pivot on right
            if (nums[m] >= nums[s]) {
                s = m + 1;
            }
            // right side is sorted, pivot on left
            else {
                e = m - 1;
            }
        }
        return -1; // should never reach here
    }
}
