import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int []dp = new int[31];
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= 30; i++){
            dp[i] = dp[i-1] * 2 + 1;
        }
        for(int i = 0; i < t; i++){
            int k = Integer.parseInt(br.readLine());
            System.out.println(dp[k]);
        }
    }
}



