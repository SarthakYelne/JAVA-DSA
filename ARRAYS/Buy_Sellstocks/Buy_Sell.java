package Arrays.Buy_Sellstocks;

public class Buy_Sell {

    public static int BuySellstocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                max_profit = Math.max(max_profit, profit);
            } else{
                buyPrice = prices[i];
            }
        }

        return max_profit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuySellstocks(prices));
    }
}
