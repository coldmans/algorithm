import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        for(int t = 0; t < K; t++){
            st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            List<Integer>[] graph = new ArrayList[V+1];
            for(int i = 1; i <= V; i++){
                graph[i] = new ArrayList<>();
            }
            int []visited = new int[V+1];
            boolean isOk = true;

            for(int i = 0; i < E; i++){
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                graph[u].add(v);
                graph[v].add(u);

            }

            Queue<Integer> queue = new ArrayDeque<>();
            for(int r = 1; r <= V; r++) {
                if(visited[r] != 0) continue;
                visited[r] = 2;
                queue.add(r);
                while (!queue.isEmpty()) {
                    if (!isOk) break;
                    int tmp = queue.poll();
                    for (int i = 0; i < graph[tmp].size(); i++) {
                        if (!isOk) break;
                        int tt = graph[tmp].get(i);
                        if (visited[tt] == 0) {
                            if (visited[tmp] == 2) {
                                visited[tt] = 3;
                            } else {
                                visited[tt] = 2;
                            }
                            queue.add(tt);
                        } else {
                            if (visited[tmp] == visited[tt]) {
                                isOk = false;
                            }
                        }

                    }
                }
            }
            if(isOk){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }





    }
}