import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class three_sum {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 12;
        System.out.println(solution(nums, target));
    }
    private static List<List<Integer>> solution(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1; int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum > target) k--;
                else j++;
            }
        } return new ArrayList<>(set);
    }
}
