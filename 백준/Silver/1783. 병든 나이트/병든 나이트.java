import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(N == 1){
            System.out.println(1);
            System.exit(0);
        }
        if(N == 2){
            int res = (M+1) / 2;
            if(res >= 4) res = 4;
            System.out.println(res);
            System.exit(0);
        }
        else{
            int res = 0;
            res = M - 2;
            if(res < 4){
                res = M;
                if(res > 4) res = 4;
            }
            System.out.println(res);
        }









    }
}
