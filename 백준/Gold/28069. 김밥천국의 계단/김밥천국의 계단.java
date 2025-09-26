import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Queue<int[]> queue = new ArrayDeque<>();

        int []visited = new int[3000000];
        queue.add(new int[]{1,1});
        while(!queue.isEmpty()){
            int []t = queue.poll();
            visited[t[0]] = t[1];
            if(t[0] < a){
                if(visited[t[0] + t[0]/2] == 0 && t[0] + t[0]/2 > t[0]) {
                    visited[t[0] + t[0]/2] = t[1] + 1;
                    queue.add(new int[]{t[0] + t[0] / 2, t[1] + 1});
                }
                if(visited[t[0] + 1] == 0) {
                    visited[t[0] + 1] = t[1] + 1;
                    queue.add(new int[]{t[0] + 1, t[1] + 1});
                }
            }
        }

        if(visited[a] <= b){
            System.out.println("minigimbob");
        }
        else{
            System.out.println("water");
        }


    }
}

