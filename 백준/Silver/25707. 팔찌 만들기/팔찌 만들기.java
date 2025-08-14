import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String []input = bf.readLine().split(" ");
        int []realInput = new int[N];
        for(int i = 0; i < N; i++){
            realInput[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(realInput);
        int res = 0;
        for(int i = 1; i < N; i++){
            res += realInput[i] - realInput[i-1];
        }
        System.out.println(res*2);





    }
}


