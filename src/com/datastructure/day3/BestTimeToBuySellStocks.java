package com.datastructure.day3;

import org.junit.Test;

public class BestTimeToBuySellStocks {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            profit = Integer.max(prices[i]-min , profit);
            min = Integer.min(prices[i] , min);
        }
        return profit;
    }

    @Test
    public void test1 () {
        int[] prices= {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
