class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        long total = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
            total += pile;
        }

        // Minimum possible eating speed must be at least total/h
        int min = (int)((total + h - 1) / h);  // equivalent to ceil(total / h)
        int result = max;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isFit(piles, mid, h)) {
                result = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return result;
    }

    boolean isFit(int[] piles, int k, int h) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
            if (hours > h) return false;
        }
        return true;
    }
}
