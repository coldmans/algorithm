import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int []arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = N - 1;
        int ans = 0;

        while(i < j){
            if(arr[i] + arr[j] == M){
                ans += 1;
                i += 1;
                j -= 1;
            }
            else if(arr[i] + arr[j] > M){
                j -= 1;
            }
            else{
                i += 1;
            }
        }



        System.out.println(ans);


    }
}
