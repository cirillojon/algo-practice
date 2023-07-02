import java.util.Map;
import java.util.HashMap;
public class twosum {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int target = 9;
        int[] res = solution(nums, target);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    private static int[] solution(int[] nums, int target){
            int[] res = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                if(map.containsKey(target-nums[i])){
                res[0] = i; res[1] = map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i], i);
        } return res;
    }
}
