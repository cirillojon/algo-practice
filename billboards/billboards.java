import java.util.HashMap;
import java.util.Map;

public class billboards {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        System.out.println(solution(nums));
    }
    private static int solution(int[] rods){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 0; i < rods.length; i++){
            int x = rods[i];
            Map<Integer, Integer> temp = new HashMap<>(map);
            Integer[] keys = temp.keySet().toArray(new Integer[0]);
            for(int j = 0; j < keys.length; j++){
                int d = keys[j];
                int y = temp.get(d);

                // put x to tall side
                map.put(d + x, Math.max(map.getOrDefault(d + x, 0), y));

                // put x to short side
                if(d >= x)
                    map.put(d - x, Math.max(map.getOrDefault(d - x, 0), y + x));
                    
                // if x > d
                else
                    map.put(x - d, Math.max(map.getOrDefault(x - d, 0), y + d));
            }
        } 
        System.out.println(map);
        return map.getOrDefault(0,0);
    }
}
