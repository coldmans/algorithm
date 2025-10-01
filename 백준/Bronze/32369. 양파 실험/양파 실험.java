import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int c = 1;
        int b = 1;

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            c += A;
            b += B;
            if(b > c){
                int tmp = c;
                c = b;
                b = tmp;
            }
            if(b == c){
                b -= 1;
            }
        }
        System.out.println(c + " " + b);
    }
}

