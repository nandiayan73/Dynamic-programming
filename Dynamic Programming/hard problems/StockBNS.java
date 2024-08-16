// PROBLEM:
// Best Time to Buy and Sell Stock
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
// Find the maximum profit you can achieve. You may complete at most k transactions.
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
// Constraints:
// 0 <= k <= 100
// 0 <= prices.length <= 1000
// 0 <= prices[i] <= 1000
// Example :
// Input: k = 2, prices = [2,4,1]
// Output: 2
// Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.

class StockBNS
{
            public static int maxProfit(int[] prices) {
                int lowElem=0,maxElem=Integer.MAX_VALUE;
        
                int maxProfit=0,minPrice=Integer.MAX_VALUE;
                for(int i=0;i<prices.length;i++)
                {
                   if(minPrice>prices[i])
                   {
                    minPrice=prices[i];
                    lowElem=minPrice;
                   }
                   else
                   {
                        // get the highest element:
                        if(maxProfit<prices[i]-minPrice)
                            maxElem=prices[i];
                        maxProfit=Math.max(prices[i]-minPrice,maxProfit);
                        
                   }
                }
                System.out.println(minPrice);
                System.out.println(maxElem);
                return maxProfit;
            }
            public static void main(String[] args) {
                int arr[]={7,8,1,5,9,6,4};
                int res = maxProfit(arr);
                System.out.println(res);
            }
}