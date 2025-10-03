import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        if(N < 0){
            N *= -1;
            int []rdp = new int[N+2];
            rdp[1] = 1;
            rdp[2] = -1;
            for(int i = 3; i <= N; i++){
                rdp[i] = (rdp[i-2] - rdp[i-1]) % 1000000000;
            }
            if(rdp[N] < 0){
                rdp[N] *= -1;
                System.out.println(-1);
            }
            else{
                System.out.println(1);
            }
            System.out.println(rdp[N] % 1000000000);
        }
        else if(N == 0){
            System.out.println(0);
            System.out.println(0);
        }
        else{
            int []dp = new int[N+2];
            dp[1] = 1;
            for(int i = 2; i <= N; i++){
                dp[i] = (dp[i-2] + dp[i-1]) % 1000000000;
            }
            System.out.println(1);
            System.out.println(dp[N]);
        }


    }

}
