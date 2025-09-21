import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k = 0; k < t; k++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int [][]graph = new int[N+1][N+1];
            int []visited = new int[N+1];

            for(int i = 0; i < M; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = 1;
                graph[b][a] = 1;
            }

            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(1);
            int tt = 0;
            while(!queue.isEmpty()){
                int tmp = queue.poll();
                for(int i = 0; i <= N; i++){
                    if(visited[i] == 1) continue;
                    if(graph[tmp][i] == 1){
                        visited[i] = 1;
                        queue.add(i);
                        tt += 1;
                    }
                }
            }
            System.out.println(tt-1);
        }
    }
}

