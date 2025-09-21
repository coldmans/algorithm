import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double []arr = new double[n];
        double []dp = new double[n+1];

        for(int i = 0; i < n; i++){
            arr[i] = Double.parseDouble(br.readLine());
        }
        dp[0] = 1;
        double max = -1;
        int maxi = -1;
        for(int i = 1; i <= n; i++){
            dp[i] = Math.max(dp[i-1] * arr[i-1], arr[i-1]);
            if(max < dp[i]){
                max = dp[i];
                maxi = i;
            }
        }
        
        System.out.printf("%.3f", max+0.0000000000001);
    }
}

