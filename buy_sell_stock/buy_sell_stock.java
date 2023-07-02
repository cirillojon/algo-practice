public class buy_sell_stock {
    public static void main(String[] args){
        int[] nums = {5, 2, 6, 7, 2, 4, 6};
        System.out.println(solution(nums));
    }
    private static int solution(int[] nums){
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < nums.length; i++){
            buy = Math.min(buy, nums[i]);
            profit = Math.max(profit, nums[i] - profit);
        } return profit;
    }
}
