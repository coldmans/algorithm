import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    static char[][] arr;

    static void recur(int x, int y, int N, boolean blank){
        if(blank){
            for(int i = x; i < x + N; i++){
                for(int j = y; j < y + N; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1){
            arr[x][y] = '*';
            return;
        }

        int size = N / 3;
        int count = 0;
        for(int i = x; i < x+ N; i += size){
            for(int j = y; j < y + N; j += size){
                count ++;
                if(count == 5){
                    recur(i, j , size, true);
                }else{
                    recur(i, j, size, false);
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new char[N][N];

        recur(0, 0, N, false);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);




    }
}