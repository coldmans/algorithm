import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        BigInteger []dp = new BigInteger[10001];

        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(1);
        for(int j = 2; j < 10001; j++){
            dp[j] = dp[j-1].add(dp[j-2]);
        }




        for(int i = 1; i <= T; i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());



            System.out.println("Case #" + i + ": " + dp[P-1].mod(BigInteger.valueOf(Q)));

        }
    }
}