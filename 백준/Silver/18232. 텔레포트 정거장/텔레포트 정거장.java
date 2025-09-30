import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        List<Integer>[]list = new ArrayList[N+1];
        for(int i = 0; i <= N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        Queue<int []> queue = new ArrayDeque<>();
        boolean []visited = new boolean[N+1];
        queue.add(new int []{S,0});
        while(!queue.isEmpty()){
            int []t = queue.poll();

            if(t[0] == E){
                System.out.println(t[1]);
                System.exit(0);
            }

            for(int i = 0; i < list[t[0]].size(); i++){
                if(visited[list[t[0]].get(i)] == false) {
                    visited[list[t[0]].get(i)] = true;
                    queue.add(new int[]{list[t[0]].get(i), t[1] + 1});
                }
            }
            if(t[0]+1 <= N && visited[t[0]+1] == false) {
                visited[t[0]+1] = true;
                queue.add(new int[]{t[0] + 1, t[1] + 1});
            }
            if(t[0] > 1) {
                if(visited[t[0] - 1] == false) {
                    visited[t[0] -1] = true;
                    queue.add(new int[]{t[0] - 1, t[1] + 1});
                }
            }


        }


    }
}

