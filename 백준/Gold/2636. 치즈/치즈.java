import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] board = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int time = 0;
        int lastCheeseCount = 0;

        while(true){
            int currentCheeseCount = countCheese(board, N, M);

            if(currentCheeseCount == 0){
                break;
            }

            lastCheeseCount = currentCheeseCount;

            meltCheese(board, N, M);
            time++;
        }
        System.out.println(time);
        System.out.println(lastCheeseCount);
    }

    static int countCheese(int [][] board, int N, int M){
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(board[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    static void meltCheese(int [][] board, int N, int M){
        boolean[][] visited = new boolean[N][M];
        boolean[][] willMelt = new boolean[N][M];

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if((i == 0 || i == N -1 || j == 0 || j == M-1) && board[i][j] == 0){
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while(!queue.isEmpty()){
            int [] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx > 0 && nx < N && ny > 0 && ny < M && !visited[nx][ny]){
                    if(board[nx][ny] == 0){
                        visited[nx][ny] = true;
                        queue.offer(new int[] {nx,ny});
                    }
                    else if(board[nx][ny] == 1){
                        willMelt[nx][ny] = true;
                    }
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(willMelt[i][j]){
                    board[i][j] = 0;
                }
            }
        }
    }

}