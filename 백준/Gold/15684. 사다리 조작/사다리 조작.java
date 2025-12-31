import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static int H;
    static int res;

    public static boolean check(int [][]graph){
        for(int j = 0; j < N; j++){
            int i = 0;
            int k = j;
            while(i < H){
                if(k == 0){
                    if(graph[i][k] == 1){
                        k += 1;
                    }
                }
                else if(k == N -1){
                    if(graph[i][k-1] == 1){
                        k -= 1;
                    }
                }
                else{
                    if(graph[i][k] == 1){
                        k += 1;
                    }
                    else if(graph[i][k-1] == 1){
                        k -= 1;
                    }
                }
                i += 1;
            }
            if(j != k){
                return false;
            }
        }
        return true;
    }

    public static void dfs(int[][] graph, int ctt){
        if(ctt > 3){
            return;
        }
        if(check(graph) && res > ctt){
            res = ctt;
        }
        if(ctt < 3 && res > ctt) {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < N - 1; j++) {
                    if (graph[i][j] == 1) continue;
                    if (j > 0 && graph[i][j - 1] == 1) continue;
                    if (j < N - 2 && graph[i][j + 1] == 1) continue;
                    graph[i][j] = 1;
                    dfs(graph, ctt + 1);
                    graph[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        int [][]graph = new int[H][N-1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            graph[a][b] = 1;
        }
        res = 999;
        dfs(graph, 0);
        if(res == 999) System.out.println(-1);
        else {
            System.out.println(res);
        }



    }
}