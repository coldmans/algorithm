import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Edge{
    int v1;
    int v2;
    int weight;

    public Edge(int v1, int v2, int weight){
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public int Comparable(Edge e){
        return this.weight - e.weight;
    }
}

public class Main {
    static StringTokenizer st;
    static PriorityQueue<Edge> queue;
    static int []parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        queue = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        parent = new int[N+1];

        for(int i = 1; i <= N; i++){
            parent[i] = i;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            queue.add(new Edge(v1, v2, weight));
        }

        long totalCost = 0;
        int maxEdgeWeight = 0;
        int edgesCount = 0;

        while(!queue.isEmpty() && edgesCount < N - 1){
            Edge edge = queue.poll();

            if(find(edge.v1) != find(edge.v2)){
                union(edge.v1, edge.v2);
                totalCost += edge.weight;
                maxEdgeWeight = Math.max(maxEdgeWeight, edge.weight);
                edgesCount++;
            }
        }
        System.out.println(totalCost - maxEdgeWeight);
    }

    static void union(int v1, int v2){
        v1 = find(v1);
        v2 = find(v2);
        if(v1 < v2){
            parent[v2] = v1;
        }
        else parent[v1] = v2;
    }

    static int find(int v){
        if(parent[v] == v) return v;
        return parent[v] = find(parent[v]);
    }
}

