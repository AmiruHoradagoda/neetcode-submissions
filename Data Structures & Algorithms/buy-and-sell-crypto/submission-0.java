class Solution {
    public int maxProfit(int[] prices) {
        int buyIdx = 0;
        int sellIdx = 1;
        int sum = 0;

        while(sellIdx<prices.length){
            int tempSum = prices[sellIdx]-prices[buyIdx];
            if(tempSum>sum){
                sum = tempSum;
                sellIdx++;
            }else{
                if(prices[sellIdx]>prices[buyIdx]){
                    sellIdx++;
                }else{
                    buyIdx=sellIdx;
                    sellIdx++;
                }
            }
        }
        return sum;
    }
}


