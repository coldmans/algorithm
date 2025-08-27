import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            list.add(new int[]{y, x});
        }
        Long []dp = new Long[C+1];
        for(int i = 0; i<= C; i++){
            dp[i] = (long) Integer.MAX_VALUE;
        }


        for(int i = 0; i < N; i++){
            int[]tmp = list.get(i);
            long y = tmp[0];
            int x = tmp[1];
            if(x > C) x = C;
            if(dp[x] <= y) continue;
            dp[x] = y;

            for(int j = 1; j <= C; j++){
                int k = j / x + 1;
                dp[j] = Math.min(dp[j], y * k);
            }

            for(int j = 1; j <= C; j++){
                long mins = dp[j];
                for(int k = 1; k < j; k++){
                    if(j-k < 0) continue;
                    mins = Math.min(mins, dp[k] + dp[j-k]);
                }
                dp[j] = mins;
            }
        }

        System.out.println(dp[C]);

    }

}

