import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int []dp = new int[N+1];
        for(int i = 0; i <= N; i++){
            dp[i] = 1;
        }
        for(int i = 1; i < N; i++){
            for(int j = i-1; j >= 0; j--){
                if(dp[j] + 1 > dp[i] && list.get(j) < list.get(i)){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 0; i < N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);


    }
}