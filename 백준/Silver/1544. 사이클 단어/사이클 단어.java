import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < p; i++){
            String s = br.readLine();
            if(set.contains(s)){
                continue;
            }
            res += 1;
            set.add(s);
            while(true){
                s = s.substring(1) +s.charAt(0);
                if(set.contains(s)){
                    break;
                }
                set.add(s);
            }
        }
        System.out.println(res);

    }
}
