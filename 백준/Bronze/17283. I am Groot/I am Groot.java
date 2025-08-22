import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int []dy = {1, 0, -1, 0};
    static int []dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int R = Integer.parseInt(br.readLine());
        int tmp = 0;
        int t = 2;
        while(N > 5){
            N = N * R/100;
            if(N <= 5) break;
            tmp += N * t;
            t *= 2;

        }
        System.out.println(tmp);


    }
}


