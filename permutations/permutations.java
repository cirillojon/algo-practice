import java.util.List;
import java.util.ArrayList;
public class permutations {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    private static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    private static void helper(List<List<Integer>> res, int[] nums, List<Integer> list, boolean[] used){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true; list.add(nums[i]);
            helper(res, nums, list, used);
            used[i] = false; list.remove(list.size() - 1);
        }
    }
}
