import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());

        long t = X*10;
        if(X == Y){
            System.out.println(-1);
            System.exit(0);
        }

        long i = 0;
        long j = t;

        long p = Y * 100 / X;

        while(i < j){
            long mid = (i + j)/2;
            if((Y+mid) * 100 / (X+mid) != p){
                j = mid;
            }
            else{
                i = mid+1;
            }
        }

        if(j == X*10){
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(j);
        

    }
}


