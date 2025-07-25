import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int [] way = {2, 2, 1, -1, -2, -2, -1, 1};
    static int [] wax = {-1, 1, 2, 2, 1, -1, -2, -2};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int N = sc.nextInt();
            int [][] graph = new int[N][N];
            boolean [][] visited = new boolean[N][N];
            int sy = sc.nextInt();
            int sx = sc.nextInt();
            int ey = sc.nextInt();
            int ex = sc.nextInt();

            Queue<int []> queue = new LinkedList<>();
            queue.add(new int[]{sy,sx, 0});
            visited[sy][sx] = true;
            while(!queue.isEmpty()){
                int tmp[] = queue.poll();
                int ddy = tmp[0];
                int ddx = tmp[1];
                if(ddy == ey && ddx == ex){
                    System.out.println(tmp[2]);
                    break;
                }
                for(int j = 0; j < 8; j++){
                    int dy = ddy + way[j];
                    int dx = ddx + wax[j];
                    if(0 <= dy && dy < N && 0 <= dx && dx < N && visited[dy][dx] == false){
                        visited[dy][dx] = true;
                        queue.add(new int[]{dy, dx, tmp[2] + 1});
                    }
                }

            }
        }


    }
}

