import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class combination_sum {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int target = 7;
        System.out.println(solution(nums, target));
    }
    private static List<List<Integer>> solution(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        helper(set, nums, new ArrayList<>(), target, 0);
        return new ArrayList<>(set);
    }
    private static void helper(Set<List<Integer>> set, int[] nums, List<Integer> list, int target, int sum){
        if(sum == target){
            List<Integer> temp = new ArrayList<>(list);
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] > target) continue;
            sum += nums[i]; list.add(nums[i]);
            helper(set, nums, list, target, sum);
            sum -= nums[i]; list.remove(list.size() - 1);
        }
    }
    
}
