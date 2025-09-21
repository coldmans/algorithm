import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int min = first;
        int ans = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(0).append(" ");

        for (int i = 1; i < n; i++) {
            int t = Integer.parseInt(st.nextToken());
            ans = Math.max(ans, t - min);
            min = Math.min(min, t);
            sb.append(ans).append(" ");
        }
        System.out.println(sb);
    }
}