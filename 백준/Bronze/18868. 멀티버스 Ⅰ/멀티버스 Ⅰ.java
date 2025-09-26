import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int [][]arr = new int[a][b];

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < b; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int res = 0;
        for(int k = 0; k < a; k++){
            for(int h = k+1; h < a; h++){
                boolean is = true;
                for(int i = 0; i < b; i++){
                    for(int j = i+1; j < b; j++) {
                        if (!is) break;
                        if (arr[k][i] < arr[k][j] && arr[h][i] >= arr[h][j]) {
                            is = false;
                        } else if (arr[k][i] == arr[k][j] && arr[h][i] != arr[h][j]) {
                            is = false;
                        } else if (arr[k][i] > arr[k][j] && arr[h][i] <= arr[h][j]) {
                            is = false;
                        }
                    }
                }
                if(is){
                    res += 1;
                }
            }
        }

        System.out.println(res);






    }
}

