import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        int res = 0;
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            if(set.contains(x)) res ++;
            else set.add(x);
        }
        System.out.println(res);

    }
}
