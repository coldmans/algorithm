import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int []arr = new int[K+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= K; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int []dp = new int[K+1];
        Arrays.fill(dp, 999999999);
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 1; i <= K; i++){
            for(int j = i + 1; j <= i + arr[i]; j++){
                if(j >= dp.length) break;
                if(dp[i] + 1 < dp[j]){
                    dp[j] = dp[i] + 1;
                }
            }
        }

        if(dp[K] == 999999999){
            System.out.println(-1);
        }
        else {
            System.out.println(dp[K]);
        }





    }
}