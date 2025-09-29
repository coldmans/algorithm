import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int []arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int u = -1;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == -1){
                u = i;
            }
        }
        int i = u - 1;
        int mini = Integer.MAX_VALUE;
        int minj = Integer.MAX_VALUE;
        int j = u + 1;
        while(i >= 0){
            if(mini > arr[i]){
                mini = arr[i];
            }
            i -= 1;
        }

        while(j < n){
            if(minj > arr[j]){
                minj = arr[j];
            }
            j += 1;
        }

        System.out.println(mini + minj);



    }
}

