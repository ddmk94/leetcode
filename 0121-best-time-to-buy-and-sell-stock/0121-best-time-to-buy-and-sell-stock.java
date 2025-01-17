class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        dp[0] = 0;

        int min = prices[0];
        for (int i = 1; i < dp.length; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }

        return dp[prices.length - 1];
    }
}