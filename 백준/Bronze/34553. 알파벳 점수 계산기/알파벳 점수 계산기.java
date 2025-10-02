import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int []dp = new int[s.length()+1];
        dp[0] = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) > s.charAt(i-1)){
                dp[i] = dp[i-1] + 1;
            }
            else{
                dp[i] = 1;
            }
        }

        int sum = Arrays.stream(dp).sum();
        System.out.println(sum);



    }

}
