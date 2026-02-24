import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int M = 1234567891;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += (s.charAt(i) - 'a' + 1) * Math.pow(31, i) % M;
        }

        System.out.println(sum);







    }
}