import java.util.HashMap;
import java.util.Map;
class robber{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        res = helper(nums, res, map, nums.length - 1);
        return res;
    }

    public static int helper(int[] nums, int res, Map<Integer, Integer> map, int index){
        if(index == 0) return nums[0];
        if(index == 1) return Math.max(nums[0], nums[1]);
        if(map.containsKey(index)) return map.get(index);
        res = Math.max(nums[index] + helper(nums, res, map, index - 2), helper(nums, res, map, index - 1));
        map.put(index, res); return res;
    }
}