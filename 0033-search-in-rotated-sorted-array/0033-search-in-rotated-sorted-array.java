class Solution {

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);

        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }

    public int binarySearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m < e && nums[m] > nums[m + 1]) {
                return m;
            }
            if (m > s && nums[m - 1] > nums[m]) {
                return m - 1;
            }

            if (nums[s] <= nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
