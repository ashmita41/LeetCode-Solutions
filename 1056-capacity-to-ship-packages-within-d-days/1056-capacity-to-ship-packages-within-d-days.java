class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;

        for (int weight : weights) {
            l = Math.max(l, weight);
            r += weight;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isValid(weights, mid, days)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    private boolean isValid(int[] weights, int capacity, int days) {
        int currentLoad = 0;
        int requiredDays = 1;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                requiredDays++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return requiredDays <= days;
    }
}