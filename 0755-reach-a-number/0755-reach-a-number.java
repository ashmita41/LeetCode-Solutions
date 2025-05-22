class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        int sum = 0;
        int moves = 0;

        while (sum < target) {
            moves += 1;
            sum += moves;
        }

        int difference = sum - target;

        if (difference % 2 == 1) {
            moves += (moves % 2 == 0) ? 1 : 2;
        }

        return moves;

    }
}