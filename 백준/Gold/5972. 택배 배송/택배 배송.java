import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<int []>[] graph = new ArrayList[N+1];

        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }


        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new int[]{b,c});
            graph[b].add(new int[]{a,c});
        }

        int []dist = new int[N+1];
        for(int i = 0; i <= N; i++){
            dist[i] = 100000000;
        }

        PriorityQueue<int[]> queue =
                new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        queue.add(new int[]{0,1});
        dist[1] = 0;

        while(!queue.isEmpty()){
            int []tmp = queue.poll();
            int now = tmp[1];
            int cost = tmp[0];

            if (cost > dist[now]) continue;

            for(int i = 0; i < graph[now].size(); i++){
                if(dist[graph[now].get(i)[0]] > cost + graph[now].get(i)[1]){
                    dist[graph[now].get(i)[0]] = cost + graph[now].get(i)[1];
                    queue.add(new int[]{dist[graph[now].get(i)[0]], graph[now].get(i)[0]});
                }
            }
        }

        System.out.println(dist[N]);



    }
}