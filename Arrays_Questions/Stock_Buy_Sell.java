//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

package Arrays_Questions;

public class Stock_Buy_Sell {
    static int maxProfit(int [] price, int size){
        int maxProfit = 0;
        // The loop will start from 1 as it is comparing with the previous array(Price)
 for(int i = 1; i<size; i++)
     if(price[i] > price[i - 1])
         maxProfit += price[i] - price[i - 1] ;
        return maxProfit;
    }


    public static void main(String[] args) {
//stock price on different - different days
        int [] price = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;

        //function call
        System.out.println("Maximum profit achieved - " + maxProfit(price, n));
    }
}
