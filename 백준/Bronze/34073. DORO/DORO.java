import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            System.out.print(input[i] + "DORO ");
        }
    }
}


