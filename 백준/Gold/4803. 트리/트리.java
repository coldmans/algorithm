import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static boolean no;

    static void recur(int []visited, int x, int n, int [][]graph, int p){
        for(int i = 1; i <= n; i++){
            if(graph[x][i] == 1 && p != i){
                if(visited[i] == 0) {
                    visited[i] = 1;
                    recur(visited, i, n, graph, x);
                }
                else{
                    no = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = 1;
        while (true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m == 0){
                break;
            }
            int [][]graph = new int[n+1][n+1];
            for(int i = 0; i < m; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[x][y] = 1;
                graph[y][x] = 1;
            }
            int res = 0;
            int []visited = new int[n+1];
            for(int i = 1; i <= n; i++){
                if(visited[i] == 0){
                    res += 1;
                    no = false;
                    recur(visited, i, n, graph, i);
                    if(no == true){
                        res -= 1;
                    }
                    no = false;
                }
            }
            if(res > 1){
                System.out.println("Case " + l + ": " + "A forest of " + res +" trees.");
            }
            else if(res == 1){
                System.out.println("Case " + l + ": " + "There is one tree.");
            }
            else{
                System.out.println("Case " + l + ": " + "No trees.");
            }
            l++;
        }


    }
}