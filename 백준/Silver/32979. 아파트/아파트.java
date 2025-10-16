import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2 * N; i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            int x = Integer.parseInt(st.nextToken());
            for(int j = 0; j < x-1; j++){
                queue.add(queue.pollFirst());
            }
            System.out.print(queue.peek() + " ");
        }



    }
}
