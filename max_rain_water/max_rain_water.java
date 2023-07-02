public class max_rain_water {
    public static void main(String[] args){
        int[] nums = {2, 8, 1, 4, 6, 2, 1, 8};
        System.out.println(solution(nums));
    }
    private static int solution(int[] height){
        int left = 0; int right = height.length - 1;
        int max = 0;
        for(int i = 0; i < height.length; i++){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h*w);
            if(height[left] > height[right]) right--;
            else if(height[right] > height[left]) left++;
            else{left++; right--;}
        } return max;
    }
}
