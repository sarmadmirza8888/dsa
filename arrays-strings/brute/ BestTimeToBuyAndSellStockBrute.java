/*
 * ------------------------------------------------------------
 * Problem    : 121. Best Time to Buy and Sell Stock
 * File       : BestTimeToBuyAndSellStockBrute.java
 * Approach   : Brute Force (All Buy-Sell Pairs)
 *
 * Description:
 * Check every possible pair of buying and selling days.
 * For each buying day, calculate the profit for every
 * possible future selling day and keep track of the
 * maximum profit.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

class BestTimeToBuyAndSellStockBrute {
    public int maxProfit(int[] prices) {
        // Store the maximum profit found
        int maximumProfit = 0;
        // Try every buying day
        for (int buyDay = 0; buyDay < prices.length - 1; buyDay++) {

            // Try every possible selling day after the buying day
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {

                int currentProfit = prices[sellDay] - prices[buyDay];

                // Update maximum profit if a better profit is found
                if (currentProfit > maximumProfit) {
                    maximumProfit = currentProfit;
                }
            }
        }
        return maximumProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockBrute solution = new BestTimeToBuyAndSellStockBrute();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println("Maximum Profit: " + solution.maxProfit(prices1));
        System.out.println("Maximum Profit: " + solution.maxProfit(prices2));
    }
}