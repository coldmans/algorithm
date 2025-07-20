import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph = new int[9][9];

    static boolean isValid(int row, int col, int num) {
        // 행 검사
        for(int i = 0; i < 9; i++) {
            if(graph[row][i] == num) return false;
        }

        // 열 검사
        for(int i = 0; i < 9; i++) {
            if(graph[i][col] == num) return false;
        }

        // 3x3 박스 검사
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for(int i = boxRow; i < boxRow + 3; i++) {
            for(int j = boxCol; j < boxCol + 3; j++) {
                if(graph[i][j] == num) return false;
            }
        }
        return true;
    }




    static boolean recur(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(graph[i][j] == 0){
                    for(int n = 1; n <10; n++){
                        if(isValid(i,j,n)){
                            graph[i][j] = n;
                            if(recur()) return true;
                            graph[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        recur();

        for (int[] ints : graph) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.exit(0);

    }
}
