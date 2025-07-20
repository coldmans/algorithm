 import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int [] dx = {1, 0, 0, -1};
    static int [] dy = {0, 1, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] graph = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MAX_VALUE;
        int [][] visited = new int[N][N];

        int ctt = 2;
        Queue<int []> queue = new LinkedList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] == 1){
                    queue.add(new int[]{i,j});
                    visited[i][j] = 1;
                    graph[i][j] = ctt;
                    while(!queue.isEmpty()){
                        int []wax = queue.poll();
                        int y = wax[0];
                        int x = wax[1];
                        for(int k = 0; k < 4; k++){
                            int ddx = dx[k] + x;
                            int ddy = dy[k] + y;
                            if(0 <= ddx && ddx < N && 0 <= ddy && ddy < N && visited[ddy][ddx] == 0 && graph[ddy][ddx] == 1){
                                graph[ddy][ddx] = ctt;
                                visited[ddy][ddx] = 1;
                                queue.add(new int[]{ddy,ddx});
                            }
                        }
                    }
                    ctt += 1;
                }
            }
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] > 1){
                    queue.add(new int[]{i,j,0,graph[i][j]});
                    int [][]visited2 = new int[N][N];
                    while(!queue.isEmpty()){
                        int []wax = queue.poll();
                        int y = wax[0];
                        int x = wax[1];
                        int count = wax[2];
                        int res = wax[3];
                        visited2[y][x] = 1;

                        for(int k = 0; k < 4; k++){
                            int ddx = dx[k] + x;
                            int ddy = dy[k] + y;
                            if(0 <= ddx && ddx < N && 0 <= ddy && ddy < N && graph[ddy][ddx] != res && visited2[ddy][ddx] == 0){
                                if(graph[ddy][ddx] != 0){
                                    max = Math.min(max, count);
                                    break;
                                }
                                visited2[ddy][ddx] = 1;
                                queue.add(new int[]{ddy,ddx,count+1,res});
                            }
                        }
                    }
                }
            }
        }


        System.out.println(max);


    }
}
