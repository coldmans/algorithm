import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        String [] input2 = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(input[i]);
        }
        for(int i = 0; i < N - 1; i++){
            set.remove(input2[i]);
        }
        System.out.println(set.toArray()[0]);
    }
}


