class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int pos = 0;

        while (pos < n) {                         
            boolean isSorted = rotateAndSort(nums, pos);
            if (isSorted) {                       
                return true;
            }
            pos++;
        }

        return false;
    }

    public boolean rotateAndSort(int[] nums, int pos) {

        int n = nums.length;
        int[] rotated = new int[n];               

        int idx = 0;

        // Copy from pos+1 to end
        for (int i = pos + 1; i < n; i++) {
            rotated[idx++] = nums[i];
        }

        // Copy from 0 to pos
        for (int i = 0; i <= pos; i++) {
            rotated[idx++] = nums[i];
        }

        return isSorted(rotated);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
