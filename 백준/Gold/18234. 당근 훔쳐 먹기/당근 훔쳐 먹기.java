import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<long[]> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new long[]{y, x + (long)(M-N) * y});
        }
        list.sort(Comparator.comparing(o -> o[0]));


        long tt = 0;

        for (int i = 0; i < N; i++) {
            long[] t = list.get(i);
            tt += t[1] + t[0] * i;
        }

        System.out.println(tt);


    }
}

