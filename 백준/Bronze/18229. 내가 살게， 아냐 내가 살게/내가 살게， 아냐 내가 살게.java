import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [][]arr = new int[N][M];
        int [][]dp = new int[N][M+1];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++){
            dp[i][0] = arr[i][0];
        }

        for(int i = 0; i < N; i++){
            for(int j = 1; j < M; j++){
                dp[i][j] = dp[i][j-1] + arr[i][j];
            }
        }


        for(int j = 0; j < M; j++){
            for(int i = 0; i < N; i++){
                if(dp[i][j] >= K){
                    System.out.println((i+1) + " " + (j+1));
                    System.exit(0);
                }
            }
        }




    }
}

