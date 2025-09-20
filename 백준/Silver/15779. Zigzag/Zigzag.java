import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int k = 3;
        int maxi = 0;
        if(n <= 2){
            maxi = n;
        }
        else{
            maxi = 2;
        }
        while(k <= n){
            int j = k;
            boolean fails = false;
            while(j <= n) {
                for (int l = j-k+1; l < j-1; l++) {
                    if ((arr[l - 1] <= arr[l] && arr[l] <= arr[l + 1]) || (arr[l - 1] >= arr[l] && arr[l] >= arr[l + 1])) {
                        fails = true;
                    }
                }
                j += 1;
                if(!fails){
                    maxi = k;
                    break;
                }
                fails = false;
            }
            k += 1;
        }
        System.out.println(maxi);

    }
}