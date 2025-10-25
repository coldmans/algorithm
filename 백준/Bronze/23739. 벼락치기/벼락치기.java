import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int []brr = arr.clone();
        int ctt = 0;
        int res = 30;

        for(int i = 0; i < n; i++){
            if(brr[i] < res){
                res -= brr[i];
                brr[i] = 0;
            }
            else{
                brr[i] -= res;
                res = 30;
            }
        }
        for(int i = 0; i < n; i++){
            if(brr[i] * 2 > arr[i]){
                continue;
            }
            ctt += 1;
        }
        System.out.println(ctt);



    }
}
