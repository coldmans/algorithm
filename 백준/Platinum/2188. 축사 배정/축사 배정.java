import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static int M;
    static int [][]graph;
    static int []visited;
    public static boolean dfs(int x, boolean []check){
        for(int i = 1; i <= M; i++){
            if(graph[x][i] == 1){
                if(!check[i]){
                    check[i] = true;
                    if(visited[i] == 0 || dfs(visited[i], check)){
                        visited[i] = x;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N+1][M+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            for(int j = 0; j < x; j++){
                int u = Integer.parseInt(st.nextToken());
                graph[i][u] = 1;
            }
        }

        visited = new int[M+1];
        for(int i = 1; i <= N; i++){
            boolean []checked = new boolean[M+1];
            dfs(i,checked);
        }

        int ctt = 0;

        for(int i = 1; i <= M; i++){
            if(visited[i] != 0){
                ctt++;
            }
        }

        System.out.println(ctt);



    }
}