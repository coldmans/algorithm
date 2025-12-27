import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int []dp = new int[11];
        dp[1] = arr[0];
        for(int i = 1; i < 11; i++){
            dp[i] = dp[i-1] + arr[i-1];
        }

        int tmp = 100;
        int res = 0;
        for(int i = 0; i < 11; i++){
            if(Math.abs(dp[i] - 100) <= tmp){
                if(Math.abs(dp[i] - 100) == tmp){
                    if(res < dp[i]){
                        res = dp[i];
                        tmp = Math.abs(dp[i]-100);
                    }
                }
                else{
                    res = dp[i] ;
                    tmp = Math.abs(dp[i]-100);
                }
            }
        }
        System.out.println(res);



    }
}