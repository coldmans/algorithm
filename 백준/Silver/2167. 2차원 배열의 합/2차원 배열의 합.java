import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int [][] graph = new int[N][M];
        for(int i = 0; i < N; i++){
                String []inputs = br.readLine().split(" ");
                for(int k = 0; k < inputs.length; k++){
                    graph[i][k] = Integer.parseInt(inputs[k]);
            }
        }

        int [][] dp = new int[N][M];
        dp[0][0] = graph[0][0];


        for(int i = 1; i < M; i++){
            dp[0][i] = dp[0][i-1] + graph[0][i];
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < M; j++){
                if(j == 0){
                    dp[i][j] = graph[i][j];
                }
                else {
                    dp[i][j] = dp[i][j - 1] + graph[i][j];
                }
            }
        }



        int K = Integer.parseInt(br.readLine());
        for(int a = 0; a < K; a++){
            String []inputs = br.readLine().split(" ");
            int sy = Integer.parseInt(inputs[0]) - 1;
            int sx = Integer.parseInt(inputs[1]) - 1;
            int ey = Integer.parseInt(inputs[2]) - 1;
            int ex = Integer.parseInt(inputs[3]) - 1;
            int tmp = 0;
            for(int i = sy; i <= ey; i++){
                if(sx == 0){
                    tmp += dp[i][ex];
                }
                else {
                    tmp += dp[i][ex] - dp[i][sx - 1];
                }
            }
            System.out.println(tmp);
        }









    }
}


