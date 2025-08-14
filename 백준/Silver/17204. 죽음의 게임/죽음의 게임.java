import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int []mem = new int[N];
        for(int i = 0; i < N; i++){
            mem[i] = Integer.parseInt(br.readLine());
        }
        boolean []visited = new boolean[N];
        int ctt = 0;
        int num = 0;
        while(true){
            ctt += 1;
            if(mem[num] == K){
                System.out.println(ctt);
                break;
            }
            num = mem[num];
            if(visited[num] == true){
                System.out.println(-1);
                break;
            }
            else{
                visited[num] = true;
            }
        }





    }
}


