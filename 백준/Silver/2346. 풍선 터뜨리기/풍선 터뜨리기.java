import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int []dy = {0, -1, 0, 1};
    static int []dx = {1, 0, -1, 0};

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            deque.add(new int[]{Integer.parseInt(st.nextToken()), i});
        }
        while(!deque.isEmpty()){
            int []tmp = deque.pollFirst();
            System.out.print(tmp[1] + " ");
            int x = tmp[0];
            if(deque.isEmpty()){
                System.exit(0);
            }
            if(x > 0){
                for(int i = 0; i < x-1; i++){
                    deque.add(deque.pollFirst());
                }
            }
            else{
                for(int i = 0; i < (x * -1); i++){
                    deque.addFirst(deque.pollLast());
                }
            }
        }

    }
}



