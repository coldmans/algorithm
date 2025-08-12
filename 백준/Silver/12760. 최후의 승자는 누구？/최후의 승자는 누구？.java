import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int [][] graph = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] row = br.readLine().split(" ");
            Integer[] rows = new Integer[M];
            for(int j = 0; j < M; j++){
                rows[j] = Integer.parseInt(row[j]);
            }
            Arrays.sort(rows,Collections.reverseOrder());
            for(int j = 0; j < M; j++){
                graph[i][j] = rows[j];
            }
        }
        int []score = new int[N];
        for(int i = 0; i < M; i++){
            int max = 0;
            Queue<Integer> queue = new ArrayDeque<>();
            for(int j = 0; j < N; j++){
                if(graph[j][i] > max){
                    queue = new ArrayDeque<>();
                    queue.add(j);
                    max = graph[j][i];
                }
                else if(graph[j][i] == max){
                    queue.add(j);
                }
            }
            while(!queue.isEmpty()){
                int t = queue.poll();
                score[t] += 1;
            }
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int max = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i] > max){
                queue = new ArrayDeque<>();
                queue.add(i);
                max = score[i];
            }
            else if(score[i] == max){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            System.out.print(queue.poll() + 1+ " ");
        }

    }
}
