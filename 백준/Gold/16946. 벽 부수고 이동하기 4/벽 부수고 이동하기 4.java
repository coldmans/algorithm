import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int []dy = {1, 0, -1, 0};
    static int []dx = {0, 1, 0, -1};

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] graph = new int[N][M];
        int []gray = new int[N*M+100];
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                graph[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));

            }
        }



        Queue<int[]> queue = new ArrayDeque<>();
        int t = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(graph[i][j] == 0){
                    t += 1;
                    queue.add(new int[] {i,j,t});
                    while(!queue.isEmpty()){
                        int []tmp = queue.poll();
                        graph[tmp[0]][tmp[1]] = tmp[2];
                        gray[tmp[2]] += 1;
                        for(int k = 0; k < 4; k++){
                            int y = tmp[0] + dy[k];
                            int x = tmp[1] + dx[k];

                            if(0 <= y && y < N && 0 <= x && x < M && graph[y][x] == 0){
                                graph[y][x] = t;
                                queue.add(new int[]{y,x,t});
                            }
                        }
                    }
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
               if(graph[i][j] == 1){
                   long tt = 0;
                   set.clear();
                   for(int k = 0; k < 4; k++){
                       if(0 <= i + dy[k] && i + dy[k] < N && 0 <= j + dx[k] && j + dx[k] < M){
                           if(!set.contains(graph[i+dy[k]][j+dx[k]])){
                               tt += (gray[graph[i+dy[k]][j+dx[k]]]);
                               set.add(graph[i+dy[k]][j+dx[k]]);
                           }
                       }
                   }
                   System.out.print((tt+1)%10);
               }
               else{
                   System.out.print(0);
               }
            }
            System.out.println();
        }




    }
}
