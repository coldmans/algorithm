import java.io.*;
import java.util.*;

public class Main {

    static String bfs(int start, int target) {
        boolean[] visited = new boolean[10000];
        String[] path = new String[10000];

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        path[start] = "";

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == target) return path[cur];

            // D
            int d = (cur * 2) % 10000;
            if (!visited[d]) {
                visited[d] = true;
                path[d] = path[cur] + "D";
                q.add(d);
            }

            // S
            int s = (cur == 0) ? 9999 : cur - 1;
            if (!visited[s]) {
                visited[s] = true;
                path[s] = path[cur] + "S";
                q.add(s);
            }

            // L
            int l = (cur % 1000) * 10 + (cur / 1000);
            if (!visited[l]) {
                visited[l] = true;
                path[l] = path[cur] + "L";
                q.add(l);
            }

            // R
            int r = (cur % 10) * 1000 + (cur / 10);
            if (!visited[r]) {
                visited[r] = true;
                path[r] = path[cur] + "R";
                q.add(r);
            }
        }

        return "";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder result = new StringBuilder();

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            result.append(bfs(start, target)).append("\n");
        }

        System.out.print(result);
    }
}