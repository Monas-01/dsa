public int maxProfit(int[] prices) {
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
}

void main(){
    System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    System.out.println(maxProfit(new int[]{7,6,4,3,1}));
}