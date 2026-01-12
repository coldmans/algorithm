import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[] time = new int[100001];
    static int[] parent = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        

        if (K == N) {
            System.out.println(0);
            System.out.println(N);
            System.exit(0);
        }

       
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(K);
        time[K] = 1; 

        while (!queue.isEmpty()) {
            int now = queue.poll();
            
            if (now == N) break;
            
            if (now % 2 == 0) {
                int next = now / 2;
                if (next <= 100000 && time[next] == 0) {
                    time[next] = time[now] + 1;
                    parent[next] = now; 
                    queue.add(next);
                }
            }

            
            if (true) { 
                int next = now + 1;
                if (next <= 100000 && time[next] == 0) {
                    time[next] = time[now] + 1;
                    parent[next] = now;
                    queue.add(next);
                }
            }

            
            if (true) {
                int next = now - 1;
                if (next >= 0 && time[next] == 0) { 
                    time[next] = time[now] + 1;
                    parent[next] = now;
                    queue.add(next);
                }
            }
        }
        

        StringBuilder sb = new StringBuilder();
        sb.append(time[N] - 1).append("\n"); 

        int index = N;
        while (true) {
            sb.append(index).append(" ");
            if (index == K) break;
            index = parent[index];
        }

        System.out.println(sb);
    }
}