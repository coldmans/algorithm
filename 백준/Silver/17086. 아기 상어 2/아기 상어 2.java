import java.util.*;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] almond = new int[N][M];
        int [][] res = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                almond[i][j] = sc.nextInt();
                res[i][j] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(almond[i][j] == 1){
                    int [][] visited = new int[N][M];
                    Queue<int []> queue = new ArrayDeque<>();
                    queue.add(new int[]{i,j,0});
                    res[i][j] = 0;
                    visited[i][j] = 1;
                    while(!queue.isEmpty()){
                        int[]wax = queue.poll();
                        int y = wax[0];
                        int x = wax[1];
                        int r = wax[2];
                        for(int k = 0; k < 8; k++){
                            int ey = dy[k] + y;
                            int ex = dx[k] + x;
                            if(0 <= ey && ey < N && 0 <= ex && ex < M && almond[ey][ex] == 0 && res[ey][ex] > r + 1 && visited[ey][ex] == 0){
                                visited[ey][ex] = 1;
                                res[ey][ex] = r + 1;
                                queue.add(new int[]{ey,ex,r+1});
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                max = Math.max(max, res[i][j]);
            }
        }
        System.out.println(max);
    }
}



