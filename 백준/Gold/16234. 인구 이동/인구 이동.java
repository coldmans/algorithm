import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    static int[] xb = {1, 0, -1, 0};
    static int[] yb = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int [][]arr = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }



        int g = 0;
        while(true) {
            boolean visited[][] = new boolean[N][N];
            Queue<int[]> queue = new ArrayDeque<>();
            Queue<int[]> queue2 = new ArrayDeque<>();
            int [][]arr2 = arr.clone();
            boolean isTrue = false;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i][j]) continue;
                    int ctt = 0;
                    int res = 0;

                    queue.add(new int[]{i, j, arr[i][j]});
                    queue2.add(new int[]{i, j});
                    visited[i][j]=true;

                    while (!queue.isEmpty()) {
                        int t[] = queue.poll();
                        ctt += 1;
                        res += arr[t[0]][t[1]];

                        for (int k = 0; k < 4; k++) {
                            int ty = t[0] + yb[k];
                            int tx = t[1] + xb[k];
                            if (t[0] + yb[k] >= 0 && t[0] + yb[k] < N && t[1] + xb[k] >= 0 && t[1] + xb[k] < N && !visited[ty][tx]) {
                                if ((arr[ty][tx] - arr[t[0]][t[1]] >= L && arr[ty][tx] - arr[t[0]][t[1]] <= R) || (arr[t[0]][t[1]] - arr[ty][tx] >= L && arr[t[0]][t[1]] - arr[ty][tx] <= R)) {
                                    visited[ty][tx] = true;
                                    queue.add(new int[]{t[0] + yb[k], t[1] + xb[k], arr[t[0] + yb[k]][t[1] + xb[k]]});
                                    queue2.add(new int[]{ty, tx});
                                }
                            }
                        }
                    }

                    while (!queue2.isEmpty()) {
                        int t[] = queue2.poll();
                        arr2[t[0]][t[1]] = res / ctt;
                    }
                    if(ctt > 1) isTrue = true;

                }
            }

            arr = arr2.clone();

            if(!isTrue) break;
            g += 1;
        }
        System.out.println(g);

    }
}
