import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int c = -1;

        int [][]arr = new int[R][C];
        for(int i = 0; i < R; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < C; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(c == -1 && arr[i][j] == -1) c = i;
            }
        }


        for(int t = 0; t < T; t++){
            int [][] newArr = new int[R][C];
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    if(arr[i][j] > 0){
                        int ctt = 0;
                        if(i - 1 >= 0){
                            if(j == 0 && i - 1 == c + 1);
                            else {
                                newArr[i - 1][j] += arr[i][j] / 5;
                                ctt += 1;
                            }
                        }
                        if(i + 1 < R){
                            if(j == 0 && i + 1 == c);
                            else {
                                newArr[i + 1][j] += arr[i][j] / 5;
                                ctt += 1;
                            }
                        }
                        if(j - 1 >= 0){
                            if((i == c || i == c+1) && j - 1 == 0);
                            else {
                                newArr[i][j - 1] += arr[i][j] / 5;
                                ctt += 1;
                            }
                        }
                        if(j + 1 < C){
                            newArr[i][j+1] += arr[i][j] / 5;
                            ctt += 1;
                        }
                        newArr[i][j] += arr[i][j] - (arr[i][j] / 5) * ctt;
                    }
                }
            }

            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    arr[i][j] = newArr[i][j];
                }
            }

            int top = c;

            for (int i = top - 1; i > 0; i--) {
                arr[i][0] = arr[i - 1][0];
            }

            for (int i = 0; i < C - 1; i++) {
                arr[0][i] = arr[0][i + 1];
            }

            for (int i = 0; i < top; i++) {
                arr[i][C - 1] = arr[i + 1][C - 1];
            }

            for (int i = C - 1; i > 1; i--) {
                arr[top][i] = arr[top][i - 1];
            }
            arr[top][1] = 0;

            int bottom = c + 1;

            for (int i = bottom + 1; i < R - 1; i++) {
                arr[i][0] = arr[i + 1][0];
            }

            for (int i = 0; i < C - 1; i++) {
                arr[R - 1][i] = arr[R - 1][i + 1];
            }

            for (int i = R - 1; i > bottom; i--) {
                arr[i][C - 1] = arr[i - 1][C - 1];
            }
            for (int i = C - 1; i > 1; i--) {
                arr[bottom][i] = arr[bottom][i - 1];
            }
            arr[bottom][1] = 0;

        }
        
        int sum = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] > 0) { // 공기청정기(-1) 제외하고 합산
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);


    }
}
