import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []arr = new int[100001];
        int j = -1;
        arr[1] = Integer.parseInt(br.readLine());
        if(arr[1] == 1){
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i-1] % 2 == 0){
                arr[i] = arr[i-1] / 2;
            }
            else{
                arr[i] = 3 * arr[i-1] + 1;
            }
            if(arr[i] == 1){
                j = i;
                break;
            }
        }
        System.out.println(j);

    }
}
