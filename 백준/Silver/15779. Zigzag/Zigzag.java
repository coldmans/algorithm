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

        int i = 0;
        int j = i+2;
        while(j < n){
            boolean fa = false;

            for(int y = i+1; y < j; y++){
                if((arr[y-1] <= arr[y] && arr[y] <= arr[y+1]) || (arr[y-1] >= arr[y] && arr[y] >= arr[y+1])){
                    fa = true;
                }
            }

            if(!fa){

                maxi = j-i + 1;
                j += 1;
            }
            else{

                i += 1;
                j += 1;

            }
        }

        System.out.println(maxi);

    }
}