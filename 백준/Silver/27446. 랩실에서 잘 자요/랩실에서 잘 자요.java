import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int []arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int t = Integer.parseInt(st.nextToken());
            arr[t] = 1;
        }

        int res = 0;
        int tmp = -1;
        for(int i = 1; i <= N; i++){
            if(arr[i] == 1) continue;
            if(tmp < 0) tmp = i;
            else{
                if(i - tmp > 3){
                    tmp = i;
                }
                else{
                    for(int j = tmp; j <= i; j++){
                        arr[j] = 0;
                    }
                    tmp = i;
                }
            }
        }
        

        int i = 1;
        int k = 0;
        while(i <= N){
            if(arr[i] == 0){
                i += 1;
                k += 1;
            }
            else{
                if(k == 0){
                    i += 1;
                    continue;
                }
                else{
                    res += 5 + 2*k;
                    k = 0;
                }
            }
        }

        if(k != 0){
            res += 5 + 2 * k;
        }
        System.out.println(res);






    }
}

