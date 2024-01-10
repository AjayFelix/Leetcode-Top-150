package ArrayAndSrings;
//LEETCODE PROBLEM NO :122
public class BestTimeToBuyAndSellStockII {
   public int maxProfit (int []price){
       // Initialize pointers for buying and selling transactions
       int left = 0;
       int right = 1;
       // Variable to store the maximum profit
       int maximumProfit = 0 ;
       // Iterate through the prices array
       while(right < price.length){
           // Check if the current price allows for a profitable transaction
           if(price[left]<price[right]){
               //add it to the maximumProfit
               maximumProfit += price[right]-price[left];

           }
               // Move the left pointer to the next index
               left = right;
        right++;
       }
       // Return the maximum profit achieved
       return maximumProfit;
   }

    public static void main(String[] args) {
        int [] arr = {7,1,2,3,5,3,1,3};

        BestTimeToBuyAndSellStockII maxProfit = new BestTimeToBuyAndSellStockII();

        System.out.println(maxProfit.maxProfit(arr));
    }

}
