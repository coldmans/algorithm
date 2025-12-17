import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int []line1 = new int[n];
        int []line2 = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            line1[i] = Integer.parseInt(st.nextToken());
            line2[i] = Integer.parseInt(st.nextToken());
            sum += line1[i] + line2[i];
        }
        st = new StringTokenizer(br.readLine());
        int [][][]dp = new int[n+1][3][k+10];
        for (int i = 0; i <= n; i++) {
            for (int s = 0; s < 3; s++) {
                Arrays.fill(dp[i][s], 2000000000);
            }
        }

        dp[1][0][1] = line1[0];
        dp[1][1][1] = line2[0];
        dp[1][2][0] = 0;
        dp[1][1][0] = 0;
        dp[1][0][0] = 0;
        dp[0][2][0] = 0;
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i + 1; j++){
                if(j > k + 5) continue;
                dp[i + 1][2][j] = min(min(dp[i][0][j], dp[i][1][j]), dp[i][2][j]);
                dp[i+1][0][j+1] = min(dp[i][0][j], dp[i][2][j]) + line1[i];
                dp[i+1][1][j+1] = min(dp[i][1][j], dp[i][2][j]) + line2[i];
            }
        }

        dp[n][2][k] = min(min(dp[n-1][1][k], dp[n-1][0][k]), dp[n-1][2][k]);
        

        int mins = min(dp[n][2][k], dp[n][1][k]);
        mins = min(mins, dp[n][0][k]);
        System.out.println(sum - mins);

    }
}