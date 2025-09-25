import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int min = Math.min(a,b);
            min = Math.min(min, c);
            System.out.println(min);
        }

    }
}

