public class Solution {
    public int maxProfit(int[] price) {
        int profit = 0;
        int bestBuy = price[0];
        for (int i = 1; i < price.length; i++) {
            int currentPrice = price[i];
            if (currentPrice > bestBuy) {
                profit = Math.max(profit,  currentPrice - bestBuy);
            }
            bestBuy = Math.min(bestBuy, currentPrice);

        }
        return profit;

    }
}