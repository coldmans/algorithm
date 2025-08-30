import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Main{

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String []input = br.readLine().split("[:.|#]");
        int tmp = 0;
        for(int i = 0; i < input.length; i++){
            tmp += Integer.parseInt(input[i]);
        }
        System.out.println(tmp);
    }
}

