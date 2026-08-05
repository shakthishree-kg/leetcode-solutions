class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i:prices)
        {
            if(i<minprice)
            {
               minprice=i;
            }
            else
            {
                maxprofit=Math.max(i-minprice,maxprofit);
            }
        }
        return maxprofit;
    }
}