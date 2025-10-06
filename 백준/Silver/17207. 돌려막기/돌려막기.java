import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr = new int[5][5];
        int [][] trr = new int[5][5];

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                trr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int []res = new int[5];

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++) {
                    res[i] += arr[i][k] * trr[k][j];
                }
            }
            min = Math.min(min, res[i]);
        }

        for(int i = 4; i >= 0; i--){
            if(res[i] == min){
                if(i == 0){
                    System.out.println("Inseo");
                }
                else if(i == 1){
                    System.out.println("Junsuk");
                }
                else if(i == 2){
                    System.out.println("Jungwoo");
                }
                else if(i == 3){
                    System.out.println("Jinwoo");
                }
                else if(i == 4){
                    System.out.println("Youngki");
                }
                break;
            }
        }

    }
}
