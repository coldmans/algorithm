import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int [] cup = new int[N];

        for(int i = 0; i < N; i++){
            cup[i] = sc.nextInt();
        }
        long [] dp = new long[H + 1];
        dp[0] = 1;
        for(int h = 0; h < H; h++){
            if(dp[h] == 0) continue;
            for(int i = 0; i < N; i++){
                if(h +cup[i] <= H){
                    dp[h + cup[i]] = (dp[h + cup[i]] + dp[h]) % 1000000007;
                }
            }
        }
        System.out.println(dp[H]);
    }
}




