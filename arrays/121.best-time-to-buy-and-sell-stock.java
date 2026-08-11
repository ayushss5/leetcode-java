/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                }
            int profit = prices[i] - min;
            if(profit>maxProfit){
                maxProfit=profit;
            }
                
        }
        return maxProfit;
    }
}

// @lc code=end

