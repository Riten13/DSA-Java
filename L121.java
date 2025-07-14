//121. Best Time to Buy and Sell Stock

public class L121 {
    public static void main(String[] args) {
        int[] num = {7,1,5,3,6,4};
        int output = maxProfit(num);
        System.out.println(output);
    }
    /**
     * This method calculates the maximum profit that can be achieved by buying and selling a stock.
     * It iterates through the prices array, keeping track of the lowest price seen so far and the maximum profit.
     * 
     * @param prices An array of integers representing the stock prices on different days.
     * @return The maximum profit that can be achieved.
     */
    public static int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int profit =0,low =prices[0],dem =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<low){
                low = prices[i];
            }else{
                dem = prices[i] - low;
            }
            if(profit < dem){
                profit  = dem;
            }
        }
        return profit;
    }
}