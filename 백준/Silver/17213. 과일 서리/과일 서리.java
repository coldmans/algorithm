import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static long fac(int x, int y){
        if(x - y < y){
            y = x-y;
        }
        long tmp = 1;
        for(int i = x; i > x - y; i--){
            tmp *= i;
        }
        
        for(int j = y; j > 0; j--){
            tmp /= j;
        }
        return tmp;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int wax = M - 1;
        int way = M - N;

        System.out.println(fac(wax, way));



    }
}


