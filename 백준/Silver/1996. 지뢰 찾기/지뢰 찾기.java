import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int [] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static int [] dx = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] graph = new int[N][N];
        for(int i = 0; i < N; i++){
            String inputs = br.readLine();
            String []input = new String[N];
            for(int k = 0; k < N; k++){
                input[k] = String.valueOf(inputs.charAt(k));
            }

            for(int j = 0; j < N; j++){
                if(input[j].equals(".")) continue;
                graph[i][j] = Integer.MIN_VALUE;
                if((Integer.parseInt(input[j]) > 0)){
                    for(int k = 0; k < 8; k++){
                        int y = dy[k] + i;
                        int x = dx[k] + j;
                        if(y >= 0 && y < N && x >= 0 && x < N && graph[y][x] >= 0){
                            graph[y][x] += Integer.parseInt(input[j]);
                        }
                    }
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(graph[i][j] < 0){
                    System.out.print("*");
                }
                else if(graph[i][j] >= 10){
                    System.out.print("M");
                }
                else{
                    System.out.print(graph[i][j]);
                }
            }
            System.out.println();
        }

    }
}


