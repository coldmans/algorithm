import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;


    static void dfs(int y, int x, int [][]graph, int [][]visited){
        if(y == N-1 && x == M-1){
            System.out.println("Yes");
            System.exit(0);
        }

        if(x < M-1){
            if(graph[y][x+1] == 1 && visited[y][x+1] == 0){
                visited[y][x+1] = 1;
                dfs(y,x+1, graph, visited);
            }
        }

        if(y < N-1){
            if(graph[y+1][x] == 1 && visited[y+1][x] == 0){
                visited[y+1][x] = 1;
                dfs(y+1, x, graph, visited);
            }
        }
    }

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int [][]graph = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int [][]visited= new int[N][M];
        dfs(0,0, graph, visited);

        System.out.println("No");



    }
}

