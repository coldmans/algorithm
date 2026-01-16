import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int []visited;

    public static boolean dfs(int x, int[][]graph, int[]visited, int N, boolean []check){
        for(int i = 1; i <= N; i++){
            if(graph[x][i] == 1 && !check[i]){
                check[i] = true;
                if(visited[i] == 0 || dfs(visited[i], graph, visited, N, check)){
                    visited[i] = x;
                    return true;
                }
            }
        }
        return false;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int test = Integer.parseInt(st.nextToken());

        for(int t = 0; t < test; t++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            visited = new int[N+1];
            int [][]graph = new int[M+1][N+1];


            for(int i = 1; i <= M; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                for(int j = a; j <= b; j++){
                    graph[i][j] = 1;
                }
            }

            for(int i = 1; i <= M; i++){
                boolean []check = new boolean[N+1];
                dfs(i, graph, visited, N, check);
            }
            int ctt = 0;
            for (int i : visited) {
                if(i != 0){
                    ctt++;
                }
            }
            System.out.println(ctt);







        }
    }
}