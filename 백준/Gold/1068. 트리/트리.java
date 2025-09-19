import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int [][]graph;
    static int N;
    static int res = 0;
    static void recur(int x, int b){
        graph[b][x] = 0;
        for(int i = 0; i <= N; i++){
            if(graph[x][i] == 1){
                recur(i, x);
            }
        }
    }

    static void dfs(int x, int f){
        boolean g = false;
        for(int i = 0; i < N; i++){
            if(graph[x][i] == 1 && i != f){
                dfs(i,x);
                g = true;
            }
        }
        if(!g){
            res += 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        int ki = -1;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int k = Integer.parseInt(st.nextToken());
            if(k == -1){
                graph[i][i] = 1;
                ki = i;
            }
            else{
                graph[k][i] = 1;
            }
        }
        int l = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            if(graph[i][l] == 1){
                recur(l,i);
                break;
            }
        }


        for(int i = 0; i < N; i++){
            if(graph[ki][i] == 1){
                dfs(ki,ki);
                break;
            }
        }


        System.out.println(res);




    }
}