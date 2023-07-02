import java.util.Map;
import java.util.HashMap;

public class longest_arith_sub {
    public static void main(String[] args){
        int[] nums = {1,4,6,3,7,10,12};
        System.out.println(solution(nums));
    }
    private static int solution(int[] nums){
        Map<Integer, Integer>[] dp = new HashMap[nums.length];
        int max = 2;
        for(int i = 0; i < nums.length; i++){
            dp[i] = new HashMap<>();
            for(int j = 0; j < i; j++){
                int d = nums[i] - nums[j];
                dp[i].put(d, dp[j].getOrDefault(d, 1) + 1);
                max = Math.max(max, dp[i].get(d));
            }
        } return max;
    }
}
