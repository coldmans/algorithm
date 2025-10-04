import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    static int []p;

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int G = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        p = new int[G+1];
        for(int i = 0; i < G+1; i++){
            p[i] = i;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < P; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        int res = 0;
        for(int i = 0; i < P; i++){
            int n = list.get(i);
            int tmp = find(p[n]);
            if(tmp == 0){
                break;
            }
            res++;
        }
        System.out.println(res);
    }
    static int find(int n){
        if(p[n] != n){
            p[n] = find(p[n]);
        }

        return p[n]--;
    }
}
