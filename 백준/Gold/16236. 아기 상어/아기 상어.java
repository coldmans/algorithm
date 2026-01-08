import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    static int []dy = {-1, 0, 0, 1}; // 상, 좌, 우, 하 (문제의 우선순위와 다를 수 있으므로 비교 로직 중요)
    static int []dx = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [][]li = new int[N][N];
        int bsy = -1;
        int bsx = -1;
        
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                li[i][j] = Integer.parseInt(st.nextToken());
                if(li[i][j] == 9){
                    bsy = i;
                    bsx = j;
                    li[i][j] = 0;
                }
            }
        }
        
        int rsize = 2;
        int rcc = 0;
        int res = 0; // 총 걸린 시간

        // 반복적으로 먹이를 찾으러 감
        while (true) {
            Queue<int[]> queue = new ArrayDeque<>();
            queue.add(new int[]{bsy, bsx, 0}); // y, x, dist
            boolean [][]visited = new boolean[N][N];
            visited[bsy][bsx] = true;

            // 먹을 수 있는 물고기 후보 중 가장 좋은 것 저장
            int minY = Integer.MAX_VALUE;
            int minX = Integer.MAX_VALUE;
            int minDist = Integer.MAX_VALUE;

            while (!queue.isEmpty()){
                int []tmp = queue.poll();
                int y = tmp[0];
                int x = tmp[1];
                int dist = tmp[2];

                // 이미 찾은 최단 거리보다 더 멀리 가려고 하면 탐색 중단 (BFS 특성상 거리는 오름차순)
                if (dist > minDist) break;

                // 먹을 수 있는 물고기 발견 (빈칸 아니고, 내 사이즈보다 작음)
                if (li[y][x] != 0 && li[y][x] < rsize) {
                    // 조건: 거리가 같으면 가장 위(y 작음), 그 다음 가장 왼쪽(x 작음)
                    if (dist < minDist) {
                        minDist = dist;
                        minY = y;
                        minX = x;
                    } else if (dist == minDist) {
                        if (y < minY) {
                            minY = y;
                            minX = x;
                        } else if (y == minY) {
                            if (x < minX) {
                                minX = x;
                            }
                        }
                    }
                    continue; // 먹이를 찾았으니 더 깊이 들어가지 않음 (해당 경로 종료)
                }

                for(int k = 0; k < 4; k++){
                    int ty = dy[k] + y;
                    int tx = dx[k] + x;
                    // 이동 가능 조건: 범위 안 + 방문X + (빈칸 or 나랑 크기 같거나 작음)
                    if(0<= ty && ty < N && 0 <= tx && tx < N && !visited[ty][tx] && li[ty][tx] <= rsize){
                        visited[ty][tx] = true;
                        queue.add(new int[]{ty, tx, dist + 1});
                    }
                }
            }

            // 먹을 물고기를 찾지 못했으면 엄마 상어 부르러 감 (종료)
            if (minDist == Integer.MAX_VALUE) {
                break;
            }

            // 먹이 섭취 처리
            res += minDist; // 거리만큼 시간 누적
            rcc++;
            if(rcc == rsize){
                rsize++;
                rcc = 0;
            }
            li[minY][minX] = 0; // 물고기 없앰
            bsy = minY; // 상어 위치 이동
            bsx = minX;
        }

        System.out.println(res);
    }
}