import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int d = 0;
    static int []dy = {0, 1, 0, -1};
    static int []dx = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] graph = new int[N][N];
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i++){
            String []input = br.readLine().split(" ");
            int y = Integer.parseInt(input[0]) - 1;
            int x = Integer.parseInt(input[1]) - 1;
            graph[y][x] = 100;
        }

        int []dir = new int[10001];
        int L = Integer.parseInt(br.readLine());
        for(int i = 0; i < L; i++){
            String []input = br.readLine().split(" ");
            int y = Integer.parseInt(input[0]);
            String x = input[1];
            if(x.equals("D")){
                dir[y] = 1;
            }
            else if(x.equals("L")){
                dir[y] = -1;
            }
        }
        int ctt = 0;
        Queue<int []> queue = new ArrayDeque<>();
        int sy = 0;
        int sx = 0;
        graph[sy][sx] = 1;
        
        while(true){
            ctt += 1;
            int y = sy + dy[d];
            int x = sx + dx[d];

            if(0 <= y && y < N && 0 <= x && x < N && (graph[y][x] == 0 || graph[y][x] == 100)){
                if(graph[y][x] == 100){
                    graph[y][x] = 1;
                    queue.add(new int[] {sy,sx});
                }
                else{
                    graph[y][x] = 1;
                    queue.add(new int[] {sy,sx});
                    int []tmp = queue.poll();
                    graph[tmp[0]][tmp[1]] = 0;
                }
                sy = y;
                sx = x;
            }
            else{
                break;
            }
            if(dir[ctt] != 0){
                if(dir[ctt] == 1){
                    d += 1;
                    if(d == 4){
                        d = 0;
                    }
                }
                else if(dir[ctt] == -1){
                    d -= 1;
                    if(d == -1){
                        d = 3;
                    }
                }
            }
        }
        System.out.println(ctt);


    }
}


