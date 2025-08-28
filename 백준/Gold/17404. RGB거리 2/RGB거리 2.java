import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static int real = Integer.MAX_VALUE;
    static int N;
    static void cal(int x, int[][] cost){
        int [][]dp = new int[N+1][3];
        for(int i = 0; i < N+1; i++){
            for(int j = 0; j < 3; j++){
                dp[i][j] = Integer.MAX_VALUE / 10;
            }
        }
        dp[1][x] = cost[0][x];
        for(int i = 2; i < N; i++){
            dp[i][0] = cost[i-1][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = cost[i-1][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = cost[i-1][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        int res;
        if(x == 0){
            res = cost[N-1][1] + Math.min(dp[N-1][0], dp[N-1][2]);
            res = Math.min(res, cost[N-1][2] + Math.min(dp[N-1][0], dp[N-1][1]));
        }
        else if(x == 1){
            res = cost[N-1][0] + Math.min(dp[N-1][1], dp[N-1][2]);
            res = Math.min(res, cost[N-1][2] + Math.min(dp[N-1][0], dp[N-1][1]));
        }
        else{
            res = cost[N-1][0] + Math.min(dp[N-1][1], dp[N-1][2]);
            res = Math.min(res, cost[N-1][1] + Math.min(dp[N-1][0], dp[N-1][2]));
        }

        real = Math.min(real, res);

    }


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int [][]cost = new int[N][3];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cal(0, cost);
        cal(1, cost);
        cal(2, cost);
        System.out.println(real);


    }
}

