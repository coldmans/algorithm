import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long g = Long.parseLong(br.readLine());
        if(g == 0){
            System.out.println("NO");
            System.exit(0);
        }
        long []arr = new long[21];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= 20; i++){
            arr[i] = arr[i-1] * i;
        }
        for(int i = 20; i >= 0; i--){
            if(g > arr[i]){
                g -= arr[i];
            }
            else if(g == arr[i]){
                System.out.println("YES");
                System.exit(0);
            }
        }
        if(g == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}