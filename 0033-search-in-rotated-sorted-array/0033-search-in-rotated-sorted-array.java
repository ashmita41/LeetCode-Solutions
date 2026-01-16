class Solution {
    public int search(int[] nums, int target) {
        int pivot = -1;

        // find pivot
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                pivot = i;
                break;
            }
        }

        // not rotated
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        // pivot itself
        if (nums[pivot] == target) {
            return pivot;
        }

        // decide which side to search
        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }

    public static int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}
