/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day
    Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell
    one share of the stock multiple times).
    Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy
    again).
 */

package Array;

public class BuyAndSell {

    public int maxProfit(int[] prices) {
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxprofit += prices[i] - prices[i - 1];
            }
        }

        return maxprofit;
    }
}

/*
    simply go on crawling over the slope and keep on adding the profit obtained from every consecutive transaction. In
    the end,we will be using the peaks and valleys effectively, but we need not track the costs corresponding to the
    peaks and valleys along with the maximum profit, but we can directly keep on adding the difference between the
    consecutive numbers of the array if the second number is larger than the first one, and at the total sum we obtain
    will be the maximum profit.
 */
