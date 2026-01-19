import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());

        int [][]graph = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp == 1){
                    graph[i][j] = tmp;
                }
            }
        }
        

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int t = list.get(0);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(t);
        boolean []visited = new boolean[N+1];
        visited[t] = true;
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i <= N; i++){
                if(graph[tmp][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        boolean ok = false;

        for(int i = 0; i < M; i++){
            if(visited[list.get(i)] == false){
                ok = true;
                break;
            }
        }



        if(ok){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }



    }
}