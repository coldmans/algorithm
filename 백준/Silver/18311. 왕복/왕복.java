import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long K = Long.parseLong(input[1]);
        String []wax = br.readLine().split(" ");
        long []load = new long[N+1];
        long []dp = new long[N+1];
        long tmp = 0;
        for(int i = 0; i < N; i++){
            load[i] = Long.parseLong(wax[i]);
            tmp += load[i];
        }

        dp[0] = load[0];

        for(int i = 1; i < N; i++){
            dp[i] = dp[i-1] + load[i];
        }

        if(tmp <= K){
            K -= tmp;
            K = tmp - K;
        }

        for(int i = 0; i < N; i++){
            if(K < dp[i]){
                System.out.println(i+1);
                break;
            }
        }

    }
}


