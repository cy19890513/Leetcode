public class Solution {
    public int maxProfit(int[] prices) {
        
       if (prices.length == 0)
        {
            return 0;
        }
        int i=0, profit =0,min=prices[0];
        for(i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
                min = prices[i];
            else
            {
                if(prices[i]-min>profit)
                    profit = prices[i]-min;
            }
            
        }
        
        return profit;
    }
}