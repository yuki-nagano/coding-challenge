package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(38, BestTimeToBuyAndSellStock.maxProfit(new int[]{2,40,1,10,30}));
        assertEquals(10, BestTimeToBuyAndSellStock.maxProfit(new int[]{10,-1,9,7}));
        assertEquals(29, BestTimeToBuyAndSellStock.maxProfit(new int[]{2,10,1,10,30}));
    }

    @Test
    void maxProfitSingleLoop() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(38, BestTimeToBuyAndSellStock.maxProfit(new int[]{2,40,1,10,30}));
        assertEquals(10, BestTimeToBuyAndSellStock.maxProfit(new int[]{10,-1,9,7}));
        assertEquals(29, BestTimeToBuyAndSellStock.maxProfit(new int[]{2,10,1,10,30}));
    }
}