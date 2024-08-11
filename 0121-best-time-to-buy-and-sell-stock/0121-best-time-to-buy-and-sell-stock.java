class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min)
            min=prices[i];
            int diff=prices[i]-min;
            if(diff>maxp)
            maxp=diff;
        }
        return maxp;
    }
}