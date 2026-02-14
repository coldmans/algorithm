import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int [][]graph;
    static int p;
    static int result;
    static void recur(boolean [][]visited, int price, int ctt){
        if(ctt == 3){
            result = Math.min(result, price);
            return;
        }
        for(int i = 1; i < p-1; i++){
            for(int j = 1; j < p-1; j++){
                if(!visited[i][j] && !visited[i+1][j] && !visited[i-1][j] && !visited[i][j-1] && !visited[i][j+1]){
                    visited[i][j] = true;
                    visited[i+1][j] = true;
                    visited[i-1][j] = true;
                    visited[i][j-1] = true;
                    visited[i][j+1] = true;
                    int tmp = graph[i][j] + graph[i+1][j] + graph[i-1][j] + graph[i][j-1] + graph[i][j+1];
                    recur(visited, price + tmp, ctt + 1);
                    visited[i][j] = false;
                    visited[i+1][j] = false;
                    visited[i-1][j] = false;
                    visited[i][j-1] = false;
                    visited[i][j+1] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        p = Integer.parseInt(st.nextToken());
        graph = new int[p][p];
        for(int i = 0; i < p; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < p; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        boolean [][]visited = new boolean[p][p];
        int price = 0;
        int ctt = 0;
        result = Integer.MAX_VALUE;
        recur(visited, price, ctt);

        System.out.println(result);
    }
}
