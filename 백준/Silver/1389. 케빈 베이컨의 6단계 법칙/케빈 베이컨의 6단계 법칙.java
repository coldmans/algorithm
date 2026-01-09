import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr = new int[N+1][N+1];

        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N; j++){
                arr[i][j] = 10000000;
            }
            arr[i][i] = 0;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());
            int tmp2 = Integer.parseInt(st.nextToken());
            arr[tmp][tmp2] = 1;
            arr[tmp2][tmp] = 1;
        }

        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(arr[j][i] + arr[k][i] <= arr[k][j]){
                        arr[k][j] = arr[j][i] + arr[k][i];
                        arr[j][k] = arr[j][i] + arr[k][i];
                    }
                }
            }
        }
        int min = 500000000;
        int minNum = -1;
        for(int i = 1; i <= N; i++){
            int tmp = 0;
            for(int j = 1; j <= N; j++){
                tmp += arr[i][j];
            }
            if(tmp < min){
                min = tmp;
                minNum = i;
            }
        }

        System.out.println(minNum);


    }
}