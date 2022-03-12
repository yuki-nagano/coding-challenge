class Solution {
    public int maxProfit(int[] prices) {
    }
}
/*
Note:
Buy the minimum
Sell the biggest gap

max = 4
cur_price = 1
                   c     i
Input: prices = [7,1,5,3,6,4]
Output: 7

for/while int i = 1:
    if prices[i] < cur_price:
        cur_price = prices[i]

    profit = prices[i] - cur_price;
    max = Math.max(max, profit)
    // if max < profit max = profit is better?
*/
