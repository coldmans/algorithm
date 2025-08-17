import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long expectedSum = (long)(N-1) * N / 2;  // 1부터 N-1까지의 합
        long actualSum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            actualSum += Integer.parseInt(st.nextToken());
        }
        
        System.out.println(actualSum - expectedSum);
    }
}