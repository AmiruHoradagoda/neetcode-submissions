class Solution {
    public int maxProfit(int[] prices) {
        int buyIdx = 0;
        int sellIdx = 1;
        int sum = 0;

        while(sellIdx<prices.length){
            int tempSum = prices[sellIdx]-prices[buyIdx];
            if(prices[sellIdx]<=prices[buyIdx]){
                buyIdx=sellIdx;
            }else{
                sum = Math.max(sum,tempSum);
            }
            sellIdx++;
        }
        return sum;
    }
}


