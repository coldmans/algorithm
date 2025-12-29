import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] H = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) H[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long totalWeight = 0L;

        int MAX = 200000;
        long[] sum = new long[MAX + 2]; // height별 W 합 (long!)

        for (int i = 0; i < N; i++) {
            long w = Long.parseLong(st.nextToken());
            totalWeight += w;
            sum[H[i]] += w;
        }

        long answer = 0L;
        long currentWidth = totalWeight;

        for (int h = 1; h <= MAX; h++) {
            answer = Math.max(answer, (long) h * currentWidth);
            currentWidth -= sum[h]; // 높이 h인 애들은 다음(h+1)부터 못 씀
        }

        System.out.println(answer);
    }
}