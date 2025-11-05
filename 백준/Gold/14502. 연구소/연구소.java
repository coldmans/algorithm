import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] vx = new int[]{1, 0, -1, 0};
    static int[] vy = new int[]{0, -1, 0, 1};
    static int max;
    static int b;

    static void recur(int [][]arr, int t){
        if(t == 3){
            boolean [][]visited = new boolean[N][M];
            int res = 0;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(arr[i][j] == 2 && !visited[i][j]){
                        Queue<int []> queue = new ArrayDeque<>();
                        visited[i][j] = true;
                        queue.add(new int[]{i, j});
                        res += 1;
                        while(!queue.isEmpty()){
                            int tmp[] = queue.poll();
                            for(int k = 0; k < 4; k++){
                                int dy = tmp[0] + vy[k];
                                int dx = tmp[1] + vx[k];
                                if(0 <= dy && dy < N && 0 <= dx && dx < M && arr[dy][dx] == 0 && !visited[dy][dx]){
                                    visited[dy][dx] = true;
                                    res += 1;
                                    queue.add(new int[]{dy,dx});
                                }
                            }
                        }
                    }
                }
            }

            max = Math.max(N*M-b-res, max);

            return;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                    recur(arr, t + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int [][] arr = new int[N][M];
        b = 3;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    b += 1;
                }
            }
        }

        recur(arr, 0);

        System.out.println(max);




    }
}
