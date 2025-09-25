import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        BigDecimal A = new BigDecimal(st.nextToken());
        BigDecimal B = new BigDecimal(st.nextToken());

        System.out.println(A.divide(B, 10000, BigDecimal.ROUND_HALF_UP));

    }
}

