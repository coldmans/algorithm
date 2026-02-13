import java.io.*;
import java.util.*;

public class Main {

    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, -1, 0, 1};

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Character [][]graph = new Character[R][C];

        int jy = -1;
        int jx = -1;
        Queue<int []> queue = new ArrayDeque<>();
        int [][] tal = new int[R][C];
        boolean [][]visited = new boolean[R][C];

        for(int i = 0; i < R; i++){
            String tmp = br.readLine();
            for(int j = 0; j < C; j++){
                graph[i][j] = tmp.charAt(j);
                if(graph[i][j] == 'F'){
                    tal[i][j] = 1;
                    visited[i][j] = true;
                    queue.add(new int[]{i,j,1});
                }
                if(graph[i][j] == 'J'){
                    jy = i;
                    jx = j;
                }
            }
        }







        while(!queue.isEmpty()){
            int []tmp = queue.poll();
            for(int k = 0; k < 4; k++){
                int y = tmp[0] + dy[k];
                int x = tmp[1] + dx[k];

                if(0 <= y && y < R && 0 <= x && x < C && graph[y][x] != '#' && !visited[y][x]){
                    visited[y][x] = true;
                    tal[y][x] = tmp[2] + 1;
                    queue.add(new int[]{y,x,tmp[2]+1});
                }
            }
        }
        queue.clear();

        queue.add(new int[] {jy,jx,1});
        boolean [][]visited2 = new boolean[R][C];
        visited2[jy][jx] = true;

        while(!queue.isEmpty()){
            int []tmp = queue.poll();
            if(tmp[0] == R-1 || tmp[1] == C - 1 || tmp[0] == 0 || tmp[1] == 0){
                System.out.println(tmp[2]);
                System.exit(0);
            }

            for(int k = 0; k < 4; k++){
                int y = tmp[0] + dy[k];
                int x = tmp[1] + dx[k];

                if(0 <= y && y < R && 0 <= x && x < C && graph[y][x] != '#' && !visited2[y][x]){
                    if((tal[y][x] != 0 && tal[y][x] > tmp[2] + 1) || tal[y][x] == 0) {
                        visited2[y][x] = true;
                        queue.add(new int[]{y, x, tmp[2] + 1});
                    }
                }
            }

        }


        System.out.println("IMPOSSIBLE");




    }
}