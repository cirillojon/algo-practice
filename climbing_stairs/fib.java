public class fib {
    public static void main(String[] args){
        int n = 5;
        System.out.println(solution(n));
        System.out.println(recur(n));
    }
    private static int solution(int n){
        int a  = 0; int b = 1; int c = a + b;
        for(int i = 0; i < n -1; i++){
            a = b; b = c; c = a + b;
        } return c;
    }
    private static int recur(int n){
    if(n == 0) return 1;
    if(n == 1) return 1;
    if(n == 2) return 2;
    return(recur(n - 2) + recur(n - 1));
    }
}
 