import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String []arr = new String[N];
        int [][]res = new int[M][4];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i].charAt(j) == 'A'){
                    res[j][0] += 1;
                }
                else if(arr[i].charAt(j) == 'C'){
                    res[j][1] += 1;
                }
                else if(arr[i].charAt(j) == 'G'){
                    res[j][2] += 1;
                }
                else if(arr[i].charAt(j) == 'T'){
                    res[j][3] += 1;
                }
            }
        }

        int result = 0;

        for(int i = 0; i < M; i++){
            int t = 0;
            for(int j = 0; j < 4; j++){
                if(res[i][j] > t){
                    t = res[i][j];
                }
            }

            for(int j = 0; j < 4; j++){
                if(res[i][j] == t){
                    if(j == 0){
                        sb.append('A');
                    }
                    else if(j == 1){
                        sb.append('C');
                    }
                    else if(j == 2){
                        sb.append('G');
                    }
                    else{
                        sb.append('T');
                    }
                    result += N-t;
                    break;
                }
            }
        }
        System.out.println(sb);
        System.out.println(result);




    }
}

