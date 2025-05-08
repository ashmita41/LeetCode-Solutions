class Solution {
    private int getSquare(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSquare(n);

        while (fast != 1 && slow != fast) {
            slow = getSquare(slow);              // move 1 step
            fast = getSquare(getSquare(fast));   // move 2 steps
        }

        return fast == 1;
    }
}
