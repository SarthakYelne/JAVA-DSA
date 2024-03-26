package Arrays.Practice_Questions;

// Q_3 : You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  
//       the ith day. Return the maximum profit you can achieve from this transaction. If you cannot 
//       achieve any profit, return 0.

public class Q_3 {
    public static int Buy_Sell(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                max_profit = Math.max(max_profit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return max_profit;

    }

    public static void main(String[] args) {
        // int prices[] = {7, 1, 5, 3, 6, 4};
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(Buy_Sell(prices));
    }
}

// Output : 

// 5

// 0

