import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int M = 1234567891;
        long sum = 0;
        long tmp = 1;
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                sum += (s.charAt(i) - 'a' + 1) * Math.pow(31,i) % M;
                sum = sum % M;
            }
            else {
                sum += (s.charAt(i) - 'a' + 1) * (tmp * 31) % M;
                sum = sum % M;
                tmp = tmp * 31 % M;
                tmp = tmp % M;
            }
        }

        System.out.println(sum);







    }
}