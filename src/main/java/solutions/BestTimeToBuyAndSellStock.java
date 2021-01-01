package solutions;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        // [need to improve] attempted: 1/1
        // consider the solution using only a single loop

        // attempt 1: bruce force O(n^2)
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }

    public static int maxProfitSingleLoop(int[] prices) {

        // attenpt 2 : With single loop approach - O(N)
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        // [1,2,3,4,5,6] // 5
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // 1
            } else if (profit < (prices[i] - minPrice)) { // 0 < 2-1
                profit = prices[i] - minPrice;
            }
        }
        return profit;
    }
}

// attempt 1 : pseudo code
// buy the lowest, sell the biggest diff
// [1,2,3,4,5,6] -> 5 (buy1, sell6)
// [10,1,9,7,-1] -> 8 (buy1, sell9)
// [10,-1,9,7]   -> 10
// [2,10,1,10,30]-> 29 (buy1, sell30)
// [2,40,1,10,30]-> 38 (buy2, sell40)
// it doesnt always the smallest num

// profit(=0)
// substract numbers after the index
// (later than index 2) from the smallest
// if diff is negative, will not store and next
// case1:
// 1,0
// 1,5 -> return 5

// case2:
// 1,8 -> return 8
// 7,0

// case3:
// 2,38 -> return 38
// 10,0

// attempt 2 : pseudo code
// set min price(biggest num - which is integer.maxvalue) and max profit
// loop (day)
// if price of the day is smaller than min price
// update min price
// otherwise compare the price of "the next day - the min price" with profit
// return the biggest diff