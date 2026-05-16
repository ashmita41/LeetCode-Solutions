class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i ++) {
            esum += nums[i];
            if(nums[i] < 9) {
                dsum += nums[i];
            } else {
                dsum += sumOfDigits(nums[i]);
            }
        }
        ans = esum - dsum;
        return ans > 0 ? ans : -ans;
    }

    public static int sumOfDigits(int n) {
        int i = 0;
        while (n > 0) {
            int rem = n % 10;
            i += rem;
            n /= 10;
        }
        return i;
    }
}