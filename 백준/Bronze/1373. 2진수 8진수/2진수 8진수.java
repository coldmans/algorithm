import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int pad = (3 - (len % 3)) % 3;
        if(pad > 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pad; i++) sb.append('0');
            sb.append(s);
            s = sb.toString();
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i+= 3){
            String part = s.substring(i, i+3);
            int val = Integer.parseInt(part, 2);
            result.append(val);
        }
        System.out.println(result.toString().replaceFirst("^0+(?!$)", ""));

    }
}
