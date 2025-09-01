import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        Integer M = Integer.parseInt(st.nextToken())+1;
        String N = M +"";

        int wax = N.length();
        int x = 1;
        long y = 0;
        while(x <= wax) {
            y += 9 * (x - 1) * (long) Math.pow(10, x - 2);
            y %= 1234567;
            x += 1;
        }
        long tmp = Long.parseLong(N);
        long ttmp = (long) Math.pow(10, x-2);
        int g = (tmp+"").length();
        long gas = ((tmp - ttmp) * g) % 1234567;

        long ggg = (y + gas) % 1234567;

        System.out.println(ggg);

    }
}
