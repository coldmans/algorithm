import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            if(line == null){
                break;
            }
            st = new StringTokenizer(line);
            String s = st.nextToken();
            String s2 = st.nextToken();

            int i = 0;
            int j = 0;
            while(j < s2.length() && i < s.length()){
                if(s.charAt(i) != s2.charAt(j)){
                    j += 1;
                }
                else{
                    i += 1;
                    j += 1;
                }
            }

            if(i == s.length()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}