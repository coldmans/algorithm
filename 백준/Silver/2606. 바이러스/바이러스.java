import java.io.*;
import java.util.*;

public class Main {
    static int result = 0;
    static int n;
    static int m;
    static int [][]graph;
    static boolean []visited;
    static void recur(int x){
        result += 1;
        for(int i = 1; i <= n; i++){
            if(graph[x][i] == 1 && !visited[i]){
                visited[i] = true;
                recur(i);
            }
        }
    }
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        visited[1] = true;
        recur(1);
        System.out.println(result - 1);



    }
}
