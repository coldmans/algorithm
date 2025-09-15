import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < n; j++){
                set.add(Integer.parseInt(st.nextToken()));
            }
            int m  = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int tmp = Integer.parseInt(st.nextToken());
                if(set.contains(tmp)){
                    sb.append(1 + "\n");
                }
                else{
                    sb.append(0 + "\n");
                }
            }
        }
        System.out.println(sb);


    }
}