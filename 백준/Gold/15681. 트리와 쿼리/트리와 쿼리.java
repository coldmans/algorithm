import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int dfs(int x, ArrayList<Integer> []graph, boolean []visited, int []tmp){
        visited[x] = true;
        int ctt = 1;
        for(int i = 0; i < graph[x].size(); i++){
            if(visited[graph[x].get(i)] != true){
                ctt += dfs(graph[x].get(i), graph, visited, tmp);
            }
        }
        tmp[x] = ctt;
        return ctt;
    }

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        ArrayList<Integer> []graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < N - 1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean []visited = new boolean[N+1];
        int []tmp = new int[N+1];

        dfs(R, graph, visited,tmp);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Q; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            sb.append(tmp[t] + "\n");
        }
        System.out.println(sb);

    }
}

