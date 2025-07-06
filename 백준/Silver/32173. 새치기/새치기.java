import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long [] arr = new long[N];
        long [] dp = new long[N+1];
        for(int i = 0; i < N; i++){
            long tmp = sc.nextInt();
            arr[i] = tmp;
        }
        dp[1] = arr[0];
        for(int i = 2; i < N; i++){
            dp[i] = arr[i-1] + dp[i-1];
        }
        long max = 0;
        for(int i = 0; i < N; i++){
            max = Math.max(max, arr[i] - dp[i]);
        }
        System.out.println(max);
    }
}




