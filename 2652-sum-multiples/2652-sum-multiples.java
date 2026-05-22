class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            boolean use = false;
            if (i%3==0 || i%5==0 || i%7==0) {
                use = true;
            } 
            if(use) {
                sum += i;
            }
        }
        return sum;
    }
}