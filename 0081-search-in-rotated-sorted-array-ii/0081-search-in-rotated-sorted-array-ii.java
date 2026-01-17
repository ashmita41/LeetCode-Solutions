class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // ✅ Target found
            if (nums[mid] == target) return true;

            // \U0001f504 Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            // \U0001f50d Left side is sorted
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;  // Target is in the left half
                } else {
                    start = mid + 1;  // Target is in the right half
                }
            }
            // \U0001f50d Right side is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;  // Target is in the right half
                } else {
                    end = mid - 1;  // Target is in the left half
                }
            }
        }

        return false; // 
    }
}
