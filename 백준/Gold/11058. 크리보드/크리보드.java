import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long []dp = new long[N];
        for(int i = 0; i < N; i++){
            dp[i] = i + 1;
        }

        for(int i = 6; i < N; i++){
            for(int j = 3; j <= 6; j++){
                dp[i] = Math.max(dp[i], dp[i-j] * (j-1));
            }
        }

        System.out.println(dp[N-1]);

    }
}