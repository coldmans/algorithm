import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int []dy = {0, 0, 1, -1};
    static int []dx = {-1, 1, 0, 0};


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ry = -1;
        int rx = -1;
        int by = -1;
        int bx = -1;
        char[][] graph = new char[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = s.charAt(j);
                if (graph[i][j] == 'R') {
                    ry = i;
                    rx = j;
                    graph[i][j] = '.';
                } else if (graph[i][j] == 'B') {
                    by = i;
                    bx = j;
                    graph[i][j] = '.';
                }
            }
        }


        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{ry, rx, by, bx, 0});

        while (!queue.isEmpty()) {

            int[] t = queue.poll();
            int nry = t[0];
            int nrx = t[1];
            int nby = t[2];
            int nbx = t[3];
            if (t[4] > 9) {
                continue;
            }

            for (int k = 0; k < 4; k++) {
                boolean bf = false;
                if ((k == 0 && nbx < nrx) || (k == 1 && nbx > nrx) || (k == 2 && nby > nry) || (k == 3 && nby < nry)) {
                    bf = true;
                }
                boolean isjot = false;
                boolean isgood = false;
                if ((0 <= nry + dy[k] && nry + dy[k] < N && 0 <= nrx + dx[k] && nrx + dx[k] < M && graph[nry + dy[k]][nrx + dx[k]] != '#') || (0 <= nby + dy[k] && nby + dy[k] < N && 0 <= nbx + dx[k] && nbx + dx[k] < M && graph[nby + dy[k]][nbx + dx[k]] != '#')) {
                    int ctt = 1;
                    int ctt2 = 1;
                    if (bf == false) {
                        while (0 <= nry + dy[k] * ctt && nry + dy[k] * ctt < N && 0 <= nrx + dx[k] * ctt && nrx + dx[k] * ctt < M && graph[nry + dy[k] * ctt][nrx + dx[k] * ctt] != '#') {
                            if (nby + dy[k] * ctt2 == nry + dy[k] * ctt && nrx + dx[k] * ctt == nbx + dx[k] * ctt2) {
                                break;
                            }
                            if (graph[nry + dy[k] * ctt][nrx + dx[k] * ctt] == 'O') {
                                isgood = true;
                                ctt += 1;
                                break;
                            }
                            ctt += 1;
                        }
                        ctt -= 1;
                    }
                    while (0 <= nby + dy[k] * ctt2 && nby + dy[k] * ctt2 < N && 0 <= nbx + dx[k] * ctt2 && nbx + dx[k] * ctt2 < M && graph[nby + dy[k] * ctt2][nbx + dx[k] * ctt2] != '#') {
                        if (nby + dy[k] * ctt2 == nry + dy[k] * ctt && nrx + dx[k] * ctt == nbx + dx[k] * ctt2 && !isgood) {
                            break;
                        }
                        if (graph[nby + dy[k] * ctt2][nbx + dx[k] * ctt2] == 'O') {
                            isjot = true;
                            break;
                        }
                        ctt2 += 1;
                    }
                    ctt2 -= 1;

                    if (bf == true) {
                        ctt = 1;
                        while (0 <= nry + dy[k] * ctt && nry + dy[k] * ctt < N && 0 <= nrx + dx[k] * ctt && nrx + dx[k] * ctt < M && graph[nry + dy[k] * ctt][nrx + dx[k] * ctt] != '#') {
                            if (nby + dy[k] * ctt2 == nry + dy[k] * ctt && nrx + dx[k] * ctt == nbx + dx[k] * ctt2) {
                                break;
                            }
                            if (graph[nry + dy[k] * ctt][nrx + dx[k] * ctt] == 'O') {
                                isgood = true;
                                ctt += 1;
                                break;
                            }
                            ctt += 1;
                        }
                        ctt -= 1;
                    }

                    if (isjot) {
                        continue;
                    }
                    if (isgood) {
                        System.out.println(t[4] + 1);
                        System.exit(0);
                    }

                    queue.add(new int[]{nry + dy[k] * ctt, nrx + dx[k] * ctt, nby + dy[k] * ctt2, nbx + dx[k] * ctt2, t[4] + 1});

                }
            }

        }
        System.out.println(-1);
    }
}
