import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []recur = new int[n+1];
        int []dynamic = new int[n+1];

        recur[n] = 1;

        for(int i = n; i > 2; i--){
            if(i-1 <= 2) continue;
            recur[i-1] += recur[i];
            if(i-2 <= 2) continue;
            recur[i-2] += recur[i];
        }
        System.out.print(Arrays.stream(recur).sum()+1 + " ");

        System.out.println(n-2);


    }
}