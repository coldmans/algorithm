import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][]arr = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        int t = Integer.parseInt(br.readLine());
        int []tmp = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < t; i++){
            int w = Integer.parseInt(st.nextToken());
            tmp[w] = 1;
        }

        int []res = new int[N+1];

        for(int i = 1; i <= N; i++){
            if(tmp[i] == 0){
                res[i] = 1;
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(tmp[i] == 1 && arr[i][j] == 1 && tmp[j] == 0){
                    res[i] = 1;
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new ArrayDeque<>();
        int r = 0;
        for(int i = 1; i <= N; i++){
            if(res[i] == 0){

                queue.add(i);
                sb.append(i + " ");
                tmp[i] = 0;
                r++;
            }
        }
        while(!queue.isEmpty()){
            int tt = queue.poll();
            for(int i = 1; i <= N; i++){
                if(arr[tt][i] == 1 && tmp[i] == 1){
                    tmp[i] = 0;
                }
            }
        }

        for(int i = 1; i <= N; i++){
            if(tmp[i] == 1){
                System.out.println(-1);
                System.exit(0);
            }
        }

        System.out.println(r);
        System.out.println(sb);







    }
}

