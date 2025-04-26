import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [][] A = new int [N][M];

        for(int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                A[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                int tmp = scanner.nextInt();
                if (A[i][j] == tmp){
                    A[i][j] = 0;
                }
                else{
                    A[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j< M; j++){
                System.out.printf(A[i][j] + " ");
            }
            System.out.println();
        }

    }
}