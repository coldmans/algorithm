import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char [][]chars = new char[N][M];
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                chars[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(chars[i][j] != '.'){
                    chars[i][M-j-1] = chars[i][j];
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sb.append(chars[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
