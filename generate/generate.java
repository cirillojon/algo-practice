package generate;
import java.util.*;

public class generate {
    public static void main(String[] args){
        List<String> res = new ArrayList<>();
        int n = 4;
        helper(res, n, 0, "");
        System.out.println(res);
    }
    public static void helper(List<String> res, int left, int right, String s){
        if(left == 0 && right == 0){
            res.add(s);
            return;
        }

        if(left > 0) helper(res, left - 1, right + 1, s + "(");
        if(right > 0) helper(res, left, right - 1, s + ")");
    }
}
