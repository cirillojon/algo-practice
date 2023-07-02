public class max_sub_arr {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(max_sub(nums));
    }
    private static int max_sub(int[] nums){
        int curr_max = 0; int end_max = 0;
        for(int i = 1; i < nums.length; i++){
            end_max = Math.max(nums[i], nums[i] + end_max);
            curr_max = Math.max(curr_max, end_max);
        } return curr_max;
    }
}
