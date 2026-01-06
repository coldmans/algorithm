import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static StringBuilder s;
    static public void recur(StringBuilder sb){
        
        if(sb.compareTo(s) == 0){
            System.out.println(1);
            System.exit(0);
        }

        if(sb.length() > 1){
            if(sb.charAt(sb.length()-1) == 'A'){
                sb.deleteCharAt(sb.length()-1);
                recur(sb);
                sb.append('A');
            }
            if(sb.charAt(0) == 'B'){
                sb.deleteCharAt(0);
                sb.reverse();
                recur(sb);
                sb.append('B');
                sb.reverse();
            }
        }
        return;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = new StringBuilder(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());
        recur(sb);
        System.out.println(0);




    }
}