import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int []sudo = new int[N];
        st = new StringTokenizer(br.readLine());
        long sum = 0L;
        for(int i = 0; i < N; i++){
            sudo[i] = Integer.parseInt(st.nextToken());
            sum += sudo[i];
        }
        boolean []toggle = new boolean[N];

        int Q = Integer.parseInt(br.readLine());
        System.out.println(sum);
        for(int i = 0; i < Q; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a == 2){
                int b = Integer.parseInt(st.nextToken()) - 1;
                if(!toggle[b]){
                    toggle[b] = true;
                }
                else{
                    toggle[b] = false;
                }

                if(!toggle[b]){
                    sum += sudo[b];
                }
                else{
                    sum -= sudo[b];
                }

                System.out.println(sum);
            }
            else{
                int b = Integer.parseInt(st.nextToken()) - 1;
                int c = Integer.parseInt(st.nextToken());

                if(!toggle[b]){
                    sum = sum - sudo[b] + c;
                }

                sudo[b] = c;

                System.out.println(sum);
            }

        }





    }
}
