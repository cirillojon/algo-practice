import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class combination_sum_two {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int target = 7;
        System.out.println(solution(nums, target));
    }
    private static List<List<Integer>> solution(int[] nums, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, nums, new ArrayList<>(), 0, target);
        return res;
    }

    public static void helper(List<List<Integer>> res, int[] nums, List<Integer> list, int index, int target){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(target < 0) return;
        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(res, nums, list, i + 1, target - nums[i]);
            list.remove(list.size() - 1);
        }
    }
}
