class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minValue) {
                minValue = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minValue);
            }
        }

        return maxProfit;
    }
}