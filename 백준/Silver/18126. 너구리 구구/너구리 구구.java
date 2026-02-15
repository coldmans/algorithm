import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int [][]graph = new int[N+1][N+1];
        for(int i = 0; i < N - 1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = c;
            graph[b][a] = c;
        }
        boolean []visited = new boolean[N+1];
        visited[1] = true;
        Queue<long[]> queue = new ArrayDeque<>();
        queue.add(new long[]{1,0});
        long sum = 0;

        while(!queue.isEmpty()){
            long []tmp = queue.poll();
            sum = Math.max(sum, tmp[1]);
            for(int i = 1; i <= N; i++){
                if(graph[(int) tmp[0]][i] != 0 && !visited[i]){
                    visited[i] = true;
                    queue.add(new long[]{i, graph[(int)tmp[0]][i] + tmp[1]});
                }
            }
        }

        System.out.println(sum);

    }
}
