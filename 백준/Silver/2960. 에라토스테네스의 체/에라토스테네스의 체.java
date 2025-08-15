import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int K = Integer.parseInt(nm[1]);
        int ctt = 0;
        int []che = new int[N+1];
        for(int i = 2; i <= N; i++){
            if(che[i] == 1) continue;
            for(int j = i; j <= N; j += i){
                if(che[j] == 1) continue;
                che[j] = 1;
                ctt++;
                if(ctt == K){
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }

    }
}


