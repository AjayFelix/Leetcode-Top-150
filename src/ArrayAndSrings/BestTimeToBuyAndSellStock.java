package ArrayAndSrings;
//LEETCODE PROBLEM NO :121
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Initialize indices and maximum profit
        int buyingPrice= 0 ;
        int sellingPrice = 1;
        int maxProfit = 0;
        // Iterate through the prices array using While loop
        while(sellingPrice < prices.length){
            // Check if the price on the buyingPrice is less than the sellingPrice
            if(prices[buyingPrice]<prices[sellingPrice]){
                // Calculate the profit and update maxProfit
                maxProfit = Math.max(maxProfit,prices[sellingPrice]-prices[buyingPrice]);
            }else {
                // If the buying day is not optimal
                buyingPrice=sellingPrice;
            }
            // Move to the next day
            sellingPrice++;
        }
        // Return the maximum profit
        return maxProfit;

    }

    public static void main(String[] args) {
        int [] arr ={7,1,2,3,4,5,6};

        BestTimeToBuyAndSellStock profit = new BestTimeToBuyAndSellStock();

        System.out.println(profit.maxProfit(arr));
    }


}
