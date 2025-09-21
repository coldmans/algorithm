import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char [][] arr = new char[N][M];
        int ctt = 0;

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < M; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == '-'){
                    if(j > 0){
                        if(arr[i][j-1] == '-'){
                            continue;
                        }
                    }
                    ctt += 1;
                }
            }
        }

        for(int i = 0 ; i < M; i++){
            for(int j = 0; j < N; j++){
                if(arr[j][i] == '|'){
                    if(j > 0){
                        if(arr[j-1][i] == '|'){
                            continue;
                        }
                    }
                    ctt += 1;
                }
            }
        }

        System.out.println(ctt);




    }
}

