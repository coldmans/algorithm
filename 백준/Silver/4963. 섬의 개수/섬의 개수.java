import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] visited;
    static int w;
    static int h;

    public static void dfs(int [][]graph, int y, int x){
        visited[y][x] = 1;
        if(y-1 >= 0 && visited[y-1][x] == 0 && graph[y-1][x] == 1){
            dfs(graph, y-1, x);
        }
        if(x-1 >= 0 && visited[y][x-1] == 0 && graph[y][x-1] == 1){
            dfs(graph,y, x-1);
        }
        if(y + 1 < h && visited[y+1][x] == 0 && graph[y+1][x] == 1){
            dfs(graph,y+1, x);
        }
        if(x + 1 < w && visited[y][x+1] == 0 && graph[y][x+1] == 1){
            dfs(graph,y,x+1);
        }
        if(y-1 >= 0 && x-1 >= 0 && visited[y-1][x-1] == 0 && graph[y-1][x-1] == 1){
            dfs(graph, y-1, x-1);
        }
        if(y-1 >= 0 && x + 1 < w && visited[y-1][x+1] == 0 && graph[y-1][x+1] == 1){
            dfs(graph, y-1, x+1);
        }
        if(y + 1 < h && x-1 >= 0 && visited[y+1][x-1] == 0 && graph[y+1][x-1] == 1){
            dfs(graph, y+1, x-1);
        }
        if(y + 1 < h && x + 1 < w && visited[y+1][x+1] == 0 && graph[y+1][x+1] == 1){
            dfs(graph, y+1, x+1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0){
                break;
            }

            visited = new int[h][w];
            int [][]graph = new int[h][w];
            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int ctt = 0;

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(visited[i][j] == 1 || graph[i][j] == 0) continue;
                    dfs(graph, i, j);
                    ctt += 1;
                }
            }
            System.out.println(ctt);


        }


    }
}