

public class binarySearch {
    public static void main(String[] args){
        long startTime, endTime;
       
        int[] nums = new int[100000001];
        for(int i = 0; i < 100000001; i++){
            nums[i] = i;
        }
        int target = 100000000;

        startTime = System.currentTimeMillis();
        System.out.println(search(nums, target));
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(linear_search(nums, target));
        endTime = System.currentTimeMillis();
        System.out.println("Linear Search: " + (endTime - startTime));
    }
    private static int search(int[] nums, int target){
        int left = 0; int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        } return -1;
    }

    private static int linear_search(int[] nums, int target){
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        } return -1;
    }
}
 
    
       
    
               
                