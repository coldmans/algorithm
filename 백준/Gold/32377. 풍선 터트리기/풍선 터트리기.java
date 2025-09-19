import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        long max = Math.max(x,y);
        max = Math.max(max, z);

        long i = 1;
        long j = max * N;

        while(i < j){
            long mid = (i + j)/2;
            long t = mid / x + mid / y + mid / z;
            if(t < N){
                i = mid + 1;
            }
            else if(t >= N){
                j = mid;
            }

        }
        i -= 1;
        long tt = N - (i/x + i/y + i/z);
        i += 1;
        int tmp = 0;

        if(i % x == 0){
            tmp += 1;
            if(tt == tmp){
                System.out.println("A win");
            }
        }

        if(i % y == 0){
            tmp += 1;
            if(tt == tmp){
                System.out.println("B win");
            }
        }

        if(i % z == 0){
            tmp += 1;
            if(tt == tmp){
                System.out.println("C win");
            }
        }


    }
}