import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            int t = s.length();
            t = (int) Math.pow(t, (double) 1 /2);
            char [][]graph = new char[t][t];
            int ctt = 0;
            for(int j = 0; j < t; j++){
                for(int x = 0; x < t; x++){
                    graph[j][x] = s.charAt(ctt);
                    ctt += 1;
                }
            }


            for(int j = t-1; j >= 0; j--){
                for(int x = 0; x < t; x++){
                    sb.append(graph[x][j]);
                }
            }


            System.out.println(sb);



        }
    }
}