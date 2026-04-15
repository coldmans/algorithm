import java.io.*;
import java.util.*;

public class Main {

    static int []dx = {1, 0, -1, 0, 1, 1, -1, -1};
    static int []dy = {0, 1, 0, -1, -1, 1, 1, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][]graph = new int[N][M];
        boolean [][]visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j]){
                    boolean isPeak = true;
                    visited[i][j] = true;

                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});

                    while(!queue.isEmpty()){
                        int []tmp = queue.poll();
                        int curY = tmp[0];
                        int curX = tmp[1];

                        for(int k = 0; k < 8; k++){
                            int ny = curY + dy[k];
                            int nx = curX + dx[k];

                            if(0 <= ny && ny < N && 0 <= nx && nx < M){

                                if(graph[ny][nx] > graph[curY][curX]){
                                    isPeak = false;
                                }
                                else if(graph[ny][nx] == graph[curY][curX] && !visited[ny][nx]){
                                    visited[ny][nx] = true;
                                    queue.add(new int[]{ny, nx});
                                }
                            }
                        }
                    }

                    if(isPeak){
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}