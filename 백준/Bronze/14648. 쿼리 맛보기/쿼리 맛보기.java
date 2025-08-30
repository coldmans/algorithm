import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main{

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long []wax = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            wax[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if(x == 2){
                int a = Integer.parseInt(st.nextToken())-1;
                int b = Integer.parseInt(st.nextToken())-1;
                int c = Integer.parseInt(st.nextToken())-1;
                int d = Integer.parseInt(st.nextToken())-1;
                long tmp = 0;
                for(int j = a; j <= b; j++){
                    tmp += wax[j];
                }
                for(int j = c; j<=d; j++){
                    tmp -= wax[j];
                }
                System.out.println(tmp);
            }
            else if(x == 1){
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                long tmp = 0;
                for(long j = a; j <= b; j++){
                    tmp += wax[Math.toIntExact(j)];
                }
                int t = Math.toIntExact(wax[a]);
                wax[a] = wax[b];
                wax[b] = t;
                System.out.println(tmp);

            }
        }

    }
}

