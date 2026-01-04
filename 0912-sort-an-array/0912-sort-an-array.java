class Solution {
    public int[] sortArray(int[] nums) {

        //using quick sort
        quickSort(nums, 0, nums.length - 1);
        return nums;

    }

    public static void quickSort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            // no violation
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            // if above does not match means violation
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
}