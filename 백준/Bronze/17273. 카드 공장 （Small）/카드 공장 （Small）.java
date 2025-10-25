import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int []arr = new int[N];
        int []brr = new int[N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            brr[i] = Integer.parseInt(st.nextToken());
        }

        boolean []is = new boolean[N];

        for(int i = 0; i < M; i++){
            int m = Integer.parseInt(br.readLine());
            for(int j = 0; j < N; j++){
                if(is[j] == false){
                    if(arr[j] <= m){
                        is[j] = true;
                    }
                }
                else{
                    if(brr[j] <= m){
                        is[j] = false;
                    }
                }
            }
        }
        int res = 0;
        for(int i = 0; i < N; i++){
            if(is[i]){
                res += brr[i];
            }
            else{
                res += arr[i];
            }
        }
        System.out.println(res);



    }
}
