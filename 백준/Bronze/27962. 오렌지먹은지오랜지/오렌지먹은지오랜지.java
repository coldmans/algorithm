import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        if(s.charAt(0) != s.charAt(N-1)){
            System.out.println("YES");
            System.exit(0);
        }
        else{
            for(int i = 1; i <= N; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < i; j++){
                    sb.append(s.charAt(j));
                }
                StringBuilder sb2 = new StringBuilder();
                for(int j = N-i; j < N; j++){
                    sb2.append(s.charAt(j));
                }
                int res = 0;
                for(int k = 0; k < i; k++){
                    if(sb.charAt(k) != sb2.charAt(k)){
                        res += 1;
                        if(res > 1){
                            break;
                        }
                    }
                }
                if(res == 1){
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }

        System.out.println("NO");

    }



}
