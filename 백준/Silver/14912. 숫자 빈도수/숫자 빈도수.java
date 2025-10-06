import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);

        int res = 0;
        for(int i = 1; i <= n; i++){
            String s = i + "";
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == d){
                    res += 1;
                }
            }
        }
        System.out.println(res);

    }
}
