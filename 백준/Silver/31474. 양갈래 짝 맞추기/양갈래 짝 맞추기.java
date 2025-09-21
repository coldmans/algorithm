import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long result = 1L;
        
        for (int i = N - 1; i >= 1; i -= 2) {
            result *= i;
        }
        
        System.out.println(result);
    }
}