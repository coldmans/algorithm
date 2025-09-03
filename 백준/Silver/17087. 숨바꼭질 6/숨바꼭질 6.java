import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int uclid(int x, int y){
        while(y != 0){
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int []dong = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(st.nextToken());
            if(x >= S){
                dong[i] = x - S;
            }
            else{
                dong[i] = S - x;
            }
        }

        int tmp = dong[0];
        for(int i = 1; i < N; i++){
            tmp = uclid(tmp, dong[i]);
        }
        System.out.println(tmp);




    }
}
