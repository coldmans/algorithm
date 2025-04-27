import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [][] li = new int [N][N];
        for(int i = 1; i <= N; i++){
            if(i % 2 == 1){
                for(int j = 1; j <= N; j++){
                    li[j-1][i-1] = j;
                }
            }
            else{
                for(int j = 1; j <= N; j++){
                    li[j-1][i-1] = N-j+1;
                }
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(li[i][j]);
            }
            System.out.println();
        }
    }
}