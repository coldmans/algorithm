import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int []visited;

    public static void dps(int n, int m, List<Integer> list, int step){
        if(list.size() == m){
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if(step > n) return;

        list.add(step);
        dps(n,m,list, step+1);
        list.remove(list.size()-1);
        dps(n,m, list, step+1);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new int[N+1];
        dps(N,M, new ArrayList<>(), 1);



    }
}