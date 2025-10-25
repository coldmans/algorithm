import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        for(int i = 0; i < test; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String d = st.nextToken();
            int s1 = 0;
            int d1 = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != d.charAt(j)){
                    if(s.charAt(j) == '1') s1 += 1;
                    else d1 += 1;
                }
            }
            int res = 0;
            while(s1 > 0 && d1 > 0){
                res += 1;
                d1 -= 1;
                s1 -= 1;
            }
            res += d1 + s1;
            System.out.println(res);

        }

    }
}
