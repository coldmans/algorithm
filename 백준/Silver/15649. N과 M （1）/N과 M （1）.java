import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int []visited;

    public static void dps(int n, int m, List<Integer> list){
        if(list.size() == m){
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i] == 1) continue;
            visited[i] = 1;
            list.add(i);
            dps(n, m, list);
            list.remove(list.size()-1);
            visited[i] = 0;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        dps(N,M, new ArrayList<>());



    }
}