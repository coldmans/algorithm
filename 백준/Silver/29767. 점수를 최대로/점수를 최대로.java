import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long []kyo = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            kyo[i] = Long.parseLong(st.nextToken());
        }

        List<Long> dp = new ArrayList<>();
        dp.add(kyo[0]);
        for(int i = 1; i < N; i++){
            dp.add(kyo[i] + dp.get(i-1));
        }
        Collections.sort(dp, Collections.reverseOrder());

        long res = 0;
        for(int i = 0; i < K; i++){
            res += dp.get(i);
        }
        System.out.println(res);



    }
}
