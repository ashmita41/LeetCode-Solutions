class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;

        for (int money: nums) {
            int rob = prev2 + money;
            int skip = prev1;

            int curr = Math.max(rob, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
        
    }
}