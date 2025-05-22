class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int num : piles) {
            if (num > max) {
                max = num;
            }
        }
        int left = 1; // Minimum possible speed
        int right = max; // Maximum possible speed
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) {
                right = mid; // Try to find a smaller speed
            } else {
                left = mid + 1; // Need a larger speed
            }
        }
        return left;
    }
    
    private boolean canEatAll(int[] piles, int k, int h) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k; // Equivalent to Math.ceil(pile / k)
            if (totalHours > h) {
                return false; // Early exit if exceeds h
            }
        }
        return totalHours <= h;
    }
}