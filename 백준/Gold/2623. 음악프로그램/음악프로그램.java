import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][]graph = new int[N+1][N+1];
        int []isReal = new int[N+1];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i < M; i++){
            String input[] = br.readLine().split(" ");
            queue.add(Integer.parseInt(input[1]));
            for(int j = 2; j < input.length; j++){
                int y = Integer.parseInt(input[j-1]);
                int x = Integer.parseInt(input[j]);
                isReal[y] = 1;
                isReal[x] = 1;
                graph[y][x] = 1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            if(isReal[i] == 0){
                list.add(i);
            }
        }
        while(!queue.isEmpty()){

            int x = queue.poll();
            if(list.contains(x)) continue;
            boolean real = false;
            for(int i = 1; i <= N; i++){
                if(graph[i][x] == 1){
                    real = true;
                    break;
                }
            }

            if(real){
                continue;
            }
            
            list.add(x);
            for(int i = 1; i <= N; i++){
                if(graph[x][i] == 1){
                    queue.add(i);
                    graph[x][i] = 0;
                }
            }
        }
        if(list.size() < N){
            System.out.println(0);
        }
        else {
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }
}
