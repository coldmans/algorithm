import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int []arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int i = N-1;
        int wax = 0;
        while(i >= 0){
            int tmp = arr[i];
            int res = 1;
            int t = 0;
            int j;
            for (j = i - 1; j >= 0; j--) {
                if(res == M) break;
                t += arr[j];
                if (t == tmp) {
                    t = 0;
                    res++;
                }
            }
            i = j;


            wax += tmp;
        }

        System.out.println(wax);

    }
}
