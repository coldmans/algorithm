import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;

    static void nal(String sb, int k){
        min = Math.min(min, sb.length());
        if(k == N){
            return;
        }
        for(int i = 0; i < sb.length(); i++){
            for(int j = i+1; j < sb.length(); j++){
                if(sb.charAt(i) == 'X' || sb.charAt(j) =='X') continue;
                if(sb.charAt(i) == sb.charAt(j)){
                    nal(sb.substring(0,i) + sb.substring(j+1, sb.length()), k+1);
                }
            }
        }
    }

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        min = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        nal(s, 0);
        System.out.println(min);


    }
}
