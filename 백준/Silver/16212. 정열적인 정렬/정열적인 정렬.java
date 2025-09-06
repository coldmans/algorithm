import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int []arr = new int[t];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < t; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i < t; i++){
            System.out.print(arr[i] + " ");
        }
    }
}



